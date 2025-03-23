package mapexercicios.eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nome, String atracao) {
        eventos.put(date, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        var eventoTree = new TreeMap<>(eventos);
        System.out.println(eventoTree);
    }

    public void proximoEvento() {
        LocalDate hoje = LocalDate.now();
        eventos.keySet().stream().
            filter(data -> data.isAfter(hoje) || data.isEqual(hoje))
            .sorted()
            .findFirst()
            .ifPresentOrElse(
                data -> System.out.println("Próximo evento: " + data + ", Evento: " + eventos.get(data)),
                () -> System.out.println("Não há eventos futuros.")
            );

    }
}
