package edu.orangecoastcollege.cs273.kfrederick5.yarrworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button speakButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Remembers where the user last left off
        super.onCreate(savedInstanceState);

        //Inflated (!) view on startup which is activity_main.xml
        setContentView(R.layout.activity_main);

        //Referencing the button widget
        speakButton = (Button) findViewById(R.id.speakButton);

        //Listener waiting for user interaction
        speakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.toast_text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
