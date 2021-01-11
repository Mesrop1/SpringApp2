package com.mes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    //Homework 2
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicJenre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (genre == MusicJenre.CLASSICAL) {
            // случайная классическая песня
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            // случайная рок песня
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }

    //lesson 11

//      private Music music1;
//      private Music music2;
//
//      @Autowired
//      public MusicPlayer(@Qualifier("classicalMusic") Music music1,
//                         @Qualifier("rockMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }
//    private String name;
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
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
//    // IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer() {}
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    //IoC using Autowired anotation
//    @Autowired
//    private Music music;

    //inverse 2 dependencies
//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }


//IoC using constructor
//    @Autowired
//    public MusicPlayer(Music music){
//        this.music = music;
//    }


    //IoC using setter mehod
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public String playMusic() {
//        return "Playing: " + music1.getSong() + " ," + music2.getSong();
////        System.out.println("Playing: " + classicalMusic.getSong());
////        System.out.println("Playing: " + rockMusic.getSong());
//    }
}
