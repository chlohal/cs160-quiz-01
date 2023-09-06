import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class StaircaseResult {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        for(int i = 0; i < n; i++) {
            //size of the spaces will be `totalHeight - 1 - i`
            String line = repeat(" ", n - 1 - i) 
                //and there will be `i + 1` hashes
                + repeat("#", i + 1);
            
            System.out.println(line);
        }
    }
    public static String repeat(String str, int n) {
        StringBuilder sb = new StringBuilder(str.length() * n);
        for(int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}

public class StaircaseSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        StaircaseResult.staircase(n);

        bufferedReader.close();
    }
}
