package ru.javarush.bobrishchev.cryptoanalyzer.commands;

import ru.javarush.bobrishchev.cryptoanalyzer.entity.Result;
import ru.javarush.bobrishchev.cryptoanalyzer.entity.ResultCode;

public class Decoder implements Action{
    @Override
    public Result execute(String[] params) {
        // TODO something is done
        return new Result("Decode is alright", ResultCode.OK);
    }
}
