package org.example;

public class BaseClass {
    public BaseClass() {
    }

    @MyAnnotation()
    public void firstMethod() {
        System.out.println("The first method has no parameters.");
    }

    public void secondMethod() {
        System.out.println("This is another public method.");
    }

    @MyAnnotation(2)
    protected void thirdMethod(double value) {
        System.out.println("A number " + value + " was passed to the third protected method.");
    }

    @MyAnnotation(10)
    protected void fourthMethod(String str, boolean fl) {
        System.out.println("This fourth method started with parameters: " + str + " and " + fl + '.');
    }

    @MyAnnotation(5)
    private void fifthMethod(String str) {
        System.out.println("The 5th method is private, it prints the given string: " + str);
    }

    @MyAnnotation(3)
    private void sixthMethod(int x, int y) {
        int sum = x + y;
        System.out.println("Summation result: " + sum);
    }


}

