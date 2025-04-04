package ru.javarush.bobrishchev.cryptoanalyzer;

import ru.javarush.bobrishchev.cryptoanalyzer.controllers.MainController;
import ru.javarush.bobrishchev.cryptoanalyzer.entity.Result;
import ru.javarush.bobrishchev.cryptoanalyzer.exception.AppExceptions;

import java.util.Arrays;

public class Application {

    private final MainController mainController;
    public Application() {

        mainController = new MainController();

    }
        public Result run(String[] args) {
        if (args.length > 0) {
            String action = args[0];
            String[] params = Arrays.copyOfRange(args, 1, args.length);
            mainController.doAction(action, params);
        }
        throw new AppExceptions();
    }
}
