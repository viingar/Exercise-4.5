import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10000000;
        int b = 1000000000;
        System.out.println(IntStream.range(a,b).mapToLong(i -> i).sum());

        }
    }
