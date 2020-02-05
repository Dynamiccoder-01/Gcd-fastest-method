package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("gcd of "+a+" and "+b+" is "+EuclidGcd(a,b));

    }
    public static int EuclidGcd(int a,int b){
        int temp;
        if(b==0){
            return a;
        }
        else{
            temp=a%b;
        }
        return EuclidGcd(b,temp);
    }
}
