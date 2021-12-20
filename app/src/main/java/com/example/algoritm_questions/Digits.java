package com.example.algoritm_questions;

public class Digits {


    public Integer digitZero(int n){
        return n%10;
    }

    public Integer digitFirst(int n){
        int numberOfSteps = 1;
        while (n >= 10){
            n /= 10;
            numberOfSteps++;
        }
        System.out.println("basamakSayisi"+numberOfSteps);
        return n;
    }

    public Integer digitFirstMath(int n){

        int digits = (int)(Math.log10(n)); // Returns one less than the total number of digits
        n = (int)(n / (int)(Math.pow(10, digits)));
        return n;
    }


    public Integer digitAt(int n, int k){

        String string_number = Integer.toString(n);
        String reverse="";
        int length = string_number.length();
        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + string_number.charAt(i);

        int result = Integer.parseInt(String.valueOf(reverse.charAt(k)));


        return result;
    }




    }

