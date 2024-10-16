package com.KanatSpringCourse;

import java.util.ArrayList;
import java.util.List;

public class AncientMusic implements Music{
    private AncientMusic() {

    }

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
        ancientSongs.add("");
        ancientSongs.add("");
        ancientSongs.add("");
    }

    @Override
    public List<String> getSongs() {
        return ancientSongs;
    }
}
