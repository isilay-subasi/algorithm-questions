package com.example.algoritm_questions;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Random;

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


    public Integer digitSumLargerThan(int number, int limit){
        String string_number = Integer.toString(number);
        int lenght = string_number.length();
        int total = 0 ;
        for (int i = 0 ; i < lenght ; i++){
            if(Integer.parseInt(String.valueOf(string_number.charAt(i))) > limit){
                total = total + Integer.parseInt(String.valueOf(string_number.charAt(i)));
            }
        }
       return total;
    }

    public Integer digitCount(int number , int digit){
        String string_number = Integer.toString(number);
        int length = string_number.length();
        int counter = 0;
        for(int i = 0 ; i < length ; i++ ){
            if(Integer.parseInt(String.valueOf(string_number.charAt(i))) == digit){
                counter++;
            }
        }
        return counter;

    }


    public Integer digitRemoveAt(int number , int k){
        String string_number = Integer.toString(number);
        String reverse="";
        int length = string_number.length();
        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + string_number.charAt(i);

        StringBuilder sb = new StringBuilder(reverse);
        String reverse_result_string = String.valueOf(sb.deleteCharAt(k));

        String result_string = "";
        for(int i = reverse_result_string.length()-1 ; i >= 0 ; i--){
            result_string=result_string + reverse_result_string.charAt(i);
        }

       return Integer.valueOf(result_string);

        }

        public Integer digitRemoveAll(int number , int k){
            String string_number = Integer.toString(number);
            String reverse="";
            int length = string_number.length();
            for (int i = length - 1 ; i >= 0 ; i--)
                reverse = reverse + string_number.charAt(i);
            StringBuilder sb = new StringBuilder(reverse);
            String reverse_result_string="";
            for(int i = length - 1 ; i >= 0 ; i--){
                if(Integer.parseInt(String.valueOf(sb.charAt(i))) == k){
                    reverse_result_string= String.valueOf(sb.deleteCharAt(i));
                }
            }
            String result_string="";
            for(int i = reverse_result_string.length()-1 ; i >= 0 ; i--){
                result_string=result_string + reverse_result_string.charAt(i);
            }
          return Integer.valueOf(result_string);
        }


        @RequiresApi(api = Build.VERSION_CODES.N)
        public Integer randomNumber(int k){
            int n = k;
            Random randGen = new Random();
            int startNum = (int) Math.pow(10, n-1);
            int range = (int) (Math.pow(10, n) - startNum + 1);
            int randomNum = randGen.nextInt(range) + startNum;
            String string_number = Integer.toString(randomNum);
            boolean result= string_number.chars().distinct().count() >= string_number.length();
            if (result){
                return randomNum;
            }else {
                return randomNumber(k);
            }
        }


        public Integer reverse(int number){
            String string_number = Integer.toString(number);
            String reverse="";
            int length = string_number.length();
            for (int i = length - 1 ; i >= 0 ; i--)
                reverse = reverse + string_number.charAt(i);

            return Integer.valueOf(reverse);

        }






    }







