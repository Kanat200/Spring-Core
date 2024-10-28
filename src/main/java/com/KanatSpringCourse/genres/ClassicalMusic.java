package com.KanatSpringCourse.genres;

import com.KanatSpringCourse.Music;

import java.util.ArrayList;
import java.util.List;
/*
@Component ("musicBean")
@Scope("singleton")
*/


public class ClassicalMusic implements Music {


    private List<String> classicalSongs = new ArrayList<>();


    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        classicalSongs.add("Hungarian Rhapsody");
        classicalSongs.add("Symphony no. 5 in C Minor, op. 67");
        classicalSongs.add("Night on Bald Mountain");
    }

    @Override
    public String getSongs() {
        return "Hungarian Rhapsody";
    }

//    @Override
//    public String toString() {
//        return "Playing: " + classicalSongs.get(0) + ", " + classicalSongs.get(1) + ", " + classicalSongs.get(2);
//    }
}
