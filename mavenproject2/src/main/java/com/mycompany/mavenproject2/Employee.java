/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author hooman
 */
public class Employee {
    
    public String employeeCode;
    public String name;
    public String position;
    public String phone;
    public int officeNum;
    
    public Employee(String employeeCode,String name, String position, String phone, int officeNum){
    this.employeeCode = employeeCode;
    this.name = name;
    this.position = position;
    this.phone = phone;
    this.officeNum = officeNum;
}
    
}
