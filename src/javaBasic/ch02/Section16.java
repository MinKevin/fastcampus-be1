package javaBasic.ch02;

public class Section16 {
    static class Employee{
        public static int serialNum = 1000;
        private int employeeId;
        private String employeeName;
        private String department;

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

    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("민장규");
        System.out.println(Employee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.serialNum++;

    }
}
