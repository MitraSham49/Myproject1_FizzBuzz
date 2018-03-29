package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        number = scan.nextInt();
        for(int x = 1; x < number+1 ; x = x + 1) {

           /* System.out.print(x + " ");
            System.out.println();
            */
            if (((x % 3)== 0) && ((x%5)!=0)){
                System.out.print("Fizz");
            }
             else if  (((x % 5)== 0) && ((x%3)!=0)){
                System.out.print("Buzz");
            }
            else if (((x % 5)== 0) && ((x%3)==0)){
                System.out.print("Fizz Buzz");
            }
            else
            System.out.print(x + " ");
            System.out.println();


            }
        for(int x = 1; x < number+1 ; x = x + 1) {
            if ((x % 7) == 0) {
                System.out.print(x + " multiples of 7");
                System.out.println();
            }
        }

        for(int x = 1; x < number+1 ; x = x + 1) {
            if ((x % 17) == 0) {

                System.out.print(x + " multiples of 17");
                System.out.println();
            }
        }
        for(int x = 1; x < number+1 ; x = x + 1) {
            if ((x % 23) == 0) {

                System.out.print(x + " multiples of 23 ");
                System.out.println();
            }

        }

    }

}
