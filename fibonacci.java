import java.lang.reflect.Array;
import java.util.*;


public class fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = 0;

        System.out.println("This program prints the first n numbers in the Fibonacci sequence.");
        System.out.println("------------------------------------------------------------------");

        try {
            while (!(number > 0)) {
                System.out.print("Enter a number n greater than 0: ");
                number = input.nextLong();
            }
        } catch (InputMismatchException ime) {
            System.out.println("Error: Incorrect input format");
        } catch (Exception e) {
            System.out.println("Error: We are unable to work with your input");
        }

        System.out.println("------------------------------------------------------------------");
        generateFibonacci(number);
    }

    public static int generateFibonacci(long l) {
        ArrayList<Long> numbers = new ArrayList<>();

        numbers.add(Long.valueOf(0));
        if(l == 1) {
            printList(numbers, l);
            return 0;
        }
        numbers.add(Long.valueOf(1));
        if(l == 2) {
            printList(numbers, l);
            return 0;
        }

        if (l > 2) {
            int f = 0, s = 1;

            for(int j = 2; j < l; j++) {
                long first = numbers.get(f), second = numbers.get(s);
                numbers.add(first+second);
                f++;
                s++;
            }
            printList(numbers, l);
        }

        return 0;
    }

    public static void printList(ArrayList<Long> list, long length) {
        System.out.print("Fibonacci Sequence (first " + length + " numbers): ");
        for (Long l: list) {
            System.out.print(l + " ");
        }
    }
}
