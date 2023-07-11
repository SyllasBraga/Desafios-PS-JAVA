package quarto.desafio;

import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int qtdLinhas = Integer.parseInt(sc.nextLine());
        String primeiraParteLinha;
        String segundaParteLinha;

        String[] linhas = new String[qtdLinhas];

        for (int i=0; i<linhas.length; i++){
            linhas[i] = sc.nextLine();
        }

        for (String linha : linhas){
            int metadeLinha = linha.length()/2;
            primeiraParteLinha = linha.substring(0,metadeLinha);
            segundaParteLinha = linha.substring(metadeLinha, linha.length());
            String fraseCompleta = new StringBuilder(segundaParteLinha + primeiraParteLinha).reverse().toString();
            System.out.println(fraseCompleta);
        }
    }
}
