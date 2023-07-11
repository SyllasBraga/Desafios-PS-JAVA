package primeiro.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class PrimeiroDesafio {
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for (int i =0; i<N; i++){
            int numeroRecebido = sc.nextInt();
            if (numeroRecebido >0){
                if (numeroRecebido %2 == 0){
                    numerosPares.add(numeroRecebido);
                }else{
                    numerosImpares.add(numeroRecebido);
                }
            }
        }

        /*Poderia ser substituido por algum algoritimo de ordenação como o Bubble Sort,
        mas dei preferência em utilizar algo que a linguagem já entrega*/
        Collections.sort(numerosPares);
        Collections.sort(numerosImpares, Collections.reverseOrder());

        for(Integer j : Stream.concat(numerosPares.stream(), numerosImpares.stream())
                .toList()){
            System.out.println(j);
        }
    }
}
