package ejercicios;

public class Main {
    public static void main(String[] args){
        Function function = new Function();

        print(function.sumOfMultiplesOf_3_or_5(1000));
        print(function.sumOfMultiplesOf_3_or_5(1,1000));

        print(function.evenFibonacciNumbers(0,1,4000000));

        print(function.largestPrimeFactorOf(600851475143L));

        print((function.largestPalindrome()));

        print(function.smallestNumberDivisibleFrom_1_to_20());


    }
    public static <T> void print(T data) {
        System.out.println(data);
    }
}
