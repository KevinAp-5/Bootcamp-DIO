package entities;

public class PetMachine {
    private int agua;
    private int shampoo;
    private Pet pet;
    private boolean maquinaLimpa;

    public PetMachine() {
        this.agua = 0;
        this.shampoo = 0;
        this.pet = null;
        this.maquinaLimpa = true;
    }

    public void abasteceberAgua() {
        if (agua == 30) {
            System.out.println("O nível de água já está no máximo.");
            return;
        }
        if (2 + agua >= 30) {
            agua = 30;
            return;
        }
        agua += 2;
    }

    public void abasteceberShampoo() {
        if (shampoo == 10) {
            System.out.println("O nível de shampoo já está no máximo.");
            return;
        }

        if (shampoo + 2 >= 10) {
            shampoo = 10;
            return;
        }
        shampoo += 2;
    }

    public void adicionarPet(Pet pet) {
        if (this.pet != null) {
            System.out.println("A máquina já tem um pet");
            return;
        }
        if (!maquinaLimpa) {
            System.out.println("Limpe a máquina antes de adicionar outro pet");
            return;
        }
    }

    public void darBanho() {
        if (this.pet == null) {
            System.out.println("Não tem nenhum pet na máquina.");
            return;
        }

        if (agua - 10 <= 0 || shampoo - 2 <= 0) {
            System.out.println("Abasteça a agua e shampoo para poder limpar o pet");
            return;
        }

        agua -= 10;
        shampoo -= 2;
        this.pet.setLimpo(true);
        maquinaLimpa = false;
    }

    public void removerPet() {
        if (pet == null) {
            System.out.println("Não tem pets na máquina");
            return;
        }
        this.pet = null;
    }

    public void limparMaquina() {
        if (maquinaLimpa) {
            System.out.println("A máquina já está limpa.");
            return;
        }
        if (pet != null) {
            System.out.println("Tire o pet da máquina para poder limpa-lá.");
            return;
        }

        if (agua - 3 <= 0 || shampoo - 1 <= 0) {
            System.out.println("Abasteça água e shampoo para poder limpar a máquina");
            return;
        }

        agua -= 3;
        shampoo -= 1;
    }

    public void nivelAgua() {
        System.out.println("Nivel da água: " + agua + "L");
    }

    public void nivelShampoo() {
        System.out.println("Nìvel de shampoo: " + shampoo + "L");
    }

    public boolean temPet() {
        return pet != null;
    }
}
