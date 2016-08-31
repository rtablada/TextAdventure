package com.theironyard;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player();


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller.");

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();
    }
}
