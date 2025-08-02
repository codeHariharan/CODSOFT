package com.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n=r.nextInt(1,100);
        System.out.println("WELCOME TO NUMBER GAME!!!!");
        System.out.println("RULES:\n"+"1.At the start of the game you will be given 100 credits.");
        System.out.println("2.You are asked to guess the RANDOM NUMBER generated.");
        System.out.println("3.Depending upon your guess you will be shown three answers for your guess(too low/too high/GUESSED Correctly!).");
        System.out.println("4.For each round you take to guess, your credits will be decreased by 10. So there will be maximum of 10 rounds!");
        System.out.println("5.When the credits became 0, THE GAME IS OVER or if you guessed correctly your score will be displayed.");
        System.out.println("TIPS: TRY TO GUESS WITHIN FEW ROUNDS TO SCORE MAXIMUM.");
        System.out.println("Do you want to play the game(y/n):");
        char c=sc.next().charAt(0);
        int cr=100;
        if(c=='y'||c=='Y')
        {
            System.out.println("==============================");
            System.out.println("\t\t" + "GAME STARTED");
            System.out.println("==============================");
            System.out.println("Your credits:"+cr);
            int i=1;
            while(i<=10 && cr>0)
            {
                System.out.println("Enter a number(1-100) to guess the Random Number:");
                int g=sc.nextInt();
                if(g==n)
                {
                    System.out.println("CONGRATULATIONS!!!!!!");
                    System.out.println("You Guessed Correctly!!!");


                    break;
                }
                else if(g<n)
                {
                    System.out.println("Your Guess is too low!!!");
                    cr-=10;
                    System.out.println("Your Score:"+cr);
                }
                else
                {
                    System.out.println("Your Guess is too high!!!");
                    cr-=10;
                    System.out.println("Your Score:"+cr);
                }
            }
            System.out.println("==============================");
            System.out.println("\t\t" + "GAME OVER");
            System.out.println("==============================");
            System.out.println("The Random Number generated is:"+n);
            System.out.println("Your Score:"+cr);
        }
        else
        {
            System.out.println("You missed a wonderful game!!!");
            System.out.println("Try again later!!!");
        }
    }
}