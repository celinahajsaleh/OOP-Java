package medexam;

public class Department{
    private String deptName;
    private String headOfDept;
    private int employeesNo;

    public Department() {
    }

    public Department(String deptName, String headOfDept, int employeesNo) {
        this.deptName = deptName;
        this.headOfDept = headOfDept;
        this.employeesNo = employeesNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHeadOfDept() {
        return headOfDept;
    }

    public void setHeadOfDept(String headOfDept) {
        this.headOfDept = headOfDept;
    }

    public int getEmployeesNo() {
        return employeesNo;
    }

    public void setEmployeesNo(int employeesNo) {
        this.employeesNo = employeesNo;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", headOfDept='" + headOfDept + '\'' +
                ", employeesNo=" + employeesNo +
                '}';
    }
}
