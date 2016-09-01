package com.theironyard;

/**
 * Created by ryan on 9/1/16.
 */
public class FamilyExample {
    public static void main(String[] args) {
        // Shorthand???
        String[] namesShortcut = {"Ned", "Maude", "Rod", "Todd"};

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
    }
}
