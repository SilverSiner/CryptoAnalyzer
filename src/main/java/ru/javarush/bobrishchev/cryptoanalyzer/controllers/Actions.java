package ru.javarush.bobrishchev.cryptoanalyzer.controllers;

import ru.javarush.bobrishchev.cryptoanalyzer.commands.Action;
import ru.javarush.bobrishchev.cryptoanalyzer.commands.Decoder;
import ru.javarush.bobrishchev.cryptoanalyzer.commands.Encoder;
import ru.javarush.bobrishchev.cryptoanalyzer.exception.AppExceptions;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action findAction(String actionName) {
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppExceptions(actionName + " is not found", e);
        }
    }
}
