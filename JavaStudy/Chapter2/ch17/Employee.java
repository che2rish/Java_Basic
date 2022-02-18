package ch17;

public class Employee {
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee()
    {
        serialNum++;
        employeeId = serialNum;
    }

    // 외부에서 변경 X -> getter만 제공
    public static int getSerialNum() {
        int i = 0; // 지역변수
        // employeeName = "Lee"; -> 이 메서드가 호출 될때 employeeName이 없을 수도 있다
        // static 메서드 안에서는 인스턴스 변수 사용 X
        return serialNum;
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
