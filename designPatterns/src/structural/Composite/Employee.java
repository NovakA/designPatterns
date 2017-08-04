/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee (String name, String dept, int salary) {
        this.dept = dept;
        this.name = name;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }
    
    public void add (Employee employee) {
        subordinates.add(employee);
    }
    
    public void remove (Employee employee) {
        subordinates.remove(employee);
    }
    
    public List<Employee> getSubordinates() {
        return subordinates;
    }
    
    public String toString() {
        return ("Employee:[ Name: " + name + ", dept: " + dept + ", salary: " + salary + "]");
    }
}
