package lesson3package;


public class GuessTheNumber {
    private int number;
    private int leftTry;

    public GuessTheNumber(){
        number = 1 + (int)(Math.random() * 9);
        leftTry = 3;
    }

    public void showMeTheGame(){
        while(leftTry > 0){
            int userGuess;
            System.out.print("\nЯ загадал число от 0 до 9. Попробуй угадать: ");
            userGuess = Program.corrector(0, 9);
            if(userGuess != number) {
                leftTry--;
                if(leftTry > 0)
                System.out.println("\nСгорела 1 попытка. Их осталось: " + leftTry +
                        ". Мое число " + (userGuess < number ? "больше" : "меньше") + " чем твое");
                else{
                    System.out.println("\nБольше нет попыток. Игра окончена!");
                    break;
                }
            }
            else {
                System.out.println("\nТы угадал! Cыргае еще раз \"1\" - да, \"0\" выход: ");
                int exitChoise = Program.corrector(0, 1);
                if(exitChoise == 0) break;
                else showMeTheGame();
            }
        }
    }
}
