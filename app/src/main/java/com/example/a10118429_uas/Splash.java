package com.example.a10118429_uas;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class   Splash extends AppCompatActivity {
    //    tanggal pengerjaan 11/08/2021
    //    Nama  : Ruyatsyah
    //    Nim   : 10118429
    //    Kelas : IF10

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread thread = new Thread(){
            public  void run(){
                try {
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(Splash.this, Walkthrough.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}