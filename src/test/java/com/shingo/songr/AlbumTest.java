package com.shingo.songr;

import com.shingo.songr.model.Album;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AlbumTest {

    @Test
    void getTitle() {

        Album testAlbum = new Album("testTitle", "testArtist",1,1,"testUrl");

        assertEquals("testTitle",testAlbum.getTitle());
    }


    @Test
    void getArtist() {
        Album testAlbum = new Album("testTitle", "testArtist",1,1,"testUrl");

        assertEquals("testArtist",testAlbum.getArtist());

    }

    @Test
    void getSongCount() {

        Album testAlbum = new Album("testTitle", "testArtist",1,1,"testUrl");

        assertEquals(1,testAlbum.getSongCount());
    }

    @Test
    void getLength() {
        Album testAlbum = new Album("testTitle", "testArtist",1,1,"testUrl");

        assertEquals(1,testAlbum.getLength());
    }

    @Test
    void getImageUrl() {

        Album testAlbum = new Album("testTitle", "testArtist",1,1,"testUrl");

        assertEquals("testUrl",testAlbum.getImageUrl());
    }

}