package ru.javarush.bobrishchev.cryptoanalyzer.constant;

import java.io.File;

public class Constants {
    private static final String RUS = "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЁЯЧСМИТЬБЮ";
    private static final String ENG = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String CYPHER = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*(){}[]";

    public static final String ALPHABET = RUS + ENG + RUS.toLowerCase() + ENG.toLowerCase() + CYPHER + SYMBOLS;
    public static final String TXT_FOLDER = System.getProperty("user.dir") + File.separator + "text" + File.separator;


}
