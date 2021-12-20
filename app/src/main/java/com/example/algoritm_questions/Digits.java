package com.example.algoritm_questions;

public class Digits {


    public Integer digitZero(int n){
        return n%10;
    }

    public Integer digitFirst(int n){
        while (n >= 10)
            n /= 10;
        return n;
    }

}
