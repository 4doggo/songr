package com.shingo.songr.model;

import javax.persistence.*;

//telling spring its a table
@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    Album album;

    String title;
    int length;
    int trackNumber;

//    default constructor
    public Song(){}

    //    constructor for song
    public Song(String title, int length, int trackNumber){

        this.title =title;
        this.length=length;
        this.trackNumber=trackNumber;
//        this.album=album;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public Album getAlbum() {
        return album;
    }


    public void setAlbum(Album album){
        this.album=album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", album=" + album +
                ", title='" + title + '\'' +
                ", length=" + length +
                ", trackNumber=" + trackNumber +
                '}';
    }

}
