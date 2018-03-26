package com.moduloclass.testing;

public class Modulo {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Nummer soll nicht 0 sein");
        if (number % 3 == 0) return "Tic";
        if (number % 5 == 0) return "Tac";

        return String.valueOf(number);
    }
}