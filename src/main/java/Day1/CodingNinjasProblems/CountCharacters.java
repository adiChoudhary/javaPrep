package Day1.CodingNinjasProblems;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("");
        char ch;
        int characters = 0, digits = 0, whitespaces = 0;
        do {
            ch = sc.next().charAt(0);
//            System.out.printf("\"%c\"",ch);
            if (Character.isAlphabetic(ch))
                characters++;
            else if (Character.isDigit(ch))
                digits++;
            else if (ch =='\t'|| ch == ' ' || ch == '\n')
                whitespaces++;
        } while (sc.hasNext() && ch != '$');
        System.out.printf("%d %d %d", characters, digits, whitespaces);
    }
}
