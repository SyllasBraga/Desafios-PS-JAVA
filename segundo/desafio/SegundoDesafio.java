package segundo.desafio;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        BigDecimal valorRecebido = scanner.nextBigDecimal();

        int notasTroco = valorRecebido.intValue();
        int moedasTroco = valorRecebido.remainder(BigDecimal.ONE).multiply(BigDecimal.valueOf(100)).intValue();
        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            int qtdNotas = notasTroco / notas[i];
            notasTroco = notasTroco % notas[i];
            System.out.println(qtdNotas + " nota(s) de R$" + notas[i] + ".00");
        }

        moedasTroco += notasTroco * 100;

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            int qtdMoedas = moedasTroco / moedas[i];
            moedasTroco = moedasTroco % moedas[i];
            double valorMoedaDouble = (double) moedas[i] / 100;
            System.out.println(qtdMoedas + " moeda(s) de R$" + String.format("%.2f", valorMoedaDouble));
        }
    }
}
