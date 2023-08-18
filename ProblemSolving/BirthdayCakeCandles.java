import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Desafio: https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 * Você está encarregado do bolo para o aniversário de uma criança. 
 * Você decidiu que o bolo terá uma vela para cada ano de idade total. 
 * Eles só conseguirão apagar a vela mais alta. Conte quantas velas são mais altas.
 * 
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {

        List<Integer> velas = Arrays.asList(4,4,1,3);

        birthdayCakeCandles(velas);
    }

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     * 
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        
        Collections.sort(candles); //ordena lista

        int maiorNumero = candles.get(candles.size()-1); //pega valor do ultimo index
        int qtdVezes = 0;

        for(Integer n : candles) {
            if(n == maiorNumero) {
                qtdVezes++; //quantidade de vezes que aparece o maior numero
            }
        }
        
        System.out.println(qtdVezes);
        
        return qtdVezes;
    }
}
