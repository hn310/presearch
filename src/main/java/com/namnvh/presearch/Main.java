package com.namnvh.presearch;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static final String url = "https://www.presearch.org/extsearch?term=";
    private static final String[] keywords = { "snow", "solid", "entire", "outline", "red", "available", "over", "bag",
            "place", "clearly", "written", "seat", "nearest", "fellow", "flies", "lamp", "cover", "tomorrow", "half",
            "spring", "explore", "customs", "road", "pocket", "pour", "sky", "industrial", "necessary", "variety",
            "further", "mix", "allow", "sign", "mouth", "appearance", "cloud", "thirty", "principal", "tropical",
            "able", "sit", "steady", "everywhere", "curve", "coffee", "jar", "thick", "fuel", "draw", "leather",
            "situation", "cold", "tree", "surprise", "furniture", "larger", "passage", "west", "does", "trade", "luck",
            "too", "speak", "horn", "many", "mother", "wolf", "station", "pack", "but", "sure", "pride", "aloud",
            "potatoes", "death", "key", "pie", "stood", "bad", "constantly", "left", "close", "earth", "winter", "weak",
            "onto", "characteristic", "source", "hard", "straight", "political", "movement", "could", "although",
            "different", "meal", "exactly", "if", "familiar", "within", "wind", "somewhere", "threw", "step", "hurry",
            "nervous", "percent", "sky", "damage", "needs", "bus", "rocket", "claws", "original", "surrounded",
            "fierce", "minerals", "trail", "children", "replied", "nails", "equipment", "beautiful", "straw", "slip",
            "earlier", "row", "progress", "kept", "spend", "fifty", "highest", "thumb", "easier", "flame", "was",
            "important", "refused", "these", "letter", "final", "dream", "gasoline", "valley", "paper", "smooth",
            "herself", "gather", "mad", "birth", "tape", "sad", "produce", "ruler", "rule", "moving", "became", "feel",
            "curve", "nearest", "plant", "job", "during", "canal", "program", "unhappy", "agree", "forget", "barn",
            "rice", "already", "class", "two", "thy", "completely", "fifty", "positive", "neighbor", "depth", "guess",
            "line", "list", "dog", "till", "world", "solve", "dress", "have", "sets", "sitting", "finest", "aloud",
            "coast", "trail" };

    public static void main(String[] args) throws IOException, InterruptedException {
        Desktop.getDesktop().browse(URI.create("https://coinmarketcap.com/account/my-diamonds/"));
        
        for (int i = 0; i < 15; i++) {
            Desktop.getDesktop().browse(URI.create(url + getRandomKeyword()));
            int randomSleepTime = ThreadLocalRandom.current().nextInt(10000, 30000 + 1); // 10s-30s
            Thread.sleep(randomSleepTime);
        }
    }

    private static String getRandomKeyword() {
        int rnd = new Random().nextInt(keywords.length);
        return keywords[rnd];
    }

}
