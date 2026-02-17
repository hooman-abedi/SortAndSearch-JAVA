/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import com.mycompany.employee.OrderedObjects;

/**
 *
 * @author hooman
 */
public class Main {
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
}
