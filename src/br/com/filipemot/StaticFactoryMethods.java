package br.com.filipemot;

import java.util.*;

public class StaticFactoryMethods{
    public static void main(String args[]){
        // Static Factory methods
        Optional<Integer> empty = Optional.empty();
        Optional<Integer> one_hundreded = Optional.of(100);
        Optional<Integer> nullable = Optional.ofNullable(null);

        //Returns Flexiables
        ArrayList<Object> list = new ArrayList<>();
        List<Object> list_unmodified = Collections.unmodifiableList(list);

        //Intance Controls
        Integer one_hundreded_one = Integer.valueOf(101);
        Integer two_hundreded_one = Integer.valueOf(201);
        Integer three_hundreded_one = Integer.valueOf(301);

        List<Integer> list_agregred = Arrays.asList(one_hundreded_one,
                two_hundreded_one,
                three_hundreded_one);

        // New Format Java 9 - Many parameters in List.of
        List.of();
        List.of(one_hundreded_one);
        List.of(one_hundreded_one, two_hundreded_one);
        List.of(one_hundreded_one, two_hundreded_one, three_hundreded_one);
    }
}