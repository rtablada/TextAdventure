package com.theironyard;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player();


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller.");

        String x = "1";
        Integer y = 3;
        int a = 1;

        System.out.println(y);

        if (a == Integer.parseInt(x)) {
            System.out.println("a == x");
        }

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();
    }
}
