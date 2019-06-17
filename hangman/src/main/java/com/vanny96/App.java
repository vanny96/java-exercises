package com.vanny96;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static String secretWord;
    public static ArrayList<String> displayedWord = new ArrayList<String>();
    public static int attempts = 0;

    public static void main(String[] args) {
        secretWord = choseWord();
        assignDispWord();
        displayWord();

        play();
    }

    public static void play(){
        Scanner reader = new Scanner(System.in);

        while(displayedWord.contains("_")){
            System.out.println((6-attempts) + " attempts left!");
            String letter = getLetter(reader);

            playLetter(letter);
            displayWord();

            if(attempts > 5){
                System.out.println("You lost!");
                return;
            }
        }

        reader.close();
        System.out.println("You won!");
        return;
    }

    public static String getLetter(Scanner reader){
        String letter;
        while(true){
            System.out.println("Enter a letter");
            letter = reader.nextLine();

            if(letter.length()>1){
                System.out.println("Enter only a letter");
                continue;
            } else {
                break;
            }
        }
        return letter;
    }

    public static void playLetter(String letter){
        String[] secretCharacters = secretWord.split("");
        ArrayList<Integer> indexes = new ArrayList<Integer>();

        for(int i=0; i<secretCharacters.length; i++){
            if(secretCharacters[i].equals(letter)){
                indexes.add(i);
            }
        }

        for(Integer index:indexes){
            displayedWord.set(index, letter);
        }

        if(indexes.size() == 0){
            attempts += 1;
        }

        return;
    }

    //Initializing methods

    public static String choseWord() {
        ArrayList<String> words = new ArrayList<String>();

        try {
            URL url = App.class.getResource("words.txt");
            BufferedReader br = new BufferedReader(new FileReader(url.getPath()));
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

    public static ArrayList<String> assignDispWord(){
        String[] secretCharacters = secretWord.split("");

        for(int i=0; i<secretCharacters.length; i++){
            displayedWord.add("_");
        }
        

        return displayedWord;
    }

    public static void displayWord(){
        for(String letter:displayedWord){
            System.out.print(letter + " ");
        }
        System.out.print("\n");
        return;
    }
}
