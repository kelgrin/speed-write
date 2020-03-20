import java.io.*;

public class FileWork {

    public static void space() throws IOException {
        File in = new File("C:\\Users\\kelgrin\\Desktop\\test\\test.txt");
       // File in2 = new File("C:\\Users\\kelgrin\\Desktop");
        long buffer = in.getFreeSpace();
        double bufferGb = buffer / 1000000000;
        System.out.println("Свободное место:" + bufferGb + " Gb");
    }

    public static void file() throws IOException {
        double a = 1322494234;
        long time = System.nanoTime();
        File test = new File("C:\\Users\\kelgrin\\Desktop\\test\\test.txt");
        File test2 = new File("C:\\Users\\kelgrin\\Desktop\\test\\test2.txt");
        FileInputStream input = new FileInputStream(test);
        FileOutputStream output = new FileOutputStream(test2);
        byte[] buffer = new byte[4096];
            while (test2.length() < a) {
                int len = input.read(buffer);
                output.write(buffer);
            }
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000_000.0);
        }

     public static void deletefile(File test2){
        test2.delete();
     }
}

