package overloading;

//Here’s a simple example of method overloading in Java. Method overloading allows a class to have multiple methods with
// the same name but different parameter lists.

//In this example, we have a Calculator class with an add method that is overloaded to handle different parameter 
// types and numbers of parameters.

public class Calculator {

    // Overloaded add method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded add method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded add method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded add method with an array of integers
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

