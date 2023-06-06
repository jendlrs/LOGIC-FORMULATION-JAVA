/*Checking for a Prime Number */

public class PrimeNumChecker {
    public static void main(String[] args) {
        int num = 29; // this is the number to test
        boolean isPrime = true;
    
        //Check if the number is divisible by any integer up to the square root of num
        for (int i = 2; i<=Math.sqrt(num); i++){
            if (num % i == 0){
                isPrime = false; //if divisible, num is not prime
                break; 
            }
        }

        if(isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}