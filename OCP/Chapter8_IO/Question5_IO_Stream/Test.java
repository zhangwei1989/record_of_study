import java.io.*;

class Boo implements Serializable {
    transient int ti = 10;
    static int si = 20;
    int a = 11;
}

public class Test {

    public static void main(String[] args) throws Exception {

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
            /** DataInputStream/DataOutputStream */
        try(InputStream is = new FileInputStream("output1.txt");
            OutputStream os = new FileOutputStream("output1.txt");
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);) {
//            byte[] buffer = new byte[10];
//            int byteRead = 0;
//            while ((byteRead = is.read(buffer)) != -1) {
//                System.out.println(buffer);
//                System.out.println(byteRead);
//                os.write(buffer, 0, byteRead);
//                System.out.println("Read and written bytes " + byteRead);
//            }
            dos.writeUTF("hello");
            dos.writeByte(100);

            System.out.println(dis.readUTF());
            System.out.println(dis.readByte());
        } catch (FileNotFoundException | IOException e) {
            System.out.println(e);
        }


        /** Reader/Writer */
            /** write */
        /*FileWriter fw = new FileWriter("text2.txt", true);
        fw.write("hello world again");
        fw.close();*/

            /** append */
        /*FileWriter fw = new FileWriter("text2.txt");
        fw.append("hello world again");
        fw.close();*/

        /** RandomAccessFile */
        /*RandomAccessFile raf = new RandomAccessFile("text1.txt", "r");
        System.out.println(raf.length());
        raf.seek(raf.length());
        raf.writeChars("Final Test");*/

        /** serialize and deserialize */
        /*Boo boo = new Boo();
        boo.si++;
        boo.a = 30;
        System.out.println(boo.ti + " " + boo.si + " " + boo.a);
        FileOutputStream fos = new FileOutputStream("text3.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(boo);
        os.close();

        FileInputStream fis = new FileInputStream("text3.txt");
        ObjectInputStream is = new ObjectInputStream(fis);
        boo = (Boo) is.readObject();
        System.out.println(boo.ti + " " + boo.si + " " + boo.a);
        is.close();
        System.out.println(boo.ti + " " + boo.si + " " + boo.a);*/

        /** File */
        /** mkdir/mkdirs */
        /*File f = new File("a/b/text.txt");
        System.out.println(f.mkdir());

        System.out.println(f.getParent().getClass());
        System.out.println(f.getParentFile().getClass());

        f.mkdirs();*/

        /** PrintWriter */
        /*try(OutputStream os = new FileOutputStream("output1.txt");
            PrintWriter printWriter = new PrintWriter(os)) {
//            printWriter.write(99);
//            os.write(100);
            printWriter.print(99);
        }*/
    }
}