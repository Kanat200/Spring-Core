package com.KanatSpringCourse;

import java.util.List;
import java.util.Random;
/*
@Component
*/

public class MusicPlayer {

    /*
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
*/

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }
//    Random random = new Random();
//    int randomNumber = random.nextInt(5);

    public String playMusic() {
        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSongs();

    }

    /*
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    */

/*
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
*/
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
/*
    @Autowired
    public MusicPlayer (ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
*/

    /*
    public void playMusic (MusicGenre genre) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }
*/

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
