package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Desafio: https://www.hackerrank.com/challenges/grading/problem
 * Sam é professor na universidade e gosta de arredondar a nota de cada aluno de acordo com estas regras:
 * - Se a diferença entre a nota e o próximo múltiplo de 5 for menor que 3, arredonde a nota para o próximo múltiplo de 5.
 * - Se o valor da nota for menor que 38, não haverá arredondamento, pois o resultado ainda será uma nota de reprovação.
 */
public class GradingStudents {

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(75, 67, 40, 33);
        List<Integer> result = GradingStudents.gradingStudents(grades);
        System.out.println(result);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : grades) {
            int valor = proximoMultiploDe5(n);

            if ((n.intValue() < 38) || ((valor - n) >= 3)) {
                result.add(n);
            } else {
                result.add(valor);
            }
        }
        return result;
    }

    public static Integer proximoMultiploDe5(Integer n) {
        return (int) Math.ceil(n / 5.0) * 5;
    }
}
