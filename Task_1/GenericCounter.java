import java.util.*;
import java.util.function.Predicate;

public class GenericCounter {

    // Generic method to count elements with a given property
    public static <T> long countMatching(Collection<T> collection, Predicate<T> condition) {
        return collection.stream().filter(condition).count();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        long oddCount = countMatching(numbers, n -> n % 2 != 0);
        System.out.println("Count of odd numbers: " + oddCount);

        // Count prime numbers
        long primeCount = countMatching(numbers, GenericCounter::isPrime);
        System.out.println("Count of prime numbers: " + primeCount);

        // Count palindromes
        List<String> words = Arrays.asList("madam", "hello", "racecar", "world", "level");
        long palindromeCount = countMatching(words, GenericCounter::isPalindrome);
        System.out.println("Count of palindromes: " + palindromeCount);
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Helper method to check if string is palindrome
    private static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
