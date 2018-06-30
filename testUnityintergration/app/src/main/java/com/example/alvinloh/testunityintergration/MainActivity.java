package com.example.alvinloh.testunityintergration;
import com.Alvin.UnityTest.UnityPlayerActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.launchGame);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToActivity(v);
            }
        });
    }

    public void goToActivity(View view) // called when I click on a button
    {
        Intent intent = new Intent(this, UnityPlayerActivity.class);
        startActivity(intent);
    }

}
