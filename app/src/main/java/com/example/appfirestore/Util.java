package com.example.appfirestore;

import java.sql.Timestamp;

public class Util {

    public static long getTimestamp() {
        return new Timestamp(System.currentTimeMillis()).getTime();
    }
}
