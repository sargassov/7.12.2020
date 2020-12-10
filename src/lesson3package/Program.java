package lesson3package;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.print("\t\t\t\t\tДля того, чтобы сыграть в угадай число нужно нажать == > \"1\"\n" +
                    "\t\t\t\t\tДля того, чтобы сыграть в угадай слово нужно нажать ==> \"2\"\n"+
                    "\t\t\t\t\tДЛя того, чтобы разделить предложения нужна нажать ==> \"3\": ");

            int userChoise = corrector(0, 3);
            if(userChoise == 0) {
                System.out.println("Программа закончила работу!");
                break;
            }
            else if(userChoise == 1){
                GuessTheNumber takeGuess = new GuessTheNumber();
                takeGuess.showMeTheGame();
            }
            else if(userChoise == 2){
                GuessTheWord takeGuessWord = new GuessTheWord();
                takeGuessWord.showMeTheGame();
            }
            else{
                StringRefactor refactor = new StringRefactor();
                refactor.toRefact();
            }
        }






//        2 * Создать массив из слов String[] words = {"apple", "orange", "lemon",
//        "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
//        "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
//        "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//                сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
//                Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//                apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно, можно пользоваться:
//        String str = "apple";
//        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово
//        Используем только маленькие буквы
//
//        3 Доделать задачу с лекции.
    }

    public static int corrector(int minimal, int maximal){
        Scanner scanner = new Scanner(System.in);
        int toReturn = -1;
        boolean correct = false;
        while(!correct){
            toReturn = scanner.nextInt();
            if(toReturn < minimal || toReturn > maximal){
                System.out.print("\n\n\t\t\tВведены некорректные параметры. Выбирать необходимо " +
                        "от " + minimal + " до " + maximal + ". Попробуй еще раз: \n\n");

            }
            else correct = true;
        }
        return toReturn;
    }
}
