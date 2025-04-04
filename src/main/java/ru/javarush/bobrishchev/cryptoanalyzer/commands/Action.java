package ru.javarush.bobrishchev.cryptoanalyzer.commands;

import ru.javarush.bobrishchev.cryptoanalyzer.entity.Result;

public interface Action {
    Result execute(String[] params);
}
