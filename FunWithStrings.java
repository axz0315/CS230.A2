
/**
 * FunWithStrings is a class contianing methods to check 
 * whether two words are palindromes
 *
 * @author (Amelia Zhang az111)
 * @version (2/9)
 */

public class FunWithStrings
{
    /**
     * reverseString takes a string input and returns the word in reverse order
     * 
     * @param String input string to be flipped
     * 
     * @return String string representation of original word flipped
     */
    public static String reverseString( String stringIn){
        String reverse = ""; //is this the same as String reverse;

        int indx =stringIn.length(); 

        for (int i = indx - 1; i >= 0; i--){
            reverse = reverse + stringIn.charAt(i);
        }

        return reverse; 
    }

    /**
     * areTheSame checks whether two strings are the same length and then whether they
     * contains identical letters, returning the index of the first character difference
     * 
     * @param String first string that will be compared against second string
     * @param String second string that will be compared against first string
     * 
     * @return Int position of first different letter
     * @return Int -1 if no differences between two strings 
     */
    
    public static int areTheSame(String str1, String str2){
        if (str1.length() == str2.length()){

            for(int i = 0; i < str1.length(); i++){
                if (str1.charAt(i) != str2.charAt(i)){
                    return i; 
                }
            }

        }
        return -1;
    }

    /**
     * sameBackAndForth calls upon two helper functions to check whether a string is a 
     * palindrome or not
     * 
     * @param String string that will be flipped and checked for palindrome pattern
     * 
     * @return Boolean false if word is not palindrome
     * @return Boolean true if word is palindrome 
     */
    
    public static boolean sameBackAndForth( String input1){
        String flipped = reverseString(input1);
        int areSame = areTheSame(input1, flipped);
        if (areSame != -1){
            return false;
        }
        return true;
    }

    /**
     *
     */
    public static void main(String[] args)
    {
        System.out.println("input: ' ' "); //testing blank space
        System.out.println("Expect: true");
        System.out.println("Computed: " + sameBackAndForth(""));
        
        System.out.println("input: kayak");
        System.out.println("Expect: true");
        System.out.println("Computed: " +sameBackAndForth("kayak"));
        
        System.out.println("input: racecar");
        System.out.println("Expect: true");
        System.out.println("Computed: " + sameBackAndForth("racecar"));
        
        System.out.println("input: lamanaanamal");
        System.out.println("Expect: true");
        System.out.println("Computed: " + sameBackAndForth("lamanaanamal"));
        
        System.out.println("input: carpet");
        System.out.println("Expect: false");
        System.out.println("Computed: " + sameBackAndForth("carpet"));
        
        System.out.println("input: burden");
        System.out.println("Expect: false");
        System.out.println("Computed: " + sameBackAndForth("burden"));
        
        System.out.println("input: axotcxa");
        System.out.println("Expect: false");
        System.out.println("Computed: " + sameBackAndForth("axotcxa"));
        
        System.out.println("input: slavtals");
        System.out.println("Expect: false");
        System.out.println("Computed: " + sameBackAndForth("slavtals"));

    }
}
