package ru.javarush.bobrishchev.cryptoanalyzer;

import ru.javarush.bobrishchev.cryptoanalyzer.entity.Result;

/**
 * a Main class in CryptoAnalyzer
 * created on the 04.04.2025 by @nikita.bobrishchev
 */
public class ConsoleRunner {
    public static void main(String[] args) {
        //encode text.txt to encode.txt 12
        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);
    }
}

//        String text = "Privet kak dela?";// <<<<args
//        int key = 123; // <<<<args
//        String result = ".............."; // <<<<args