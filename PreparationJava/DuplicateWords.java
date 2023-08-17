import java.util.regex.Matcher;
import java.util.regex.Pattern;

//desafio: remover palavras duplicadas usando regex
public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        String input = "I love Love to To tO code";

        Matcher m = p.matcher(input);

        while (m.find()) {
            input = input.replaceAll(m.group(), m.group(1));
        }

        System.out.println(input);
    }

}