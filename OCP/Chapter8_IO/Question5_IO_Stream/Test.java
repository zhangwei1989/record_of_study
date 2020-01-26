import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {

        /** ./ 是多余的 */
//        try(FileInputStream fis = new FileInputStream("./test1.txt");
        
        /*try(FileInputStream fis = new FileInputStream("test1.txt");
            InputStreamReader isr = new InputStreamReader(fis)) {
            while (isr.ready()) {
                isr.skip(1);
                int i = isr.read();
                char c = (char) i;
                System.out.println(c);
            }
        }*/
        
        /** InputStream/OutputStream */
        try(InputStream is = new FileInputStream("test1.txt");
            OutputStream os = new FileOutputStream("output1.txt")) {
            byte[] buffer = new byte[10];
            int byteRead = 0;
            while ((byteRead = is.read(buffer)) != -1) {
                System.out.println(buffer);
                System.out.println(byteRead);
                os.write(buffer, 0, byteRead);
                System.out.println("Read and written bytes " + byteRead);
            }
        }
    }
}