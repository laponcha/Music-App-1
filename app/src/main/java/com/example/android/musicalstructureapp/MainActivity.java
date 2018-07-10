package com.example.android.musicalstructureapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //Find the View that shows the artists category
        TextView artists = (findViewById(R.id.artists_text_view));

        // Set a click listener on that View
        artists.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlternativeRockActivity}
                Intent artistsIntent = new Intent(MainActivity.this, AlternativeRockActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });



        //Find the View that shows the Songs category
        TextView songs = (findViewById(R.id.songs_text_view));

        // Set a click listener on that View
        songs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HipHopActivity}
                Intent songsIntent = new Intent(MainActivity.this, HipHopActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        //Find the View that shows the Now Playing category
        TextView nowPlaying = (findViewById(R.id.now_playing_text_view));

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HipHopActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }



}
