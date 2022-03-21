package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    // throws를 이용해서 예외가 발생할 수 있는 부분을 사용하는 문장에서 예외처리
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className);
        return c;

    }

    public static void main(String[] args){

        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("a.txt","abc");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("End");
    }
}
