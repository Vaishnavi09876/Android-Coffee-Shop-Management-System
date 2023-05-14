package com.example.woodbond;

import

import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar; ...

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tb=(Toolbar)findViewById(R.id.toolbar);
        tb.setTitle("Home");
        setSupportActionBar(tb)
    }
