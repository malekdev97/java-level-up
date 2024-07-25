package bruteforce;

public class BruteForce {

    public static void bruteForce(String characters, int length) { 
        char[] combination = new char[length]; // array will be used to store the generated combinations.
        generateCombinations(characters, combination, length, 0);
    }

    public static void generateCombinations(String characters, char[] combination, int length, int position) {
        if (position == length) {
            System.out.println(combination);
        } else {
            for (int i = 0; i < characters.length(); i++) {
                combination[position] = characters.charAt(i);
                generateCombinations(characters, combination, length, position + 1);
            }
        }
    }

    public static void main(String[] args) {
        String characters = "abc";
        int length = 3;
        bruteForce(characters, length);
    }
}
