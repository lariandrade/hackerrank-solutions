import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * Desafio: https://www.hackerrank.com/challenges/time-conversion/problem
 * Dado um horário no formato AM/PM de 12 horas, converta-o no formato de 24 horas.
 */
public class TimeConversion {

    public static void main(String[] args) throws ParseException {
        String time = "07:05:45PM";
        System.out.println(timeConversion(time));
    }

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

     public static String timeConversion(String s) throws ParseException {

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime time = LocalTime.parse(s, inputFormatter);

        return time.format(outputFormatter);

    }
}