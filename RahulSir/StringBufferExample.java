package RahulSir;

import java.io.*;
public class StringBufferExample {
    public static void main(String[] args) throws IOException{
        FileInputStream f1 = null;
        FileInputStream f2 = null;
        FileWriter frw = new FileWriter("e:\\nisu.txt");
        SequenceInputStream file3 = null;
        f1 = new FileInputStream("e:\\Heli.txt");
        f2 = new FileInputStream("e:\\paavan.txt");
        file3 = new SequenceInputStream(f1,f2);
        BufferedInputStream bis = new BufferedInputStream(file3);
        int ch;
        while ((ch=bis.read())!=-1) {
            System.out.print((char)ch);
            frw.write(ch);
        }
        bis.close();
        f1.close();
        f2.close();
        frw.close();
    }
}
