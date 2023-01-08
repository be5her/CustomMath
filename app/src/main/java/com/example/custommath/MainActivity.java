package com.example.custommath;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myutils.MyMath;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int n1 = 5;
        int n2 = 4;
        btn = findViewById(R.id.button);

        btn.setOnClickListener(
                view -> {
                    double sum = MyMath.Plus(n1, n2);
                    Log.d("sum: ",sum + " ");
                }
        );
    }
}