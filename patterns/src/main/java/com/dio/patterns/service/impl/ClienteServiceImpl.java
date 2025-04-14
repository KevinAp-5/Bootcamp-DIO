package com.dio.patterns.service.impl;

import org.springframework.stereotype.Service;

import com.dio.patterns.model.Cliente;
import com.dio.patterns.model.ClienteRepository;
import com.dio.patterns.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com o ID: " + id));
    }

    @Override
    public void inserir(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Cliente clienteSalvo = buscarPorId(id);
        clienteSalvo.setNome(cliente.getNome());
        clienteRepository.save(clienteSalvo);
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

}
