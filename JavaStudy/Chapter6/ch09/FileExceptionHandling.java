package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
     public static void main(String[] args){
         FileInputStream fis = null;

         try {
             fis = new FileInputStream("a.txt"); //FileNotFoundException
             System.out.println("read");
         } catch (FileNotFoundException e) {
             //e.printStackTrace();
             System.out.println(e); //java.io.FileNotFoundException: a.txt (No such file or directory)
         } finally { // try구문이 실행이 되면 finally는 항상 수행됨
             if(fis != null) {
                 try {
                     fis.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
             System.out.println("finally");
         }
         System.out.println("End");
     }
}
