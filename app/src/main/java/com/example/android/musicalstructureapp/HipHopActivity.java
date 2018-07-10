package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;


import java.util.ArrayList;

import static com.example.android.musicalstructureapp.R.drawable.*;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_grid);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("Blink 182", "What's My Age Again?", R.drawable.blink182_art));
        words.add(new Word("Nirvana", "Smells Like Teen Spirit", R.drawable.nirvana_art));
        words.add(new Word("Oasis", "Wonderwall", R.drawable.oasis_art));
        words.add(new Word("Third Eye Blind", "Semi-Charmed Life", R.drawable.thirdeyeblind_art));
        words.add(new Word("Red Hot Chili Peppers", "Scar Tissue", R.drawable.redhotchilipeppers_art));
        words.add(new Word("Radiohead", "Karma Police", R.drawable.radiohead_art));
        words.add(new Word("Kings Of Leon", "Use Somebody", R.drawable.kingsofleon_art));
        words.add(new Word("Portugal. The Man", "Feel It Still", R.drawable.portugaltheman_art));
        words.add(new Word("The Killers", "Mr. Brightside", R.drawable.thekillers_art));
        words.add(new Word("Papa Roach", "Last Resort", R.drawable.paparoach_art));
        words.add(new Word("Hot Hot Heat", "Bandages", R.drawable.hothotheat_art));




// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter =
                new WordAdapter(this, words);

// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        GridView gridView = (GridView) findViewById(R.id.grid_list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        gridView.setAdapter(adapter);
    }
}