public class NumOfOccurrences {
    public static int countNumOccurences(char[] charArray, char occurrenceCharacter) {
        int numOfOccurrences = 0;

        //for each character inside the char array
        //if the character is equal to the given character passed as an argument
        //then increment the count for tracking num of occurrences
        for (char character : charArray) {
            if (character == occurrenceCharacter) {
                numOfOccurrences++;
            }
        }
        return numOfOccurrences;
    }

    public static void main(String[] args) {

        //initialize an array of characters
        char[] charArray = {'a', 'a', 'd', 'b', 'a', 'f', 'f', 'z', 'a'};

        //initialize the
        char occurrenceCharacter = 'a';
        int numOfOccurrences = countNumOccurences(charArray, occurrenceCharacter);
        System.out.println("The character '" + occurrenceCharacter + "' occurs " + numOfOccurrences + " times in the array.");
    }


}
