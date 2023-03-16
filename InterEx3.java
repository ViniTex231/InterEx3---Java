import java.util.Scanner;
public class InterEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho do vetor? ");
        int qtd = sc.nextInt();

        int[] vetor = new int[qtd];

        System.out.println("Quais são os valores? ");
        for (int i = 0; i < qtd; i++){
            vetor[i] = sc.nextInt();

        }

    }