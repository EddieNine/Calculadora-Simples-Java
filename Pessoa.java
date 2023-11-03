public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void aniversario() {
        idade++;
    }

    public void apresentar() {
        System.out.println("Ola, meu nome e " + nome + " e tenho " + idade + " anos.");
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Joao", 25);
        pessoa1.apresentar();
        pessoa1.aniversario();
        pessoa1.apresentar();

        Pessoa pessoa2 = new Pessoa("Maria", 30);
        pessoa2.apresentar();
        pessoa2.aniversario();
        pessoa2.apresentar();
    }
}
