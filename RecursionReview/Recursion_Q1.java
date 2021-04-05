public class Recursion_Q1
{
    public static void main(String [] args) {
        int test = (new Fraction()).gcd(252,105);
        System.out.println("From Fraction Class, the GCD is " + test);
        
        test = euclidGCD(252, 105);
        if (test != -99) {
            System.out.println("Yes, GCD has been found and it's " + test);
        }
    }
    
    public static int euclidGCD(int i, int j) {
        System.out.println("In eclidGCD:  i = " + i + ", j = " + j);
        if (i < 0 || j < 0) {
            System.out.println("Both number must be positive.");
            return -99;
        }

        if (i == j) {
            System.out.println("In eclidGCD:  GCD found, and it's " + i);
            return i;
        }        
        
        if (i > j) {
            i = i - j;
        }
        else {
            j = j - i;
        }
        return euclidGCD(i, j);
    }
}
