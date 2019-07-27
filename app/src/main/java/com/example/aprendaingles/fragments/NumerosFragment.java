package com.example.aprendaingles.fragments;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener{

    private ImageButton imageButtonOne, imageButtonTwo, imageButtonTree, imageButtonFor,
            imageButtonFive, imageButtonSix;

    private MediaPlayer mediaPlayer;

    public NumerosFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        imageButtonOne = view.findViewById(R.id.imageButtonOne);
        imageButtonTwo = view.findViewById(R.id.imageButtonTwo);
        imageButtonTree = view.findViewById(R.id.imageButtonThree);
        imageButtonFor = view.findViewById(R.id.imageButtonFour);
        imageButtonFive = view.findViewById(R.id.imageButtonFive);
        imageButtonSix = view.findViewById(R.id.imageButtonSix);

        imageButtonOne.setOnClickListener(this);
        imageButtonTwo.setOnClickListener(this);
        imageButtonTree.setOnClickListener(this);
        imageButtonFor.setOnClickListener(this);
        imageButtonFive.setOnClickListener(this);
        imageButtonSix.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonOne:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.one);
                tocarSom();
                break;
            case R.id.imageButtonTwo:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.two);
                tocarSom();
                break;
            case R.id.imageButtonThree:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.three);
                tocarSom();
                break;
            case R.id.imageButtonFour:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.four);
                tocarSom();
                break;
            case R.id.imageButtonFive:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.five);
                tocarSom();
                break;
            case R.id.imageButtonSix:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.six);
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

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
