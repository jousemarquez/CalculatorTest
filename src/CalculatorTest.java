import org.junit.Assert;
import static org.junit.Assert.*;

class CalculatorTest {
    private static final double DELTA = 1e-15;

    private void assertArrayEquals(double expectedResult, double result, double delta) {
    }

    // Add TESTS
    @org.junit.jupiter.api.Test
    public void addEquivalence1() {
        System.out.println("Add Equivalence 1");
        Calculator instance = new Calculator();
        double expectedResult = 35.0;
        double result = instance.add(10.0,25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void addEquivalence2() {
        System.out.println("Add Equivalence 2");
        Calculator instance = new Calculator();
        double expectedResult = 15.0;
        double result = instance.add(-10.0,25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void addEquivalence3() {
        System.out.println("Add Equivalence 3");
        Calculator instance = new Calculator();
        double expectedResult = -35.0;
        double result = instance.add(-10.0,-25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void addLimitsValues1() {
        System.out.println("Add Limit Values 1");
        Calculator instance = new Calculator();
        double expectedResult = 1390121.1;
        double result = instance.add(717229.82,672891.28);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void addLimitsValues2() {
        System.out.println("Add Limit Values 2");
        Calculator instance = new Calculator();
        double expectedResult = -1390121.1;
        double result = instance.add(-717229.82,-672891.28);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void addLimitsValues3() {
        System.out.println("Add Limit Values 3");
        Calculator instance = new Calculator();
        double expectedResult = 0.0;
        double result = instance.add(0.0,0.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void addRandomValues1() {
        System.out.println("Add Random Values 1");
        Calculator instance = new Calculator();
        double expectedResult = 54.31;
        double result = instance.add(43.21,10.10);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void addRandomValues2() {
        System.out.println("Add Random Values 2");
        Calculator instance = new Calculator();
        double expectedResult = -27.30;
        double result = instance.add(50.70,-78.00);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void addRandomValues3() {
        System.out.println("Add Random Values 3");
        Calculator instance = new Calculator();
        double expectedResult = 432.90;
        double result = instance.add(0.90,432.00);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    // Subtract TESTS

    @org.junit.jupiter.api.Test
    public void subtractEquivalence1() {
        System.out.println("Subtract Equivalence 1");
        Calculator instance = new Calculator();
        double expectedResult = -15.0;
        double result = instance.subtract(10.0,25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void subtractEquivalence2() {
        System.out.println("Subtract Equivalence 2");
        Calculator instance = new Calculator();
        double expectedResult = -35.0;
        double result = instance.subtract(-10.0,25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void subtractEquivalence3() {
        System.out.println("Subtract Equivalence 3");
        Calculator instance = new Calculator();
        double expectedResult = 15.0;
        double result = instance.subtract(-10.0,-25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void subtractLimitsValues1() {
        System.out.println("Subtract Limit Values 1");
        Calculator instance = new Calculator();
        double expectedResult = 44338.54;
        double result = instance.subtract(717229.82,672891.28);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void subtractLimitsValues2() {
        System.out.println("Subtract Limit Values 2");
        Calculator instance = new Calculator();
        double expectedResult = -1390121.1;
        double result = instance.subtract(-717229.82,672891.28);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void subtractLimitsValues3() {
        System.out.println("Subtract Limit Values 3");
        Calculator instance = new Calculator();
        double expectedResult = 0.0;
        double result = instance.subtract(0.0,0.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void subtractRandomValues1() {
        System.out.println("Subtract Random Values 1");
        Calculator instance = new Calculator();
        double expectedResult = 33.11;
        double result = instance.subtract(43.21,10.10);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void subtractRandomValues2() {
        System.out.println("Subtract Random Values 2");
        Calculator instance = new Calculator();
        double expectedResult = 128.70;
        double result = instance.subtract(50.70,-78.00);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void subtractRandomValues3() {
        System.out.println("Subtract Random Values 3");
        Calculator instance = new Calculator();
        double expectedResult = -431.1;
        double result = instance.subtract(0.90,432.00);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    // Multiply TESTS

    @org.junit.jupiter.api.Test
    public void multiplyEquivalence1() {
        System.out.println("Multiply Equivalence 1");
        Calculator instance = new Calculator();
        double expectedResult = 250.0;
        double result = instance.subtract(10.0,25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void multiplyEquivalence2() {
        System.out.println("Multiply Equivalence 2");
        Calculator instance = new Calculator();
        double expectedResult = -250.0;
        double result = instance.subtract(-10.0,25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void multiplyEquivalence3() {
        System.out.println("Multiply Equivalence 3");
        Calculator instance = new Calculator();
        double expectedResult = 250.0;
        double result = instance.subtract(-10.0,-25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void multiplyLimitsValues1() {
        System.out.println("Multiply Limit Values 1");
        Calculator instance = new Calculator();
        double expectedResult = 48255222.2896;
        double result = instance.subtract(717229.82,67.28);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void multiplyLimitsValues2() {
        System.out.println("Multiply Limit Values 2");
        Calculator instance = new Calculator();
        double expectedResult = -165113476.862;
        double result = instance.subtract(-717229.82,230.21);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void multiplyLimitsValues3() {
        System.out.println("Multiply Limit Values 3");
        Calculator instance = new Calculator();
        double expectedResult = 0.0;
        double result = instance.subtract(0.0,0.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void multiplyRandomValues1() {
        System.out.println("Multiply Random Values 1");
        Calculator instance = new Calculator();
        double expectedResult = 436.421;
        double result = instance.subtract(43.21,10.10);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void multiplyRandomValues2() {
        System.out.println("Multiply Random Values 2");
        Calculator instance = new Calculator();
        double expectedResult = -3954.6;
        double result = instance.subtract(50.70,-78.00);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void multiplyRandomValues3() {
        System.out.println("Multiply Random Values 3");
        Calculator instance = new Calculator();
        double expectedResult = 388.8;
        double result = instance.subtract(0.90,432.00);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    // Divide TESTS

    @org.junit.jupiter.api.Test
    public void divideEquivalence1() {
        System.out.println("Divide Equivalence 1");
        Calculator instance = new Calculator();
        double expectedResult = 0.4;
        double result = instance.subtract(10.0,25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void divideEquivalence2() {
        System.out.println("Divide Equivalence 2");
        Calculator instance = new Calculator();
        double expectedResult = -250.0;
        double result = instance.subtract(-10.0,25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void divideEquivalence3() {
        System.out.println("Divide Equivalence 3");
        Calculator instance = new Calculator();
        double expectedResult = -0.4;
        double result = instance.subtract(-10.0,-25.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void divideLimitsValues1() {
        System.out.println("Divide Limit Values 1");
        Calculator instance = new Calculator();
        double expectedResult = 10660.3718787;
        double result = instance.subtract(717229.82,67.28);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void divideLimitsValues2() {
        System.out.println("Divide Limit Values 2");
        Calculator instance = new Calculator();
        double expectedResult = -3115.54589288;
        double result = instance.subtract(-717229.82,230.21);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void divideLimitsValues3() {
        System.out.println("Divide Limit Values 3");
        Calculator instance = new Calculator();
        double expectedResult = Double.POSITIVE_INFINITY;
        double result = instance.subtract(503.0,0.0);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void divideRandomValues1() {
        System.out.println("Divide Random Values 1");
        Calculator instance = new Calculator();
        double expectedResult = 4.27821782178;
        double result = instance.subtract(43.21,10.10);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void divideRandomValues2() {
        System.out.println("Divide Random Values 2");
        Calculator instance = new Calculator();
        double expectedResult = -0.65;
        double result = instance.subtract(50.70,-78.00);
        assertArrayEquals(expectedResult,result,DELTA);
    }

    @org.junit.jupiter.api.Test
    public void divideRandomValues3() {
        System.out.println("Divide Random Values 3");
        Calculator instance = new Calculator();
        double expectedResult = 0.00208333333;
        double result = instance.subtract(0.90,432.00);
        assertArrayEquals(expectedResult,result,DELTA);
    }
}