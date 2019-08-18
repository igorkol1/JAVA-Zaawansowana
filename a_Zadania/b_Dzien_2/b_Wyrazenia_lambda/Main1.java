package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Podaj znaki");
        Scanner scanner = new Scanner(System.in);
        String chars = scanner.nextLine();
        List<Character> characterList = chars.chars()
                .mapToObj(e -> (char) e).sorted().collect(Collectors.toList());

        characterList.forEach(System.out::println);

    }

}
