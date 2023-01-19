package com.example.e_writer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import ui.HomeFragment;
import ui.ProfileFragment;
import ui.SearchFragment;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName() ;
    ChipNavigationBar bottomNav;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNav=findViewById(R.id.bottom_nav);

        bottomNav.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {

                Fragment fragment = null;

                switch (i) {

                    case R.id.navigation_home:
                        fragment = new HomeFragment();
                        break;

                    case R.id.navigation_search:
                        fragment = new SearchFragment();
                        break;

                    case R.id.navigation_post:
                        fragment = new PostFragment();
                        break;

                    case R.id.navigation_profile:
                        fragment = new ProfileFragment();
                        break;
                }
                if (fragment != null) {

                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, fragment).commit();

                } else {

                    Log.e(TAG, "Error in creating fragment");
                }
            }
        });
    }
}
