package com.theironyard;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ryan on 9/1/16.
 */
public class FamilyExample {
    public static void main(String[] args) {
        // Shorthand???
        String[] namesShortcut = {"Ned", "Maude", "Rod", "Todd"};

        Person homer = new Person();
        homer.firstName = "Homer";
        homer.lastName = "Simpson";
        homer.age = "39";
        // Classes do not allow for arbitrary property names
//        homer.address = "742 Evergreen Terrace";

        HashMap<String, String> marge = new HashMap<>();

        marge.put("firstName", "Marge");
        marge.put("lastName", "Simpson");
        marge.put("age", "36");
        marge.put("address", "742 Evergreen Terrace");

        System.out.println(homer.firstName);
        System.out.println(marge.get("firstName"));

        System.out.println("---");

        // HashMaps allow looping through all available keys though...
        for (String key: marge.keySet()) {
            System.out.println("key: " + key + ", value: " + marge.get(key));
        }

        // Create an ArrayList of family members
        // Create an ArrayList of family members where each object is a
        // HashMap representing a person in our family
        ArrayList< HashMap<String, String> > simpsonsFamily = new ArrayList<>();
        simpsonsFamily.add(marge);

        // The String "Homer" does not meet the requirement of being a HashMap
//        simpsonsFamily.add("Homer");

        String firstNameCSV = "";

        // Loop through that ArrayList
        for (HashMap<String, String> familyMember: simpsonsFamily) {
            // Print each family member's name
            System.out.println(familyMember.get("firstName"));
            // Concatenate a string of family member divided by ","
            firstNameCSV += "," + familyMember.get("firstName");
        }

        System.out.println(firstNameCSV);

        // Calculate the average age of all family members

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
