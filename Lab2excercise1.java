import java.io.*;

public class Lab2excercise1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int sum = 0, a = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number " + (i + 1) + ":");
            String input = br.readLine();
            a = Integer.parseInt(input);
            sum += a;
        }
        System.out.println("The sum is " + sum);
    }
}
