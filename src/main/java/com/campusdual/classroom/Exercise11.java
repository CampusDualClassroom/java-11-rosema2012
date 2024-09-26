package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        System.out.println(blackRemote.getVolume());
        blackRemote.volumeUp();
        System.out.println(blackRemote.getVolume());

        System.out.println(blackRemote.getChannel());

        System.out.println(blackRemote.turnOn());
        System.out.println(blackRemote.isOn());
        System.out.println(blackRemote.turnOff());

    }
}