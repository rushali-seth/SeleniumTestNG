package org.java.practice;

import java.io.*;

public class CreateFile {
    public static void main(String[] args){

        File file = new File("MyFile.txt");
       if(!file.exists()){
           try {
               file.createNewFile();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }

        try {
            FileWriter fw = new FileWriter(file);
            fw.write("first line:");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fr = new FileReader(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
