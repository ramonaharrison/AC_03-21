package nyc.c4q.ramonaharrison;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(returnLastWord("Access Code"));
    }

    public static String returnLastWord(String input) {
        String[] splitInput = input.split(" ");
        return splitInput[splitInput.length - 1];
    }
}
