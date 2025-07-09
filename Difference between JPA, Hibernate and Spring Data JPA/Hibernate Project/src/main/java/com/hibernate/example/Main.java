package com.hibernate.example;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Gita");
        emp.setDepartment("Accounts");

        EmployeeDao dao = new EmployeeDao();
        dao.addEmployee(emp);
    }
}
