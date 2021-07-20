package com.example.interestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView a;
    private TextView z;
    private TextView b;
    private TextView iresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        iresult = findViewById(R.id.iresult);
        a = findViewById(R.id.a);
        z = findViewById(R.id.z);
        b = findViewById(R.id.b);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                String s = a.getText().toString();
                double m = Double.parseDouble(s);
                String s1 = z.getText().toString();
                int t = Integer.parseInt(s1);
                String s2 = b.getText().toString();
                double in = Double.parseDouble(s2);
//                for (int i = 0; i < t; i++) {
//                    m = m + ((m * in) / 100);
//                }
                double acc;
                acc=((m*in*t)/100)+m;
                iresult.setText("Rs" + acc);


            }
        });
    }
}