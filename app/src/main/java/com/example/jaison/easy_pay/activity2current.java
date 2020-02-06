package com.example.jaison.easy_pay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity2current extends AppCompatActivity {
    private Button prebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2current);
        prebutton= (Button) findViewById(R.id.prebutton);
        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivty3history();
            }
        });
    }


    public void openactivty3history() {
        Intent intent = new Intent(this,activty3history .class);
        startActivity(intent);
    }
}




