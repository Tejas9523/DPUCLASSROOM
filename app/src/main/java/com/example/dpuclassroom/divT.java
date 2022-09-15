package com.example.dpuclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dpuclassroom.databinding.ActivityDivTBinding;

public class divT extends AppCompatActivity {
    ActivityDivTBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDivTBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.button20.setOnClickListener(view -> {
            Intent intent=new Intent(divT.this,tm1.class);
            startActivity(intent);
        });

        binding.button21.setOnClickListener(view -> {
            Intent intent=new Intent(divT.this,tm2.class);
            startActivity(intent);
        });

        binding.button22.setOnClickListener(view -> {
            Intent intent=new Intent(divT.this,tchem.class);
            startActivity(intent);
        });

        binding.button23.setOnClickListener(view -> {
            Intent intent=new Intent(divT.this,tphy.class);
            startActivity(intent);
        });

        binding.button24.setOnClickListener(view -> {
            Intent intent=new Intent(divT.this,tbxe.class);
            startActivity(intent);
        });

        binding.button25.setOnClickListener(view -> {
            Intent intent=new Intent(divT.this,tbee.class);
            startActivity(intent);
        });

        binding.button26.setOnClickListener(view -> {
            Intent intent=new Intent(divT.this,tsme.class);
            startActivity(intent);
        });

        binding.button27.setOnClickListener(view -> {
            Intent intent=new Intent(divT.this,tpps.class);
            startActivity(intent);
        });

        binding.button28.setOnClickListener(view -> {
            Intent intent=new Intent(divT.this,tmech.class);
            startActivity(intent);
        });
    }
}