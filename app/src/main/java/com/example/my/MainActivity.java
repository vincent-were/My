package com.example.my;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.example.my.fragments.HomeFragment;
import com.example.my.fragments.PizasFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

import java.net.HttpCookie;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();


    }

    private final  NavigationBarView.OnItemSelectedListener  navListener = item -> {
        Fragment selectedFragment = null;
        switch (item.getItemId()) {
            case R.id.home1:
                selectedFragment = new HomeFragment();
                break;
            case R.id.services:

                selectedFragment = new PizasFragment();

                break;
            case R.id.profile:
                selectedFragment = new PizasFragment();
                break;
        }
        // It will help to replace the
        // one fragment to other.
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, selectedFragment)
                .commit();
        return true;

    };

}