package com.dinar.tugas2praktikum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout frame1, frame2, frame3;

    int frame1Index = 0;
    int frame2Index = 1;
    int frame3Index = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame1 = findViewById(R.id.frame1);
        frame2 = findViewById(R.id.frame2);
        frame3 = findViewById(R.id.frame3);

        loadFragment(R.id.frame1, new Fragment1());
        loadFragment(R.id.frame2, new Fragment2());
        loadFragment(R.id.frame3, new Fragment3());

        frame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frame1Index++;
                if (frame1Index == 3){
                    frame1Index = 0;
                }
                switch (frame1Index){
                    case 0:
                        loadFragment(R.id.frame1, new Fragment1());
                        break;
                    case 1:
                        loadFragment(R.id.frame1, new Fragment2());
                        break;
                    case 2:
                        loadFragment(R.id.frame1, new Fragment3());
                        break;
                }
            }
        });

        frame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frame2Index++;
                if (frame2Index == 3){
                    frame2Index = 0;
                }
                switch (frame2Index){
                    case 0:
                        loadFragment(R.id.frame2, new Fragment1());
                        break;
                    case 1:
                        loadFragment(R.id.frame2, new Fragment2());
                        break;
                    case 2:
                        loadFragment(R.id.frame2, new Fragment3());
                        break;
                }
            }
        });
        frame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frame3Index++;
                if (frame3Index == 3){
                    frame3Index = 0;
                }
                switch (frame1Index){
                    case 0:
                        loadFragment(R.id.frame3, new Fragment1());
                        break;
                    case 1:
                        loadFragment(R.id.frame3, new Fragment2());
                        break;
                    case 2:
                        loadFragment(R.id.frame3, new Fragment3());
                        break;
                }
            }
        });
    }

    private void loadFragment(int target, Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(target,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
