package basic;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception
    {
        Path path1 = Paths.get("D:\\Dump\\xor-project\\first.txt");
        Path path2 = Paths.get("D:\\Dump\\xor-project\\second.txt");
        // Read files into byte arrays
        byte[] data1 = Files.readAllBytes(path1);
        byte[] data2 = Files.readAllBytes(path2);

    
    

        FileWriter myWriter = new FileWriter("D:\\\\Dump\\\\xor-project\\\\result.out");
       for (int i=0;i<data1.length;i++) {
        myWriter.write(data1[i] ^ data2[i]);}
        myWriter.close();
        Path path3 = Paths.get("D:\\Dump\\xor-project\\result.out");

        byte []data3 = Files.readAllBytes(path3);
        
        for (int i=0;i<data1.length;i++) {
            data3[i]=(byte) (data1[i] ^ data3[i]);
        }

        for (int i=0;i<data1.length;i++) {
            System.out.print(data3[i] +" ");
        }System.out.println();
        for (int i=0;i<data1.length;i++) {
            System.out.print(data2[i] +" ");
        }
    
    }}
    
