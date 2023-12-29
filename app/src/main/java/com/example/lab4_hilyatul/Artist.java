package com.example.lab4_hilyatul;

public class Artist {

    String ArtistId;
    String artistName;

    public Artist(){}
    public Artist(String artistId, String artistName) {
        this.ArtistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return ArtistId;
    }

    public String getArtistName() {
        return artistName;
    }

}
