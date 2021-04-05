public class Recursion_Q2
{
    public static void main(String [] args) {
        triangle(5);
        reverseTriangle(5);
    }

    public static void printStars(int n) {        
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }     

    public static void triangle(int i) {
        printStars(i);

        if (i > 0) {
            triangle(i-1);
        }
        else if (i <= 0) {
            // do nothing
            return;
        }
    }
    
    public static void reverseTriangle(int i) {
        if (i > 0) {
            reverseTriangle(i-1);
            printStars(i);
        }
        else if (i <= 0) {
            // do nothing
            return;
        }
    }    
}
