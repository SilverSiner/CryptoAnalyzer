package ru.javarush.bobrishchev.cryptoanalyzer.controllers;

import ru.javarush.bobrishchev.cryptoanalyzer.commands.Action;
import ru.javarush.bobrishchev.cryptoanalyzer.entity.Result;

public class MainController {

    public Result doAction(String actionName, String[] params){
        // action == encode
        // params == [text.txt to encode.txt 12]
        Action action = Actions.findAction(actionName);
        Result result = action.execute(params);
        return result;
    }
}
