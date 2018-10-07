/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.clairepurcell96.assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author clairepurcell96
 */
public class CourseProgramme {
    private final String courseName;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private final DateTime startDate;
    private final DateTime endDate;
    
    public CourseProgramme(String name, DateTime start, DateTime end) {
        this.courseName = name;
        this.startDate = start;
        this.endDate = end;
    }
    
    public String getName() {
        return this.courseName;
    }
    
    public void register(Student student) {
        this.students.add(student);
    }
    
    public void deregister(Student student) {
        this.students.remove(this.students.indexOf(student));
    }
    
    public void addModule(Module module) {
        this.modules.add(module);
    }
    
    public ArrayList<Module> getModules() {
        return this.modules;
    }
       
    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
