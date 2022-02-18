package ch17;

public class EmployeeTest {

    public static void main(String[] args){
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        //System.out.println(employeeLee.serialNum); // private이라서 외부에서 바로 참조 X
        System.out.println(Employee.getSerialNum());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 "+ employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 "+ employeeKim.getEmployeeId());
    }
}
