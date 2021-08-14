package com.example.a10118429_uas.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a10118429_uas.R;
//    tanggal pengerjaan 11/08/2021
//    Nama  : Ruyatsyah
//    Nim   : 10118429
//    Kelas : IF10

public class Fragment_3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.page_3,container, false);
        return rootView;
    }
}
