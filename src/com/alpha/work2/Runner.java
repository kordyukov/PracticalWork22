package com.alpha.work2;

public class Runner {
    public void run(){
    Employee employee = new Employee("Ivanov","Ivan","musician",
                                     "(050)111-11-11");
        Employee employee1 = new Employee("Petrov","Petr","bankir",
                "(050)121-12-11");
        Employee employee2 = new Employee("kyuzmin","Pasha","dj",
                "(050)341-31-17");
        Employee employee3 = new Employee("Sydorov","Yasha","cleaner",
                "(050)121-13-54");
        System.out.println(Employee.getNumberOfEmployees());
    }
}
