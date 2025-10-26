package static2.ex;

public class MathArrayUtils {
    private int[] numbers;
    static int value;

    private MathArrayUtils() {
//        private: 인스턴스의 생성을 막는다.
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static double average(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }

    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if(number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }
}
