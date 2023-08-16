package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

/**
 * Desafio: https://www.hackerrank.com/challenges/mini-max-sum/problem
 *
 *Dados 5 inteiros positivos:
 * - Encontre os valores mínimo e máximo que podem ser calculados somando exatamente 4 dos 5 inteiros. 
 * - Em seguida, imprima os respectivos valores mínimo e máximo em uma unica linha.
 */

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        long valueMin = arr.get(0); // valor minimo da lista
        long valueMax = arr.get(0); // valor maximo da lista

        long resulMin = 0; // resultado minimo
        long resulMax = 0; // resultado maximo

        //laço para identificar valores min/max e soma total
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > valueMax) {
                valueMax = arr.get(i);
            }
            if (arr.get(i) < valueMin) {
                valueMin = arr.get(i);
            }
            resulMax += arr.get(i);
        }

        resulMin = resulMax - valueMax; // resultado minimo final
        resulMax = resulMax - valueMin; // resultado maximo final

        System.out.println(resulMin + " " + resulMax);

    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList();

        arr.add(7);
        arr.add(69);
        arr.add(2);
        arr.add(221);
        arr.add(8974);

        miniMaxSum(arr);

    }
}
