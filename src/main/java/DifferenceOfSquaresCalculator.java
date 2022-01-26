class DifferenceOfSquaresCalculator {

    // Create a class that will compute square of sum
    // e.g. (1+2+...+10)^2 = 55^2 = 3025
    int computeSquareOfSumTo(int input) {

        // Create variable for the total sum
        int sum = 0;
        // Creates a loop that will keep iterating until user input has been reached
        for (int i = 1; i <= input; i++) {
            // Calculates the sum to the current number
            sum = sum + i;
        }


        // Calculates the total sum to the power of two
        // also converts the type double to integer
        int total = (int)Math.pow(sum,2);
        return total;
        
    }

    // Creates a  class that will compute the sum of squares
    // e.g. 1^2 + 2^2 + ... + 10^2 = 385
    int computeSumOfSquaresTo(int input) {
        
        // Total sum
        int sum = 0;
        // The number that is calculated to the power of 2 is stored in this variable
        int powerOf;

        // Continually checks if i reaches the range of variable input one increment at a time
        for (int i = 1; i <= input; i++) {

            // Calculates the current number^2
            powerOf = (int) Math.pow(i, 2);
            // Adds the calculated value of powerOf to the sum
            sum = sum + powerOf;
            
        }

        return sum;

    }

    // This calculates the difference of squares using the methods from above
    int computeDifferenceOfSquares(int input) {
        int difference = 0;
        int squareOfSum = computeSquareOfSumTo(input);
        int sumOfSquare = computeSumOfSquaresTo(input);
        difference = squareOfSum - sumOfSquare;
        return difference;
    }

    /* JUST FOR TESTING */
    public static void main(String[] args) {
        //int user = computeSquareOfSumTo(5);
        //System.out.println(user);

        //int user = computeSumOfSquaresTo(5);
        //System.out.println(user);
    }
    

}

