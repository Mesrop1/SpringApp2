package com.mes;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args)  {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Homework 2

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        musicPlayer.playMusic(MusicJenre.CLASSICAL);
        musicPlayer.playMusic(MusicJenre.ROCK);

        //lesson 10
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();

        //lesson 10
//        Computer computer = context.getBean("computer",Computer.class);
//        System.out.println(computer);

//        Music music1 = context.getBean("classicalMusic",Music.class);
//        Music music2 = context.getBean("rockMusic",Music.class);

//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();


//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

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
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
