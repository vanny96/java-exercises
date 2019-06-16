package com.vanny96;

import java.util.Scanner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);       

        int numbers[] = getNumbers(reader);

        // Get method 
        System.out.println("Enter the method");
        String methodName = reader.nextLine();

        // Find the method
        App thisObject = new App();
        Class thisClass = thisObject.getClass();

        Class[] getMethodArguments = new Class[2];
        getMethodArguments[0] = int.class;
        getMethodArguments[1] = int.class;

        Method method;

        // Invoke the method
        try {
            method = thisClass.getMethod(methodName, getMethodArguments);
            try {
                int result =(int) method.invoke(methodName, numbers[0], numbers[1]);
                System.out.println(result);
                
                
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       
    }


    private static int[] getNumbers(Scanner reader){
        System.out.println( "Type two numbers" );
        String[] strgNumbers = reader.nextLine().split(" ");
        int[] numbers = new int[2];

        for(int i=0; i<2; i++){
            numbers[i] = Integer.parseInt(strgNumbers[i]);
        }

        return numbers;
    }

    public static Integer sum(int num1, int num2){
        return num1 + num2;
    }

    public static Integer difference(int num1, int num2){
        return num1 - num2;
    }

    public static Integer multiplication(int num1, int num2){
        return num1 * num2;
    }

    public static Integer division(int num1, int num2){
        return num1 / num2;
    }
}
