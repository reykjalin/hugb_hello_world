package com.bangsapabbi.helloworld;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        String port = System.getenv("PORT");
        if(port != null)
            setPort(Integer.valueOf(port));

        World world = new World();    
        get("/random", (req, res) -> world.greet());
    }
}
