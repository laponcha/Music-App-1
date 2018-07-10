package com.example.android.musicalstructureapp;

public class Word {
    //custom class for artists and songs
    //Artists name
    private String mArtistName;
    //Song name
    private String mSongName;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    //custom object for Words which contains artistname and songname
    public Word(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    //custom object for Words which contains artistname and songname and imageresource
    public Word(String artistName, String songName, int imageResourceId) {
        mArtistName = artistName;
        mSongName = songName;
        mImageResourceId = imageResourceId;
    }

    //Getter Methods
    //Get artists name
    public String getArtistName() { return mArtistName; }

    //Get song name
    public String getSongName() { return mSongName; }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }



}
