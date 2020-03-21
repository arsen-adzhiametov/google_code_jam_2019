import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
            final int maxPrime = in.nextInt();
            final int quantityOfNumbers = in.nextInt();
            int[] arr = new int[quantityOfNumbers];
            for (int j = 0; j < quantityOfNumbers; j++) {
                arr[j] = in.nextInt();
            }
            System.out.println("Case #" + i + ": " + Arrays.toString(arr));

            int[] ints = Arrays.copyOf(arr, arr.length);
            Arrays.sort(ints);
            System.out.println(Arrays.toString(ints));


        }

    }

}
