package com.example.dpuclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dpuclassroom.databinding.ActivityDivBinding;

public class div extends AppCompatActivity {
    ActivityDivBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDivBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.button4.setOnClickListener(view -> {
            Intent intent=new Intent(div.this,sm1.class);
            startActivity(intent);
        });

        binding.button8.setOnClickListener(view -> {
            Intent intent=new Intent(div.this,sm2.class);
            startActivity(intent);
        });

        binding.button9.setOnClickListener(view -> {
            Intent intent=new Intent(div.this,schem.class);
            startActivity(intent);
        });

        binding.button10.setOnClickListener(view -> {
            Intent intent=new Intent(div.this,sphy.class);
            startActivity(intent);
        });

        binding.button11.setOnClickListener(view -> {
            Intent intent=new Intent(div.this,sbxe.class);
            startActivity(intent);
        });

        binding.button12.setOnClickListener(view -> {
            Intent intent=new Intent(div.this,sbee.class);
            startActivity(intent);
        });

        binding.button13.setOnClickListener(view -> {
            Intent intent=new Intent(div.this,ssme.class);
            startActivity(intent);
        });

        binding.button14.setOnClickListener(view -> {
            Intent intent=new Intent(div.this,spps.class);
            startActivity(intent);
        });

        binding.button15.setOnClickListener(view -> {
            Intent intent=new Intent(div.this,smec.class);
            startActivity(intent);
        });
    }
}