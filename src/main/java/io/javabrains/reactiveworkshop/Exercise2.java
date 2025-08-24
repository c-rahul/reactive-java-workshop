package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()
        List<Integer> numbers = StreamSources.intNumbersStream().collect(Collectors.toList());

        // Print all numbers in the intNumbersStream stream
        System.out.println("Print all numbers in the intNumbersStream stream:");
        numbers.forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        System.out.println("\nPrint numbers from intNumbersStream that are less than 5:");
        numbers.stream().filter(n -> n < 5).forEach(System.out::println);


        // Print the second and third numbers in intNumbersStream that's greater than 5
        System.out.println("\nPrint the second and third numbers in intNumbersStream that's greater than 5:");
        numbers.stream()
                .filter(n -> n > 5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);


        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        System.out.println("\nPrint the first number in intNumbersStream that's greater than 5:");
        Integer value = numbers.stream()
                .filter(n -> n > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(value);

        // Print first names of all users in userStream
        System.out.println("\nPrint first names of all users in userStream:");
        StreamSources.userStream().map(User::getFirstName).forEach(System.out::println);

    }

}