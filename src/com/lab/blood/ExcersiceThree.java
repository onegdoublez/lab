package com.lab.blood;
import java.io.*;
public class ExcersiceThree {

    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("C:/1.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        FileWriter fw = new FileWriter("reverse.java");
        BufferedWriter bw = new BufferedWriter(fw);
        while((s = br.readLine()) != null) {
            for( int i=s.length()-1;i>=0;i--)
                bw.write(s.charAt(i));
            bw.write("\r\n");
        }
        fr.close();
        bw.close();
    }
}