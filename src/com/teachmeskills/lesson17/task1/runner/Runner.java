package com.teachmeskills.lesson17.task1.runner;

import com.teachmeskills.lesson17.task1.service.Service;

import java.util.Scanner;

/**
 * In the Runner class, the mine method takes a value into the Scanner class and calls the service method
 */
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service.service(sc);
    }
}
