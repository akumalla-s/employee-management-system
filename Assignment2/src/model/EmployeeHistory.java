/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author srinredd
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> employeeHistory;
    
    public EmployeeHistory(){
        this.employeeHistory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeHistory() {
        return employeeHistory;
    }

    public void setEmployeeHistory(ArrayList<Employee> employeeHistory) {
        this.employeeHistory = employeeHistory;
    }

    
    public Employee addNewEmployee(){
        
        Employee newEmployee = new Employee();
        employeeHistory.add(newEmployee); 
        return newEmployee;
    }

    public void deleteEmployee(Employee selectedEmployee) {
        employeeHistory.remove(selectedEmployee);
    }

    public Employee getEmployeeDetails(long employeeID) {
        Employee employee = null;
        for(Employee e: getEmployeeHistory()){
            //employee = new Employee(); 
            if(e.getEmployeeId() == employeeID){
                return e;
            }
           
        }
        return employee;
    }
    
    
}
