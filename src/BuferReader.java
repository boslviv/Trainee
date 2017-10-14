import java.io.*;

public class BuferReader {
    public static void main(String[] args) throws IOException {
        System.out.print("Введіть ваш текст : ");
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String s = sc.readLine();
        System.out.println();
        System.out.println ("Ви ввели : "+s);
    }
}
