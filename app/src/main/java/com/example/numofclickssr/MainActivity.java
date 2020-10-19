package com.example.numofclickssr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int cnt=0;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.txtScore);
    }

    public void methodCounter(View view) {
        cnt++;
        String str=getString(R.string.textOnTextBox);
        tv.setText(str+" "+cnt);
    }
}
