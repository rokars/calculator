package ie.gmit;

public class Calculator {

    int x = 0;
    int y = 0;

    public Calculator() {
        x = 1;
        y = 1;
    }

    // this method will add two numbers
    public double add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    // this method will subtract two numbers
    public double subtract(int firstNum, int secondNum) {
        return secondNum - firstNum;
    }

    // this method will divide two numbers
    public double divide(int firstNum, int secondNum) {
        return secondNum / firstNum;
    }

    public double multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
}
