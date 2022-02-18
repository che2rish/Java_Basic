package ch16;

public class Employee2 {

    public static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    // 회사원이 입사할 때마다 새로운 사번 부여하기
    public Employee2(){
        serialNum++;
        employeeId = serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
