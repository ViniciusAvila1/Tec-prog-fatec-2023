package exercises_23_09_2023.exercise07;

public class Main {
    
    public static void main(String[] args) {

        // A
        Aluno a1 = new Aluno("Vinicius", 2, 9);

        // B
        a1.setNome("Pelé");
        a1.setP1(8);
        a1.setP2(6);

        // C
        System.out.println("Nome: " + a1.getNome());
        System.out.println("p1: " + a1.getP1());
        System.out.println("p2: " + a1.getP2());

        // D
        Aluno a2 = a1;

        // E

        a2.setP1(2);
        a2.setP2(10);

        System.out.println("\nMostrando saída após alterações:\n");
        System.out.println("Nome a1: " + a1.getNome());
        System.out.println("a1 p1: " + a1.getP1());
        System.out.println("a1 p2: " + a1.getP2());

        System.out.println(".....................");

        System.out.println("Nome a2: " + a2.getNome());
        System.out.println("a2 p1: " + a2.getP1());
        System.out.println("a2 p2: " + a2.getP2());

        // F
        
        /* Os valores não são diferentes, pois apontam para a mesma instância do objeto Aluno, ao mesmo endereço de memória.
         */

    }
}
