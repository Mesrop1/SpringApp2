package com.mes;

import org.springframework.stereotype.Component;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    //Homework 2,music list
    private List<String> songs = new ArrayList<>();

//    private ClassicalMusic() {}
//
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    public void doMyInit() {
//        System.out.println("Doing my initialization");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }

    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
