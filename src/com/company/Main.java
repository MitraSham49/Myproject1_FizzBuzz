package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        for(int x = 1; x < 100; x = x + 1) {

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


    }

}
