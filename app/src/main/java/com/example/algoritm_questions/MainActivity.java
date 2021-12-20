package com.example.algoritm_questions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Digits digits=new Digits();
        int resultZero = digits.digitZero(3456789);
        int resultFirst = digits.digitFirst(134568);
        int resultFirstMath = digits.digitFirstMath(3456789);
        int resultDigitAt=digits.digitAt(3548964,5);
        int resultSumLargerThan=digits.digitSumLargerThan(345578,4);
        int resultDigitCount = digits.digitCount(345674,5);
        int digitRemoveAt = digits.digitRemoveAt(34674,1);

       // System.out.println("resultZero : " + resultZero);
       // System.out.println("resultFirst : " + resultFirst);
       // System.out.println("resultFirstMath : " + resultFirstMath);
       // System.out.println("resultDigitAt : " + resultDigitAt);
       // System.out.println("resultSumLargerThan : " + resultSumLargerThan);
       // System.out.println("resultDigitCount : " + resultDigitCount);
        System.out.println("digitRemoveAt : " + digitRemoveAt);

    }
}