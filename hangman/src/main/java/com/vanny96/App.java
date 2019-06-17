package com.vanny96;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
    public static String secretWord;
    public static ArrayList<String> displayedWord = new ArrayList<String>();

    public static void main(String[] args) {
        secretWord = choseWord();
        assignDispWord();
        displayWord();
    }

    public static String choseWord() {
        ArrayList<String> words = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("./hangman/src/main/files/words.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        int randomNum = random.nextInt(words.size());
        return words.get(randomNum);
    }

    public static void assignDispWord(){
        String[] secretCharacters = secretWord.split("");
        for(int i=0; i<secretCharacters.length; i++){
            displayedWord.add("_");
        }
    }

    public static void displayWord(){
        for(String letter:displayedWord){
            System.out.print(letter + " ");
        }
        System.out.print("\n");
        return;
    }
}
