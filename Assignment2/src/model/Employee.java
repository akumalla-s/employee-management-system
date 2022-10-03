/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.util.Date;

/**
 *
 * @author srinredd
 */
public class Employee {
    
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeId;
    private int employeeAge;
    private String employeeGender;
    private Date employeeStartDate;
    private String employeeLevel;
    private String employeeTeamInfo;
    private String employeePositionTitle;
    private long employeeContactNumber;
    private String employeeEmailAddress;
    private File employeePhotoPath;

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public Date getEmployeeStartDate() {
        return employeeStartDate;
    }

    public void setEmployeeStartDate(Date employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

    public String getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(String employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public String getEmployeeTeamInfo() {
        return employeeTeamInfo;
    }

    public void setEmployeeTeamInfo(String employeeTeamInfo) {
        this.employeeTeamInfo = employeeTeamInfo;
    }

    public String getEmployeePositionTitle() {
        return employeePositionTitle;
    }

    public void setEmployeePositionTitle(String employeePositionTitle) {
        this.employeePositionTitle = employeePositionTitle;
    }

    public long getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    public void setEmployeeContactNumber(long employeeContactNumber) {
        this.employeeContactNumber = employeeContactNumber;
    }

    public String getEmployeeEmailAddress() {
        return employeeEmailAddress;
    }

    public void setEmployeeEmailAddress(String employeeEmailAddress) {
        this.employeeEmailAddress = employeeEmailAddress;
    }

    public File getEmployeePhotoPath() {
        return employeePhotoPath;
    }

    public void setEmployeePhotoPath(File employeePhotoPath) {
        this.employeePhotoPath = employeePhotoPath;
    }
    
    

    
    
    
}
