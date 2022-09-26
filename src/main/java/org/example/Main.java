package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String nemzetiseg;


        System.out.print("Írjál be egy nevet!");
        name = input.nextLine();
        System.out.println("Milyen a nemzetiséged?");
        System.out.println("magyar");
        System.out.println("német");
        System.out.println("angol");
        nemzetiseg = input.nextLine();

        if("magyar".equals(nemzetiseg)){
            System.out.println("Szia " + name);}
            else if("német".equals(nemzetiseg)){
            System.out.println("Hello " + name);}
            else if("angol".equals(nemzetiseg)){
            System.out.println("Hi " + name);}
            else if("".equals(nemzetiseg)){
            System.out.println("Hiba");
        }
        else
            System.out.println("Szia " + name);


    }
}