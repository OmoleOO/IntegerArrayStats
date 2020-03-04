public class IntegerArrayStats {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 4, 10};
        int min = findMinimum(numbers);
        int average = findAverage(numbers);
        System.out.println("Minimum number: " + min);
        System.out.println("Average number: " + average);
    }

    private static int findMinimum(int[] numbers){
        int min = numbers[0];
        for (int number : numbers ){
            if ( number < min )
                min = number;
        }
        return min;
    }
    
    private static int findAverage(int[] numbers) {
        int total = 0;
        for ( int number : numbers )
            total += number;
        return total / numbers.length;
    }
}
