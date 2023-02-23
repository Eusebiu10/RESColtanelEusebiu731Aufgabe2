package com.company.View;

import java.util.List;
import java.util.Scanner;

public class View {

    public View() {
    }

    public void run() {
        while (true) {
            System.out.println("Press 1 to add city");
            System.out.println("Press 2 to add temp to city");
            System.out.println("Press 3 to see temp for city in C");
            System.out.println("Press 4 to see temp for city in F");
            System.out.println("Press 5 to see all cities");
            System.out.println("Press 6 to exit");
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the option");
            int option = Integer.parseInt(keyboard.nextLine());

            switch (option) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {return;}
            }
        }
    }

}
