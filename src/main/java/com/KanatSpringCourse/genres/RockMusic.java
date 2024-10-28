package com.KanatSpringCourse.genres;

import com.KanatSpringCourse.Music;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

/*
@Component
@Scope("prototype")
*/
public class RockMusic implements Music {
//
//    @PostConstruct
//    public void doMyInt() {
//        System.out.println("Doing my initialization");
//    }
//
//    @PreDestroy
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }

    private List<String> rockSongs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        rockSongs.add("Wind cries Mary");
        rockSongs.add("Paint it black");
        rockSongs.add("Can't seem to make you mine");
    }


    @Override
    public String getSongs() {
        return "Wind cries Mary";
    }
//
//    @Override
//    public String toString() {
//        return "Playing: " + rockSongs.get(0) + ", " + rockSongs.get(1) + ", " + rockSongs.get(2);
//    }
}
