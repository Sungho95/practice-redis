package com.redis.practice.redis;

import org.springframework.stereotype.Component;


@Component
public class RedisKey {
    public static String SCORE_AVERAGE = "@scoreAverage";

    public String getScoreAverageKey(Long showId){
        return String.valueOf(showId) + SCORE_AVERAGE;
    }

    public String getKeyById(Object object, String var) {
        return String.valueOf(object) + var;
    }

}
