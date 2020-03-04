public class IntegerArrayStats {
    public static void main(String[] args) {
        int[] array = {10, 3, 4, 10};
        int min = findMinimum(array);
        System.out.println(min);
    }

    private static int findMinimum(int[] numbers){
        int min = numbers[0];
        for (int number : numbers ){
            if ( number < min )
                min = number;
        }
        return min;
    }
}
