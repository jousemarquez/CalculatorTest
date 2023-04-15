public class Calculator
{
    public double add(double number1, double number2){
        return number1 + number2;
    }
    public double subtract(double number1, double number2){
        return number1 - number2;
    }
    public double multiply(double number1, double number2){
        return number1 * number2;
    }
    public double divide(double number1, double number2){
        return number1 / number2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(717229.82,672891.28));
    }
}