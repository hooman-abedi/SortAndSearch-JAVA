/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

import com.mycompany.employee.Employee;

/**
 *
 * @author hooman
 */
public class OrderedObjects {
    Employee[] arr;
    int numElements;
    int maxElements;
    
    public OrderedObjects(){
    arr = new Employee[175];
    numElements = 0;
    maxElements = 175;
    }

    public boolean addObject(String employeeCode,
            String name,
            String position,
            String phone,
            int officeNum){
        if (binarySearch(employeeCode)!= -1) {
            return false;
            
        }
        else if (numElements > maxElements){
            return false;
        }
        
        Employee newEmp = new Employee(employeeCode, name, position, phone, officeNum);
        //Dec
        int i = numElements - 1;
        while (i >= 0 && arr[i].employeeCode.compareTo(employeeCode) < 0) {            
            arr[i+1] = arr[i];
            i--;
        }
        //Asc
//        while (i >= 0 && arr[i].employeeCode.compareTo(employeeCode) > 0) {
//            arr[i + 1] = arr[i];
//            i--;
//        }
        arr[i+1] = newEmp;
        numElements++;
        return true;
    }
    
    
    public int binarySearch(String eCode){
        int low = 0;
        int high = numElements -1;
        while (low <= high){
            int mid = (low + high)/2;
            
            int cmp = eCode.compareTo(arr[mid].employeeCode);
            
            if (cmp == 0){
                return mid;
            }
            //Dec
            else if (cmp < 0){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
            
            //Asc`       
//          else if (cmp < 0) {
//             hi = mid - 1;   // go LEFT
//          } else {
//             lo = mid + 1;   // go RIGHT
//          }
            
        }
        return -1;
    }
    
    public void deleteObject(String employeeCode) {
        int index = binarySearch(employeeCode);
        if ( index  == -1) {
            return;
        }
        for (int i = index; i < numElements -1; i++) {
            arr[i] = arr[i+1];
            
        }
    }
    public void printElements() {
        for (int i = 0; i < numElements; i++) {
            System.out.println(arr[i].employeeCode);
            System.out.println(arr[i].name);
            System.out.println(arr[i].position);
            System.out.println(arr[i].phone);
            System.out.println(arr[i].officeNum);
        }
    }   
}
