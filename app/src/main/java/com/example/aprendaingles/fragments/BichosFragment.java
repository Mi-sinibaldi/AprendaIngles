package com.example.aprendaingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.aprendaingles.R;
import com.example.aprendaingles.activity.MainActivity;

public class BichosFragment extends Fragment implements View.OnClickListener {

    private ImageButton ImageButtonDog, ImageButtonCat, ImageButtonLion, ImageButtonMonkey,
            ImageButtonOvelha, ImageButtonCow;

    private MediaPlayer mediaPlayer;

    public BichosFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        ImageButtonDog = view.findViewById(R.id.imageButtonDog);
        ImageButtonCat = view.findViewById(R.id.imageButtonCat);
        ImageButtonLion = view.findViewById(R.id.imageButtonLion);
        ImageButtonMonkey = view.findViewById(R.id.imageButtonMonkey);
        ImageButtonOvelha = view.findViewById(R.id.imageButtonOvelha);
        ImageButtonCow = view.findViewById(R.id.imageButtonCow);

        ImageButtonDog.setOnClickListener(this);
        ImageButtonCat.setOnClickListener(this);
        ImageButtonLion.setOnClickListener(this);
        ImageButtonMonkey.setOnClickListener(this);
        ImageButtonOvelha.setOnClickListener(this);
        ImageButtonCow.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonDog:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.dog);
                tocarSom();
                 break;
            case R.id.imageButtonCat:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cat);
                tocarSom();
                break;
            case R.id.imageButtonLion:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.lion);
                tocarSom();
                break;
            case R.id.imageButtonMonkey:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.monkey);
                tocarSom();
                break;
            case R.id.imageButtonOvelha:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.sheep);
                tocarSom();
                break;
            case R.id.imageButtonCow:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cow);
                tocarSom();
                break;

        }
    }

    public void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });
        }
    }
}
