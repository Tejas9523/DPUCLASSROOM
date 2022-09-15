package com.example.dpuclassroom;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;


public class m1adapter extends FirebaseRecyclerAdapter<model,m1adapter.myviewholder> {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    FirebaseStorage storage =  FirebaseStorage.getInstance();


    public m1adapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, @SuppressLint("RecyclerViewm1") final int position, @NonNull model model) {

        holder.textview.setText(model.getFilename());
        holder.imageview.setOnClickListener(view -> {

            Intent intent=new Intent(holder.imageview.getContext(),viewpdf.class);
            intent.putExtra("filename",model.getFilename());
            intent.putExtra("fileurl",model.getFileurl());

            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            holder.imageview.getContext().startActivity(intent);
        });
        holder.delete.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(holder.delete.getContext());
            builder.setTitle("Are you sure want to delete ?");

            builder.setPositiveButton("Delete", (dialogInterface, i) -> {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(holder.delete.getContext());
                builder1.setTitle("Enter Password");


                EditText password = new EditText(holder.delete.getContext());
                password.setInputType(InputType.TYPE_CLASS_TEXT);
                builder1.setView(password);

                builder1.setPositiveButton("Delete", (dialogInterface1, i1) -> {
                    if (password.getText().toString().equals("del")){
                        database.getReference().child("Mydocuments").child("m1").child(getRef(position).getKey()).removeValue();
                        storage.getReferenceFromUrl(model.getFileurl()).delete();

                    }

                    else {
                        Toast.makeText(holder.delete.getContext(), "Please enter correct password", Toast.LENGTH_SHORT).show();
                    }
                });

                builder1.setNegativeButton("Cancle", (dialogInterface12, i12) ->
                        Toast.makeText(holder.delete.getContext(), "Cancelled !", Toast.LENGTH_SHORT).show());
                builder1.show();

            });

            builder.setNegativeButton("Cancle", (dialogInterface, i) ->
                    Toast.makeText(holder.delete.getContext(), "Cancelled !", Toast.LENGTH_SHORT).show());
            builder.show();
        });

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign,parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder{

        ImageView imageview,delete;
        TextView textview;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            imageview = itemView.findViewById(R.id.img1);
            textview = itemView.findViewById(R.id.text1);
            delete= itemView.findViewById(R.id.imageView2);

        }
    }
}
