package org.stringToCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringToCharacter {
    private List<String> listOfStrings;
    public StringToCharacter(){}
    public StringToCharacter(List<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
    }

    public static List<Character> characterList(StringToCharacter converter) {
        List<Character> convertedListOfStrings = converter.listOfStrings.stream().flatMapToInt(String::chars).mapToObj(i -> (char) i).collect(Collectors.toList());
        List<Character> newList = new ArrayList<Character>();
        for (Character element : convertedListOfStrings) {
            if (!newList.contains(element))
                newList.add( 0, (element));
        }

        return newList.stream().sorted().collect(Collectors.toList());
    }
}
