package com.example.my.order;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.example.my.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.internal.ToolbarUtils;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        CollapsingToolbarLayout toolbar = findViewById(R.id.toolbar);
    }
}