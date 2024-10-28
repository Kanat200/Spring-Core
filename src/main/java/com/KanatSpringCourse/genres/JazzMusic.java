package com.KanatSpringCourse.genres;

import com.KanatSpringCourse.Music;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {

    private List<String> jazzSongs = new ArrayList<>();

    {
        jazzSongs.add("Jazz music");
        jazzSongs.add("Jazz music");
        jazzSongs.add("Jazz music");
    }


    @Override
    public String getSongs() {
        return "Jazz music";
    }
//
//    @Override
//    public String toString() {
//        return "Playing: " + jazzSongs.get(0) + ", " + jazzSongs.get(1) + ", " + jazzSongs.get(2);
//    }
}
