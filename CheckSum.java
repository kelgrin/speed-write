import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CheckSum {
    public static void checksum() throws NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        FileInputStream in = new FileInputStream("C:\\Users\\kelgrin\\Desktop\\test\\test.txt");
        byte[]buf = new byte[1024];
        byte[] dataBytes = new byte[1024];
        int bytesRead;
        while((bytesRead = in.read(dataBytes)) > 0) {
            md.update(dataBytes, 0, bytesRead);
        }
        byte[] mdBytes = md.digest();
        //Пepeвoдиm koнтpoльнyю cymmy в видe maccивa бaйт в           
        //шecтнaдцaтepичнoe пpeдcтaвлeниe            
         StringBuilder sb = new StringBuilder();
         for(int i = 0; i < mdBytes.length; i++) {
        sb.append(Integer.toString((mdBytes[i] & 0xff) + 0x100, 16)
                .substring(1));
         }
        System.out.println("Koнтpoльнaя cymma: " + sb.toString());
    }
}
