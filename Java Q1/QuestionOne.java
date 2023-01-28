import java.util.Scanner;
import java.util.StringTokenizer;

class Class1{
    public static void main(String[] args){

        Scanner inputKeyBoard = new Scanner(System.in);
        System.out.print("Please enter your sentence: ");
        String userInput = inputKeyBoard.nextLine();
        System.out.println("Output: " + userInput);

        Class2 object = new Class2();
        int totalWords = object.count_words(userInput);

        System.out.println("There are " + totalWords + " words in the sentence inputted.");
    }
}

class Class2{
    public String str;

    public void Class2(String str){
        this.str = str;
    }
        public int count_words(String str){
            StringTokenizer words = new StringTokenizer(str);
            return words.countTokens();
        }
}