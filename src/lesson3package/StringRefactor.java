package lesson3package;

public class StringRefactor {
    private String firstString = "Предложение один";
    private String secondString = "Предложение два";
    private String thirdString = "Предложение три";
    private StringBuilder result;

    public StringRefactor() throws InterruptedException {
        result = new StringBuilder(firstString + secondString + thirdString);
    }

    public void toRefact(){
        System.out.println("\nПолучили исходную строку:\n" + result + "\n\n");
        for(int x = 0, y = 0; x < result.length(); x++){
            if((result.charAt(x) >= 'А' && result.charAt(x) <= 'Я') && x != 0){
                String tempo = result.substring(y, x);
                tempo += ". ";
                tempo += result.substring(x);
                result = new StringBuilder(tempo);
                x += 2;
            }
        }
        result = new StringBuilder(result + ".");
        System.out.println("Проставили точки между предложениями и пробелы:\n" + result + "\n\n");
    }
}
