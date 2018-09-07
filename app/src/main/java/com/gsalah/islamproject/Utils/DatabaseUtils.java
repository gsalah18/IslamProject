package com.gsalah.islamproject.Utils;

public class DatabaseUtils {

    private static DatabaseUtils instance;

    public synchronized static DatabaseUtils getInstance() {
        if (instance == null) {
            instance = new DatabaseUtils();
        }
        return instance;
    }
}
