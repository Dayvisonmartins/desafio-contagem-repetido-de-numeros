/*
Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece, ou seja,
deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de valor.

Entrada
A primeira linha de entrada contem um único inteiro N, que indica a quantidade de valores que serão lidos para
X (1 ≤ N ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do que 20 vezes na entrada de dados.

Saída
Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece na entrada por ordem crescente de valor.*//*

Exemplo de Entrada	Exemplo de Saída
7, 8, 10, 8, 260, 4, 10, 10
       4 aparece 1 vez(es)
        8 aparece 2 vez(es)
        10 aparece 3 vez(es)
        260 aparece 1 vez(es)*/
package contagem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class minhaClasse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

//declare as variaveis corretamente e continue a sua solução

        ArrayList<Integer> lista = new ArrayList<Integer>(); //array de lista

        int N = sc.nextInt();
        while(N --> 0)
            lista.add(sc.nextInt());

        SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
        lista.forEach(id -> contaQuant.compute(id, (Integer, X ) -> (X == null ? 1 : X + 1)));


        contaQuant.entrySet().forEach(entry->{
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}