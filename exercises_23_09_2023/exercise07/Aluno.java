package exercises_23_09_2023.exercise07;

public class Aluno {

    private String nome;
    private double p1;
    private double p2;


    //construtor
    public Aluno(String nome, double p1, double p2) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", p1=" + p1 + ", p2=" + p2 + "]";
    }
}