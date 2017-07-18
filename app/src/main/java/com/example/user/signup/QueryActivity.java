package com.example.user.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class QueryActivity extends AppCompatActivity {
    private LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
        linear= (LinearLayout)findViewById(R.id.linear);
    }
}
