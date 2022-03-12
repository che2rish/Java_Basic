package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class c1 = Class.forName("ch04.Person");

        Person person = (Person)c1.newInstance();

        person.setName("Lee");
        System.out.println(person);

        Class c2 = person.getClass(); // 이미 인스턴스가 있는 상태에서 사용 가능
        Person p = (Person)c2.newInstance();
        System.out.println(p); // null

        // Person kim2 = new Person("kim"); 와 같다.
        // 로컬에 Person이 없을 때 사용
        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person kimPerson = (Person)cons.newInstance(initargs);
        System.out.println(kimPerson);


    }
}
