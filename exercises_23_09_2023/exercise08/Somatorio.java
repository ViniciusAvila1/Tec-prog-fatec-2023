package exercises_23_09_2023.exercise08;

import java.util.ArrayList;

public class Somatorio {

    public int n = 5;
    public int x[] = { 2, 7, 4, 3, 2 };
    public int y[] = { 1, 2, 3, 6, 5 };

    public static void main(String[] args) {

        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(2);
        x.add(7);
        x.add(4);
        x.add(3);
        x.add(2);

        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(1);
        y.add(2);
        y.add(3);
        y.add(6);
        y.add(5);

        int somatorioA = 0;
        int somatorioB = 0;
        int somatorioC = 0;
        int somatorioC2 = 0;

        // A
        for (int j = 0; j < 5; j++) {

            somatorioA += x.get(j) * j;
        }

        // B
        for (int j = 0; j < 5; j++) {

            somatorioB += (x.get(j) * (y.get(j)));
        }

        for (int j = 1; j < 4; j++) {

            somatorioC += (x.get(j)) * (Math.pow(y.get(j), 2));

            for(int i = 0; i < 5; i++){
                somatorioC2 += 3 * i;
            }
        }
        int resultado = somatorioC + somatorioC2; 
        
        System.out.println("RESULTADOS: \n" + "A: " + somatorioA + "\nB: " + somatorioB + "\nC: " + resultado);
    }

}