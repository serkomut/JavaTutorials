package com.mytutorial;

import java.util.*;

/**
 * Created by sguzel on 01/02/16.
 */
public class ChapterOne {
    public void Numbers(){
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        for (int item : numbers) {
            System.out.println(item);
        }
    }

    public void NumbersList(){
        List<Integer> numbers = new ArrayList<Integer>() {};
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int item : numbers) {
            System.out.println("Order : " + item);
        }
    }

    public void StringAray(){
        String[] list = new String[]{"Elma", "Armut", "Kel", "Mahmut"};

        for (String item : list){
            System.out.println("Row : " + item);
        }
    }
}