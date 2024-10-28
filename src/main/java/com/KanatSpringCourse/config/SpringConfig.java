package com.KanatSpringCourse.config;

import com.KanatSpringCourse.Computer;
import com.KanatSpringCourse.ListOfGenre;
import com.KanatSpringCourse.Music;
import com.KanatSpringCourse.MusicPlayer;
import com.KanatSpringCourse.genres.AncientMusic;
import com.KanatSpringCourse.genres.ClassicalMusic;
import com.KanatSpringCourse.genres.JazzMusic;
import com.KanatSpringCourse.genres.RockMusic;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("com.KanatSpringCourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public AncientMusic ancientMusic() {
        return new AncientMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), ancientMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
