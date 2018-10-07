/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.clairepurcell96.assignment1;

import org.joda.time.DateTime;

/**
 *
 * @author clairepurcell96
 */
public class Student {
    private final String name;
    private final int age;
    private final DateTime dob;
    private final String id;
    
    public Student(String name, int age, DateTime dob, String id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
    }
    
    public String getUsername() {
        return this.name + this.age;
    }
    
    public String getName() {
        return this.name;
    }
}
