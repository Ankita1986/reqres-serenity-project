package com.req.res.utils;

import java.util.Random;

/**
 * Created by Ankita
 */
public class TestUtils {

    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }


}
