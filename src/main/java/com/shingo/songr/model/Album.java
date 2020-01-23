package com.shingo.songr.model;

import sun.security.util.Length;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

//save things in db using @Entity
@Entity
public class Album {

    @Id
//    takes in strategy
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

//there are many songs to 1 album / and "album" can be potato but references to album in Song class
    @OneToMany(mappedBy = "album")
    List<Song> songs;


    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageUrl;

//    default constructor
    public Album(){}

//   ********stuff for album creation
    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", songs=" + songs +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", songCount=" + songCount +
                ", length=" + length +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
