package ch16;

public class EmployeeTest {

    public static void main(String[] args){
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(employeeLee.serialNum); // 1000

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.serialNum++;

        // 두 개의 인스턴스가 하나의 메모리를 공유한다.
        System.out.println(employeeLee.serialNum); // 1001
        System.out.println(employeeKim.serialNum); // 1001
    }
}
