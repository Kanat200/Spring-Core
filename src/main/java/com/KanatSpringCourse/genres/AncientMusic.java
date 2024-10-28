package com.KanatSpringCourse.genres;

import com.KanatSpringCourse.Music;

import java.util.ArrayList;
import java.util.List;

public class AncientMusic implements Music {

//    public static AncientMusic getAncientMusic() {
//        return new AncientMusic();
//    }
//
//    public void doMyInt() {
//        System.out.println("Doing my initialization");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }

    private List<String> ancientSongs = new ArrayList<>();

    {
        ancientSongs.add("Ancient music");
        ancientSongs.add("Ancient music");
        ancientSongs.add("Ancient music");
    }

    @Override
    public String getSongs() {
        return "ancientSongs";
    }

    @Override
    public String toString() {
        return "Playing: " + ancientSongs.get(0) + ", " + ancientSongs.get(1) + ", " + ancientSongs.get(2);
    }
}
