import java.io.*;
import java.util.Scanner;

public class FileWork {

    public void space() throws IOException {
        File in = new File("C:\\Users\\kelgrin\\Desktop\\test\\test.txt");
        long buffer = in.getFreeSpace();
        double bufferGb = buffer / 1000000000;
        System.out.println("Свободное место:" + bufferGb + " Gb");
    }

    public void file() throws IOException {
        Scanner l = new Scanner(System.in);
        int n;
        double a = 1322494234, q = 0, j = 1;
        long time = System.nanoTime();
        File test2 = File.createTempFile("test2", null, null);
        FileOutputStream output = new FileOutputStream(test2);
        System.out.print("Введите размер буффера: ");
        n = l.nextInt();
        byte[] buffer = new byte[n];

        while (test2.length() < a) {
            output.write(buffer);
            q = (n * j * 100) / a;
            j++;
            if (j % 2 != 0) {
                System.out.print(String.format("%(.2f ", q) + "%\r");
            }

        }
        System.out.println("");
        time = System.nanoTime() - time;
        output.close();
        System.out.printf("Прошло %,9.3f ms\n", time / 1_000_000_000.0);
        deletefile(test2);
    }

    public void deletefile(File t) {
        t.delete();
    }
}

