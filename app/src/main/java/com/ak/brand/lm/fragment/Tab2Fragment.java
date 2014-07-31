package com.ak.brand.lm.fragment;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.ak.brand.lm.R;

public class Tab2Fragment extends Fragment {

    public Tab2Fragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab2, container, false);
        VideoView videoView = (VideoView) rootView.findViewById(R.id.video);
        String uriPath = "android.resource://com.ak.brand.lm/" + R.raw.loop_tab2;
        Uri uri = Uri.parse(uriPath);
        videoView.requestFocus();
        videoView.setVideoURI(uri);
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        return rootView;
    }

}
