package main.java.com.ohgiraffers.teamp;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산기 만들기");
        System.out.println("첫 번째 숫자");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("연산자");
        char c = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("두 번째 숫자");
        int b = sc.nextInt();
        sc.nextLine();


        switch (c)
        {
            case '+':
                System.out.println(plus(a,b));
                break;
            case '-':
                int result = minus(a, b);
                System.out.println(result);
                break;
            case '*':
                break;
            case '/':
                double result2 = (double) a / b;
                if(b != 0)
                    System.out.println("Result of " + a + " " + c + " " + b + " is " + result2);
                else
                    try
                    {
                        throw new Exception("Divide by zero");
                    }
                    catch (Exception e)
                    {
                        System.out.println("Exception");
                        e.printStackTrace();
                    }
                break;
            case '%':
                if(b != 0)
                    System.out.println("Result of " + a + " " + c + " " + b + " is " + (a % b));
                else
                    try
                    {
                        throw new Exception("Divide by zero");
                    }
                    catch (Exception e)
                    {
                        System.out.println("Exception");
                        e.printStackTrace();
                    }
                break;

            default:
                break;
        }
    }


    public static int plus(int a, int b) {
        int sum = a + b;

        return sum;
    }
    public static int minus(int a, int b){
        return a - b;

    }
}
