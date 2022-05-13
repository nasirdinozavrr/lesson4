package kg.geektech.mouth2.homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> A = new ArrayList<String>();
        ArrayList<String> B = new ArrayList<String>();
        ArrayList<String> C = new ArrayList<String>();

        String enter;
        System.out.println("Enter at least five lines in list-A");
        for (int i = 0; i < 5; i++) {
            enter = scanner.nextLine();
            A.add(enter);
        }
        System.out.println("A: " + A + "}");
        System.out.println("Enter at least five lines in list-B");
        for (int i = 0; i < 5; i++) {
            enter = scanner.nextLine();
            B.add(enter);
        }
        System.out.println("B: { " + B + "}");

        Collections.reverse(B);

        for (int i = 0; i < A.size(); i++) {
            C.add(A.get(i));
            C.add(B.get(i));
        }
        System.out.println("C: " + C + "}");

        C.sort(Comparator.comparing(String::length));
        System.out.println("sorted: " + C);

    }
}
