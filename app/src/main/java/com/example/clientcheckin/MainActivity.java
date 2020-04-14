package com.example.clientcheckin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button submitLoginInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitLoginInfo = (Button) findViewById(R.id.submit);
        submitLoginInfo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Works");
            }
        });
    }
}
