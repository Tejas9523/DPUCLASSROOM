package com.example.dpuclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.dpuclassroom.databinding.ActivityLoginBinding;
import com.example.dpuclassroom.databinding.ActivityUploadfileBinding;

public class login extends AppCompatActivity {
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.buttonlogin.setOnClickListener(view -> {

            if (binding.editTextTextid.getText().toString().equals("dit") && binding.editTextTextPassword.getText().toString().equals("dit123")){
                Intent intent=new Intent(login.this,teacher.class);
                startActivity(intent);
                }
            else {
                Toast.makeText(login.this, "Please Enter correct details !!!", Toast.LENGTH_SHORT).show();
            }

            binding.editTextTextid.setText("");
            binding.editTextTextPassword.setText("");
        });

    }
}