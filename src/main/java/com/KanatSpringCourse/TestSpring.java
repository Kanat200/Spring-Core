package com.KanatSpringCourse;

import com.KanatSpringCourse.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class TestSpring {
    public static void main(String[] args) {
        /*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        /*
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);
*/



        //Computer computer = context.getBean("computer", Computer.class);

       // System.out.println(computer);


        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //musicPlayer.playMusic();

//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music1 = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//
//        musicPlayer1.playMusic();

//        AncientMusic ancientMusic = context.getBean("musicBean", AncientMusic.class);
//
//        System.out.println(ancientMusic.getSong());



        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();

        //HW for CH2 L7
        //musicPlayer.playMusicList();


        /*
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
         */

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//
//        firstMusicPlayer.setVolume(30);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());
        /*System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume()); // check of work annotation @Value */

        /*ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic2 == classicalMusic1);  //check of work annotation @Scope("singleton") */

        /*RockMusic rockMusic1 = context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic2 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic1 == rockMusic2); // check of work annotation @Scope("prototype") */

        /*
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class); // check of work annotation @PostConstruct и @PreDestroy */

        context.close();
    }
}
