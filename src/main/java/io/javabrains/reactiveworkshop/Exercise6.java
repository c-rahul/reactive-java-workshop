package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.time.Duration;

public class Exercise6 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.unresponsiveFlux() and ReactiveSources.unresponsiveMono()

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        ReactiveSources.unresponsiveFlux().blockFirst(Duration.ofSeconds(5));


        System.out.println("Press a key to end");
        System.in.read();
    }

}