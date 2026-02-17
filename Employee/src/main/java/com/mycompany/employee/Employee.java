/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author hooman
 */
public class Employee {

    public static void main(String[] args) {
        OrderedObjects o = new OrderedObjects();

        o.addObject("A187263", "And", "professor", "636-123-2312", 418);
        o.addObject("R837233", "Ord", "professor", "636-123-2312", 418);
        o.addObject("E938742", "Alb", "professor", "636-123-2312", 418);
        o.addObject("W938374", "Paw", "professor", "636-123-2312", 418);

        o.printElements();
        System.out.println("---- delete E938742 ----");
        o.deleteObject("E938742");
        o.printElements();
    }
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
