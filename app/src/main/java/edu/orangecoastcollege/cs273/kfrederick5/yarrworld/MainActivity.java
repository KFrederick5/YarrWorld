package edu.orangecoastcollege.cs273.kfrederick5.yarrworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * An OCC greeting with a button that when clicked
 * says hello.
 */
public class   MainActivity extends AppCompatActivity {

    private Button speakButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Remembers where the user last left off
        super.onCreate(savedInstanceState);
        //Inflated (!) view on startup which is activity_main.xml
        setContentView(R.layout.activity_main);

        /**
         * Links the speakButton in the view to a java button.
         */
        //Hooks the speakButton to the one in our view
        speakButton = (Button) findViewById(R.id.speakButton);

        /**
         * Action call for the button to display the event toast
         */
        //Listener waiting for user interaction with the speakButton
        speakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.toast_text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
