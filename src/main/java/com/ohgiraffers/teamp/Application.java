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
                break;
            case '-':
                break;
            case '*':
                break;
            case '/':
                break;
            case '%':
                break;
        }
    }
    public static int minus(int a, int b){
        return a - b;
    }
}
