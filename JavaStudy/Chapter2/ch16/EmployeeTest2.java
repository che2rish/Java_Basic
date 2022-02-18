package ch16;

public class EmployeeTest2 {

    public static void main(String[] args){
        Employee2 employeeLee = new Employee2();
        employeeLee.setEmployeeName("이순신");

        System.out.println(employeeLee.serialNum);

        Employee2 employeeKim = new Employee2();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 "+ employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 "+ employeeKim.getEmployeeId());
    }
}
