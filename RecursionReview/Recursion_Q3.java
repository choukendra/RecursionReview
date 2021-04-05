public class Recursion_Q3
{
    public static void main(String [] args) {
        String output = reverse("Hello");
        System.out.println(output);
    }
    
    public static String reverse(String word) {
        if (word.length() == 1) {
            return word;
        }
        else {
            // take first character to end
            // call  recrusive function for remaining 
            return reverse(word.substring(1)) + word.charAt(0);
        }
    }
}
