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

public class Profile extends Fragment {

    //    tanggal pengerjaan 11/08/2021
    //    Nama  : Ruyatsyah
    //    Nim   : 10118429
    //    Kelas : IF10

    String url_ig="https://www.instagram.com/ruyatsyah12/";
    String url_twit="https://twitter.com/Ruyatsy_";
    String url_fb="https://web.facebook.com/ruyat.syah.35/";
    ImageButton Ig,Fb,Twit;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.profile, container, false);
        Ig = view.findViewById(R.id.ig);
        Ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_ig);
            }
        });
        Fb = view.findViewById(R.id.fb);
        Fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_fb);
            }
        });
        Twit = view.findViewById(R.id.twit);
        Twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_twit);
            }
        });
        return view;
    }
    public void gotoUrl(String url){
        Uri uri = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}