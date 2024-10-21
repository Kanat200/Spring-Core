package com.KanatSpringCourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component ("musicBean")
@Scope("singleton")
public class ClassicalMusic implements Music{


    private List<String> classicalSongs = new ArrayList<>();


    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        classicalSongs.add("Hungarian Rhapsody");
        classicalSongs.add("Symphony no. 5 in C Minor, op. 67");
        classicalSongs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSongs() {
        return classicalSongs;
    }
}
