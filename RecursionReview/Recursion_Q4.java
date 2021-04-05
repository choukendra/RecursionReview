public class Recursion_Q4
{
    public static void main(String [] args) {
        String myWord = "racecar";
        boolean output = isPalindrome(myWord);
        
        if (output) {
            System.out.println(myWord + " is palindrome.");
        }
        else {
            System.out.println(myWord + " is not palindrome.");
        }
        
    }
    
    public static boolean isPalindrome(String word) {
        char chFirst = word.charAt(0);
        char chLast = word.charAt(word.length()-1);
        if (chFirst != chLast) {
            return false;
        }
        else if (word.length()-2 > 0) {            
            String nextWord = word.substring(1, word.length()-1);            
            return isPalindrome(nextWord);
        }
        else {
            return true;
        }
    }
}
