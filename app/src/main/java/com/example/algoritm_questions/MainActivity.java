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
        int resultFirst = digits.digitFirst(13456);
        System.out.println("resultZero : " + resultZero);
        System.out.println("resultFirst : " + resultFirst);

    }
}