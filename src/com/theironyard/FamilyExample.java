package com.theironyard;

import java.util.ArrayList;

/**
 * Created by ryan on 9/1/16.
 */
public class FamilyExample {
    public static void main(String[] args) {
        // Shorthand???
        String[] namesShortcut = {"Ned", "Maude", "Rod", "Todd"};

        ArrayList<String> simpsons = new ArrayList<>();
        simpsons.add("Homer");
        simpsons.add("Lisa");
        simpsons.add(1, "Marge");
        simpsons.add("Bart");
        simpsons.add("Maggie");

        // ArrayLists
//        for (int i = 0; i < simpsons.size(); i++) {
//            System.out.println(simpsons.get(i));
//        }

        for (String name: simpsons) {
            System.out.println(name);
        }

        System.out.println("---");

        // Declare length of the array not last index
        String[] names = new String[3];
        names[0] = "Homer";
        names[1] = "Lisa";
        names[2] = "Marge";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name: namesShortcut) {
            System.out.println(name);
        }
        
//        This will error because of out of bounds exception
//        names[3] = "Bart";
//        names[4] = "Maggie";
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
    }
}
