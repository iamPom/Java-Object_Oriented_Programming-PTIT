
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new FileInputStream("C:\\Users\\ADMIN\\Desktop\\ThreadTest\\Thread\\src\\in.txt"));
            int a = in.nextInt();
            int[][] arr = new int[a][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            in.close();
            FileWriter out = new FileWriter("C:\\Users\\ADMIN\\Desktop\\ThreadTest\\Thread\\src\\out.txt", true);
            out.write(a + " x " + a + "\n");
            for (int i = 0; i < a; i++) {
                int tong = 0;
                for (int j = 0; j < a; j++) {
                    tong += arr[i][j];
                }
                out.write(tong + "\n");
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}