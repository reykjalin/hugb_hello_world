package com.bangsapabbi.helloworld;

import net.joningi.icndb.ICNDBClient;

public class World {
    final ICNDBClient client = new ICNDBClient();

    public String greet() {
        return client.getRandom().getJoke();
    }
}
