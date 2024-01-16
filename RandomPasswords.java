import java.util.Random; 

/**
 * Write a description of class RandomPasswords here.
 *
 * @author (Amelia Zhang az111)
 * @version (2/10)
 */
public class RandomPasswords
{
    /**
     * pseudocode: 
     * 
     * vowel = "aeiou"
     * non-vowel = "bcdfghjklmnpqrstvwxyz"
     * 
     * pick a random password length (int) that's greater than 3 and less than 10 
     * 
     * alternate between vowel and non-vowel
     * 
     * String password;
     * 
     * for(int i=0; i<= wordLength; i++)
     *  if x % 2 == 0
     *      add non-vowel (use random method to pick random char in non-vowel)
     *  else
     *      add vowel (use random method to pick random char in vowel)
     *      
     * return password
     */

    /**
     * method checks whether input is event
     * @param int integer assessed for evenness 
     * @return boolean whether or not number is even
     */
    public static boolean isEven(int n){
        return (n % 2) == 0; 
    }

    /**
     * method checks whether input is a vowel
     * @param char character assessed as vowel or not 
     * @return boolean whether or not char is vowel 
     */
    public static boolean isVowel(char ch){
        return (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u');
    }

    /**
     * method creates password with inputted amount of letters starting with nonvowel letter 
     * @param int integer for length of word
     * @return String randomly generated password 
     */
    public static String generateRandomPassword(int wordLength){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        Random random = new Random();

        for(int i = 0; i < wordLength; i++){
            if (isEven(i)){ //want to produce nonvowel
                int randChar = random.nextInt(0,26);
                while(isVowel(alphabet.charAt(randChar))){
                    randChar = random.nextInt(0,26);
                }
                password = password +  alphabet.charAt(randChar);
            }
            else{ //want to produce vowel
                int randVowel = random.nextInt(0,26);
                while(! isVowel(alphabet.charAt(randVowel))){
                    randVowel = random.nextInt(0,26);
                }
                password = password +  alphabet.charAt(randVowel);
            }
        }
        return password; 
    }

    /**
     * main method that runs generateRandomPassword 5 times, each with a different word length
     */
    public static void main(String[] args){
        System.out.println(generateRandomPassword(4));
        System.out.println(generateRandomPassword(5));
        System.out.println(generateRandomPassword(6));
        System.out.println(generateRandomPassword(7));
        System.out.println(generateRandomPassword(8));
    }
}
