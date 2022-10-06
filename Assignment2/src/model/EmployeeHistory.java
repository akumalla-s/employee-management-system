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
    
    private int employeeIndex;

    public int getEmployeeIndex() {
        return employeeIndex;
    }

    public void setEmployeeIndex(int employeeIndex) {
        this.employeeIndex = employeeIndex;
    }
    
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
    
    public void updateEmployee(Employee employee) {
            
            employeeHistory.set(getEmployeeIndex(), employee);
    }
  

    public void deleteEmployee(Employee selectedEmployee) {
        employeeHistory.remove(selectedEmployee);
    }

    public Employee getEmployeeDetails(long employeeID) {
        Employee employee = null;
        int i=0;
        for(Employee e: getEmployeeHistory()){
            setEmployeeIndex(i);
            if(e.getEmployeeId() == employeeID){
                return e;
            }
            i++;
           
        }
        return employee;
    }

  
    
}
