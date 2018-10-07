/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.clairepurcell96.assignment1;

import java.util.ArrayList;

/**
 *
 * @author clairepurcell96
 */
public class Module {
    private final String moduleName;
    private final String moduleId;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<CourseProgramme> associatedCourses = new ArrayList<CourseProgramme>();
    
    public Module(String name, String id) {
        this.moduleName = name;
        this.moduleId = id;
    }
    
    public String getName() {
        return this.moduleName;
    }
    
    public void register(Student student) {
        this.students.add(student);
    }
    
    public void deregister(Student student) {
        this.students.remove(this.students.indexOf(student));
    }
    
    public ArrayList<Student> getStudents() {
        return this.students;
    }
    
    public ArrayList<CourseProgramme> getAssociatedCourses() {
        return this.associatedCourses;
    }
    
    public void setAssociatedCourse(CourseProgramme course) {
        this.associatedCourses.add(course);
    }
}
