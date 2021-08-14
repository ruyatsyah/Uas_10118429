package com.example.a10118429_uas;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.a10118429_uas.Fragment_navigation.Profile;
import com.example.a10118429_uas.Fragment_navigation.Tentang_aplikasi;
import com.example.a10118429_uas.Fragment_navigation.tempat_wisata;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom_navigation extends AppCompatActivity {

    //    tanggal pengerjaan 11/08/2021
    //    Nama  : Ruyatsyah
    //    Nim   : 10118429
    //    Kelas : IF10


    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_profile:
                    f = new Profile();
                    break;
                case R.id.tempat_wisata:
                    f = new tempat_wisata();
                    break;
                case R.id.menu_tentang:
                    f = new Tentang_aplikasi();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.isi,f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation);

        bottomNavigationView = findViewById(R.id.button_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);



    }
}