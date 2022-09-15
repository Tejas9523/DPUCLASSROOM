package com.example.dpuclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dpuclassroom.databinding.ActivityTeacherBinding;

public class teacher extends AppCompatActivity {
ActivityTeacherBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTeacherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.button17.setOnClickListener(view -> {
            Intent intent=new Intent(teacher.this,divT.class);
            startActivity(intent);
        });
    }
}