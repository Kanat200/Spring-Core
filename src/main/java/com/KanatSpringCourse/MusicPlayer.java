package com.KanatSpringCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    /*
    @Autowired
    @Qualifier ("musicBean")
    private Music music;
     */

//   private Music music1;
//   private Music music2;

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    @Autowired
    public MusicPlayer (ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic (MusicGenre genre) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }


//    public String  playMusic() {
//
//        return "Playing: " + music1.getSong() + ", " + music2.getSong();
//    }


    //    @Autowired
//    private Music music;
//    // Тут уже за счет рефлексии. Магия короче

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }
//    private Music music;
//    private int volume;
//    private String name;
//
//    private List<Music> listOfMusic = new ArrayList<>();//HW
//
//    public MusicPlayer() {
//
//    }
//
//    //Ioc - Inversion of Control
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    //HW
//    public void setListOfMusic(List<Music> listOfMusic) {
//        this.listOfMusic = listOfMusic;
//    }
//
//    public void playMusicList() {
//        for (Music music : listOfMusic) {
//            System.out.println("Playing: " + music.getSong());
//        }
//    }
//

}
