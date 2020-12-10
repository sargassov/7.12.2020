package lesson3package;

import java.util.Scanner;

public class GuessTheWord {
    String[] words = {"apple", "orange", "lemon",
        "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
        "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
        "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    String currentWord;
    StringBuilder voidWord = new StringBuilder("###############");
    int useTry = 1;

    public GuessTheWord(){
        int randomWord = (int)(Math.random() * words.length);
        currentWord = words[randomWord];
    }

    public void showMeTheGame(){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Попытка: " + useTry + ". Попытайся угадать слово, что я загадал...");
            wordsToDisplay();
            String userWord = scanner.nextLine();
            if(userWord.equals(currentWord)){
                System.out.println("\n\n\t\t\tТы Угадал!\n\n");
                break;
            }
            else wordsNotEquals(userWord);
            useTry++;
        }

    }

    private void wordsToDisplay(){
        int x = 1;
        for(String string : words){
            if(x % 5 == 0) System.out.println();
            System.out.print(string + " ");
            x++;
            if(x == words.length - 1) System.out.print(": ");
        }
    }

    private void wordsNotEquals(String userWord){
        StringBuilder tech = new StringBuilder(voidWord);
        int smallerLength;
        if(userWord.length() < currentWord.length()) smallerLength = userWord.length();
        else smallerLength = currentWord.length();
        for(int y = 0; y < smallerLength; y++){
            if(userWord.toCharArray()[y] == currentWord.toCharArray()[y]){
                tech.setCharAt(y, currentWord.toCharArray()[y]);
            }
        }
        System.out.println("\n\nНа этот раз ты не угадал, но вот где мое и твое слово совпадают: " +
                tech);
    }
}
