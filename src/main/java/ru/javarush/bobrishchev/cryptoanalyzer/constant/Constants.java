package ru.javarush.bobrishchev.cryptoanalyzer.constant;

public class Constants {
    private static final String RUS = "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЁЯЧСМИТЬБЮ";
    private static final String ENG = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String CYPHER = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*(){}[]";
    private static final String ALPHABET = RUS + ENG + RUS.toLowerCase() + ENG.toLowerCase() + CYPHER + SYMBOLS;
}
