package chapterFour;

public class Chapter6 {
    private int perfect = 0;


    public double getCircleArea(double radius){
        return (Math.PI * Math.pow(radius , 2));

    }

    public double pythagoras(double opposite, double adjacent){
      double hypotenuse = Math.sqrt(Math.pow (opposite , 2) + Math.pow (adjacent , 2));
      return hypotenuse;
    }


    public int getPowerOfInteger(int base, int exponent) {
        int powerOfInteger = 1;

        for (int counter = 0; counter< exponent ; counter++ ){
            if (exponent > 0);
            powerOfInteger = base * powerOfInteger;
        }
        return powerOfInteger;
    }

    public Boolean isMultipleOf(int numerator, int denominator) {
        for (int counter = 0; counter < numerator; counter++) ;
        if (numerator % denominator == 0) {

            return true;
        } else {
            return false;
        }
    }

    public boolean getEvenNumbers(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else return false;
    }

    public double convertToFahrenheit(double celsius) {
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        return fahrenheit;
    }


    public double convertToCelsius(double fahrenheit) {
        double celsius = celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius;
    }
    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++){
            if (number % i == 0)
            return false;
    }
        return true;
    }

    public boolean isPerfectNumber(int number) {
        int i;
        for (i = 1; i < number; i++) {
            if (number % i == 0){
                perfect = perfect + i;
            }
            }
        if (number == perfect) {
            return true;
        }
        else return false;
    }
}
