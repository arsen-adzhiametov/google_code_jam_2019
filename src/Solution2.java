import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
            final int cells = in.nextInt();
            final String path = in.next();
            String resultPath = find(path);
            System.out.println("Case #" + i + ": " + resultPath);
        }

    }

    private static String find(String path) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'S') {
                builder.append('E');
            } else {
                builder.append('S');
            }
        }
        return builder.toString();
    }
}
