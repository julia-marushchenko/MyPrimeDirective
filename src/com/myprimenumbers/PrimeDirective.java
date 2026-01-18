/**
 *  Java program to find prime numbers and store them in ArrayList.
 */
package com.myprimenumbers;

// Import statement:
import java.util.ArrayList;

/**
 *  PrimeDirective class.
 */
class PrimeDirective {

    // Method isPrime to find out is number is prime.
    public boolean isPrime(int number) {

        if(number == 2){
            return true;
        } else if(number < 2) {
            return false;
        }

        for(int i = 2; i < number; i++) {
            if(number % 2 == 0){
                return false;
            }
        }
        //return true;

        if(number > 1 && number % number == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method onlyPrimes() to store prime numbers in ArrayList.
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(Integer element : numbers){
            if(isPrime(element)) {
                primes.add(element);
            }
        }
        return primes;
    }


    // Main method to run java program.
    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println(pd.isPrime(7));
        System.out.println(pd.isPrime(28));
        System.out.println(pd.isPrime(28));
        System.out.println(pd.isPrime(2));
        System.out.println(pd.isPrime(0));
        System.out.println(pd.isPrime(1));

        System.out.println(pd.onlyPrimes(numbers));


    }

}