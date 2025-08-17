package overloading;

// And here’s how you might use this overloaded add method in the Calculator class:

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using add(int, int)
        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3));

        // Using add(int, int, int)
        System.out.println("Sum of 1, 2, and 3: " + calculator.add(1, 2, 3));

        // Using add(double, double)
        System.out.println("Sum of 1.5 and 2.5: " + calculator.add(1.5, 2.5));

        // Using add(int[])
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of array {1, 2, 3, 4, 5}: " + calculator.add(numbers));
          
    }
/* Explanation
    In this example:

    	The add(int, int) method handles two integers.
    	The add(int, int, int) method handles three integers.
    	The add(double, double) method handles two double values.
    	The add(int[]) method handles an array of integers, summing up all its elements.
    	Each overloaded method provides a unique way to add values, demonstrating method overloading based on different parameter lists.

*/





      
}

