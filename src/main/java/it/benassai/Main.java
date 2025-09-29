package it.benassai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread counter1 = new Contatore(100);
        Thread counter2 = new Contatore(110);

        counter1.start();
        counter2.start();

        counter1.join();
        counter2.join();

        System.out.println("Enter username...");
        String input = scanner.nextLine();

        System.out.println("Your username is: " + input);


        scanner.close();
    }
}