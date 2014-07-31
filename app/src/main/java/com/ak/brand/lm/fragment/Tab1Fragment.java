package com.ak.brand.lm.fragment;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.VideoView;

import com.ak.brand.lm.R;

public class Tab1Fragment extends Fragment {

    private VideoView mVideoView;
    private ImageButton mImageButton;

    public Tab1Fragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab1, container, false);
        mVideoView = (VideoView) rootView.findViewById(R.id.video);
        mImageButton = (ImageButton) rootView.findViewById(R.id.playButton);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mVideoView != null && mVideoView.isPlaying()) {
                    mImageButton.setVisibility(View.VISIBLE);
                    mVideoView.stopPlayback();
                }else {
                    mImageButton.setVisibility(View.INVISIBLE);
                    play();
                }
            }
        });
        return rootView;
    }

    private void play() {
        String uriPath = "android.resource://com.ak.brand.lm/" + R.raw.loop_tab1;
        Uri uri = Uri.parse(uriPath);
        mVideoView.requestFocus();
        mVideoView.setVideoURI(uri);
        mVideoView.start();
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }

}
