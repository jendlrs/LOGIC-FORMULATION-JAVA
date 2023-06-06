public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";

        //Reverse the original string
        for (int i = original.length()-1; i >= 0; i--){
            reversed += original.charAt(i);
        }
        
        //Check if the original and reversed strings are equal.
        if (original.equals(reversed)){
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not palindrome.");
        }
        
    }
}
