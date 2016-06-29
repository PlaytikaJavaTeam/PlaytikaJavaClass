package com.playtika.at.inheritanceWithComposition;

public class Dell extends Computer {

    public static void main(String[] args) {

        Dell dell = new Dell();

        dell.playMovies();
        dell.playGames();
        dell.calculate();
        dell.inputText();

        dell.mfu.print();
        dell.mfu.scan();
    }
}
