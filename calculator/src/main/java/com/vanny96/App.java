package com.vanny96;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);       

        System.out.println( "Type two numbers" );
        String[] strgNumbers = reader.nextLine().split(" ");
        int[] numbers = new int[2];

        for(int i=0; i<2; i++){
            numbers[i] = Integer.parseInt(strgNumbers[i]);
        }
    }

    private Integer sum(int num1, int num2){
        return num1 + num2;
    }

    private Integer difference(int num1, int num2){
        return num1 - num2;
    }

    private Integer multiplication(int num1, int num2){
        return num1 * num2;
    }

    private Integer division(int num1, int num2){
        return num1 / num2;
    }
}
