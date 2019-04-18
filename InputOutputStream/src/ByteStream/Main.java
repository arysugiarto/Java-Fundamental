package ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

//        ByteStream
//        FileInputStream in = null;
//        FileInputStream out = null;

//        CharacterStream
        FileReader in = null;
        FileReader out = null;

        try {
//            ByteStream
//            in = new FileInputStream("latihan_input.txt");
//            out = new FileInputStream("latihan_output.txt");

//            Character Stream
            in = new FileReader("latihan_input.txt");
            out = new FileReader("latihan_output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (in != null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
