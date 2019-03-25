package com.percy.stream;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author percy
 * @create 2019-03-25  下午10:55
 * @descreption:
 **/
public class FileStreamDemo {
    public static void main(String[] args) {
        try {
            File file = new File("/home/percy/IdeaProjects/FileStreamDemo/src/com/percy/stream/God Had to Be Fair");
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "UTF-8");
            int b=0;
            while (b!=-1){
                b = reader.read();
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
