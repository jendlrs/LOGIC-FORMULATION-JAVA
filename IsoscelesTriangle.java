public class IsoscelesTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle
        
        //Loop
        for (int i = 1; i <= rows; i++) {
            //Inside loop to print spaces before the asterisks
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            //Loop to print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            //Move to the next line
            System.out.println();
        }
    }
}