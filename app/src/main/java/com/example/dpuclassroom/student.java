package com.example.dpuclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dpuclassroom.databinding.ActivityStudentBinding;

public class student extends AppCompatActivity {
    ActivityStudentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityStudentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.button5.setOnClickListener(view -> {
            Intent intent=new Intent(student.this,div.class);
            startActivity(intent);
        });
    }
}