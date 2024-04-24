package amd;
import java.io.*;

public class BufferReaderMarkInvalidEx {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("F:\\Antosh\\Java\\buf.txt");
            // Create a BufferedInputStream with a smaller buffer size
            BufferedInputStream bis = new BufferedInputStream(fis, 2); // Buffer size of 2 bytes

            // Set the read limit to 3
            bis.mark(3);

            System.out.print((char) bis.read());
            System.out.print((char) bis.read());
            System.out.print((char) bis.read());

            // Try to read more characters than the read limit
            System.out.print((char) bis.read()); // Read 4th character

            // Reset to the marked position
            bis.reset();

            // Try to read again after reset
            System.out.print((char) bis.read());
            System.out.print((char) bis.read());
            System.out.print((char) bis.read());

            // Close the streams
            bis.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
