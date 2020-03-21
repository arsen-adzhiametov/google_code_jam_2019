import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
            final String initialInteger = in.next();
            BigInteger initial = new BigInteger(initialInteger);
            BigInteger firstPart = calculate(initial);
            System.out.println("Case #" + i + ": " + firstPart + " " + (initial.subtract(firstPart)));
        }
    }

    private static BigInteger calculate(BigInteger initialBI) {
        String initial = initialBI.toString();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < initial.length(); i++) {
            char potentialFour = initial.charAt(i);
            if (potentialFour == '4') {
                result.append("1");
            } else {
                result.append("0");
            }
        }
        return new BigInteger(result.toString());
    }
}
