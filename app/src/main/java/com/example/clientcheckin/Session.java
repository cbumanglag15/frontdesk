package com.example.clientcheckin;

import java.net.URL;
import java.net.URLConnection;

public class Session {

    private static Session session;

    public static Session getSession() {
        if (session == null) {
            session = new Session();
        }

        return session;
    }

    public int attemptServerConnection() {
        try {
            URL url = new URL("http://localhost:8080/cci-server/ConnectionManager");
            URLConnection connection = url.openConnection();

            return 1;
        } catch (Exception e) {

        }
        return 0;
    }

}
