package com.teachmeskills.lesson17.task1.service;

import com.teachmeskills.lesson17.task1.functional.MyFunInt;

import java.util.Scanner;

/**
 * In the Service class, the service method takes a value from the Scanner class and,
 * using the if conditional operator, performs two functions.
 * The first one reverses the string, the second one calculates the factorial.
 */
public class Service {
    public static void service(Scanner sc) {
        System.out.print("Select interface 1 - work with string, 2 - factorial calculation: ");
        try {
            int id = sc.nextInt();
            switch (id) {
                case 1:
                    System.out.print("Enter the string: ");
                    String st = sc.nextLine();
                    MyFunInt<String> myString;
                    myString = (str) -> {
                        return new StringBuilder(str).reverse().toString();
                    };
                    System.out.println(myString.doSomething(st));
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    long lg = sc.nextLong();
                    MyFunInt<Long> factorial;
                    factorial = (fac) -> {
                        long result = 1;
                        for (long i = 1; i <= fac; i++) {
                            result *= i;
                        }
                        return result;
                    };
                    System.out.println("Factorial = " + factorial.doSomething(lg));
                    break;
                default:
                    System.out.println("Invalid character entered");
            }
        } catch (Exception e) {
            System.out.println("Invalid data format");
        } finally {
            sc.close();
        }
    }
}

