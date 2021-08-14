package com.example.a10118429_uas.Fragment_navigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a10118429_uas.R;

import org.jetbrains.annotations.NotNull;

public class tempat_wisata extends Fragment {
    //    tanggal pengerjaan 11/08/2021
    //    Nama  : Ruyatsyah
    //    Nim   : 10118429
    //    Kelas : IF10


    String url_map="https://goo.gl/maps/fbFj3Mj2HYGmEVa8A";
    String url_map1="https://goo.gl/maps/ePv8TC8SAkF9yCV68";
    String url_map2="https://goo.gl/maps/YjxmnqNr48NgHHzUA";
    ImageButton Map,Map1,Map2;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.tempat_wisata, container, false);
        Map = view.findViewById(R.id.map);
        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_map);
            }
        });
        Map1 = view.findViewById(R.id.map1);
        Map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_map1);
            }
        });
        Map2 = view.findViewById(R.id.map2);
        Map2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_map2);
            }
        });
        return view;
    }
    public void gotoUrl(String url){
        Uri uri = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
