import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        CountDown countDown = new CountDown(a);
        ColorRun colorRun = new ColorRun();

        countDown.start();
        colorRun.start();
        sc.close();
    }
}

class CountDown extends Thread {
    public static boolean stop = false;
    int a;

    public CountDown(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = a; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        stop = true;
    }
}

class ColorRun extends Thread {
    String BLUE = "\u001B[34m";
    String RED = "\u001B[31m";
    boolean red = true;

    @Override
    public void run() {
        while (!CountDown.stop) {
            if (red == true) {
                System.out.println(RED + "RED");
                red = false;
            } else if (red == false) {
                System.out.println(BLUE + "BLUE");
                red = true;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}