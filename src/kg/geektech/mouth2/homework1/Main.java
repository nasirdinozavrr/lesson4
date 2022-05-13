package kg.geektech.mouth2.homework1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Black");
        ArrayList<String>color1 = new ArrayList<String>();
        color.add("Blue");
        color.add("Orange");
        color.addAll(color1);
        Collections.reverse(color);
        Collections.shuffle(color);

        for (int i = 0; 0 < color.size(); i++) {
            System.out.println(color.get(i));
            ;
        }
        for (String colors: color) {
            System.out.println(colors);
        }

    Player player = new Player("Айбек", 20);


    }
}
