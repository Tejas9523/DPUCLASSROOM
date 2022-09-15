package com.example.dpuclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dpuclassroom.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.button.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,login.class);
            startActivity(intent);
        });

        binding.button2.setOnClickListener(view1 -> {
            Intent intent1=new Intent(MainActivity.this,student.class);
            startActivity(intent1);
        });
    }
}