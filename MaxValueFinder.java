/* Finding the Maximum Value in an Array */

public class MaxValueFinder {
    public static void main(String[] args) {

    int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8};
    int max = numbers[0];

    /*
    Process here the max value will be save to max variable
    use loop
    */

   // Iterate through the array to find the maximum value
    for (int i = 0; i < numbers.length; i++) {
        // Compare each element with the current max value
        if (numbers[i] > max) {
            // If an element is greater, update the max variable
            max = numbers[i];
        }
    }

    System.out.println("The maximum value in the array is: " + max);
    }
}