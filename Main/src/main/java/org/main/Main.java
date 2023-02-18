package org.main;

import org.stringToCharacter.StringToCharacter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StringToCharacter character = new StringToCharacter(List.of("Hello", "world", "my", "name" ,"is", "Dmytro", "I", "am", "18", "years", "old"));
        System.out.println(new StringToCharacter().characterList(character));
    }
}