package com.example.worldsevil.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     private static  final List<String> buttons = Arrays.asList(

             "crach me",
             "b2",
             "b3",
             "b4",
             "b5",
             "b6"

     );

      private static final  int layouts[]={
              R.layout.activity_main,
              R.layout.second_activity
      };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button); //штука которую не сделуеит делать
        btn.setOnClickListener(new View.OnClickListener() {
        /*    @Override
            public void onClick(View view) {
                throw new RuntimeException();
            }
        });
         Button btn2 = findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(this, LoaderActivity.class);
                StartActivity(intent);
            }
        });
       // MyArrayAdapter myArrayAdapter = new ArrayAdapter(this, R.id.actionlist);
      //  myArrayAdapter.setAd

*/
    }

    @Override
    public void onClick(View view) {

    }
}
