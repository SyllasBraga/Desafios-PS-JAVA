package terceiro.desafio;

import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k =  sc.nextInt();
        int numeroAlvos = 0;

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                int diferenca = arr[i] - arr[j];
                if (diferenca == k){
                    numeroAlvos++;
                }
            }
        }
        System.out.println(numeroAlvos);
    }
}
