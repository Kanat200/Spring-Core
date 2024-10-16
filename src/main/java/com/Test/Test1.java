package com.Test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Rock rock = new Rock();
        System.out.println(rock.getSong());
    }
}
class Rock {
    private String[] arrayOfRockMusic = {"Wind cries Mary", "Wind cries Mary", "Wind cries Mary"};





    public String getSong() {
        return "Rock music: " + arrayOfRockMusic[0] + ", " + arrayOfRockMusic[1] + ", " + arrayOfRockMusic[2] + ".";
    }



}
