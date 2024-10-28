package com.KanatSpringCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOfGenre {
    private List<Music> genreList = new ArrayList<>();

    public void addGenre(Music genre) {
        genreList.add(genre);
    }

    public void choosenGenre(int choosenGenreId) {
        System.out.println(genreList.get(choosenGenreId));
    }
}
