import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        System.out.println(IntStream.range(a,b).mapToLong(i -> i).sum());

        }
    }
