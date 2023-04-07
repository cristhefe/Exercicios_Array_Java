import java.util.Scanner;

public class Exercicios_Array_Java {

    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);

        int numAluno = 5;
        double[] notaAluno = new double[numAluno];

        for (int i = 0; i < notaAluno.length; i++) {
            System.out.println("Insira a nota do " + (i + 1) + "° aluno.");
            notaAluno[i] = ler.nextInt();

        }
        for (int i = 0; i < numAluno; i++) {
            System.out.println("-->" + notaAluno[i]);


        }

    }
}

