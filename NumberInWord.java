public class NumberInWord {

    public static void printNumberInWord(int number) {
        String numberInWord;
        
        switch (number) {
            case 0 -> numberInWord = "ZERO";
            case 1 -> numberInWord = "ONE";
            case 2 -> numberInWord = "TWO";
            case 3 -> numberInWord = "THREE";
            case 4 -> numberInWord = "FOUR";
            case 5 -> numberInWord = "FIVE";
            case 6 -> numberInWord = "SIX";
            case 7 -> numberInWord = "SEVEN";
            case 8 -> numberInWord = "EIGHT";
            case 9 -> numberInWord = "NINE";
            default -> numberInWord = "OTHER";
        }
        System.out.println(numberInWord);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Test cases:");
        printNumberInWord(0);   // Output: ZERO
        printNumberInWord(5);   // Output: FIVE
        printNumberInWord(9);   // Output: NINE
        printNumberInWord(10);  // Output: OTHER
        printNumberInWord(-1);  // Output: OTHER
    }
}
