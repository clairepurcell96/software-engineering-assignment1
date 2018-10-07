/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

import ie.nuigalway.clairepurcell96.assignment1.*;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author clairepurcell96
 */
public class Test {
    public Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @org.junit.Test
    public void getUsername() {
        // creating new Student/Module/CourseProgramme objects for each test to keep them independant of eachother
        Student student = new Student("Claire Purcell", 20, new DateTime(1998, 9, 1, 9, 0), "12345678");
        assertEquals("Claire Purcell20", student.getUsername());
    }
    
    @org.junit.Test
    public void getStudentName() {
        Student student = new Student("Claire Purcell", 20, new DateTime(1998, 9, 1, 9, 0), "12345678");
        assertEquals("Claire Purcell", student.getName());
    }
    
    @org.junit.Test
    public void registerModuleAndGetStudents() {
        // this test covers both Module.getStudents and Module.register
        Student student = new Student("Claire Purcell", 20, new DateTime(1998, 9, 1, 9, 0), "12345678");
        Module module = new Module("Module 1", "CT1234");
        module.register(student);
        ArrayList<Student> expected = new ArrayList<Student>();
        expected.add(student);
        assertEquals(module.getStudents(), expected);
    }
    
    @org.junit.Test
    public void deregisterModule() {
        Student student = new Student("Claire Purcell", 20, new DateTime(1998, 9, 1, 9, 0), "12345678");
        Module module = new Module("Module 1", "CT1234");
        module.register(student);
        module.deregister(student);
        ArrayList<Student> expected = new ArrayList<Student>();
        assertEquals(module.getStudents(), expected);
    }
    
    @org.junit.Test
    public void getAndSetAssociatedCourses() {
        // this test covers both getting and setting associated courses
        Module module = new Module("Module 1", "CT1234");
        CourseProgramme course = new CourseProgramme("Course 1", new DateTime(2018, 9, 1, 9, 0), new DateTime(2019, 4, 1, 18, 0));
        module.setAssociatedCourse(course);
        ArrayList<CourseProgramme> expected = new ArrayList<CourseProgramme>();
        expected.add(course);
        assertEquals(module.getAssociatedCourses(), expected);
    }
    
    @org.junit.Test
    public void getCourseName() {
        CourseProgramme course = new CourseProgramme("Course 1", new DateTime(2018, 9, 1, 9, 0), new DateTime(2019, 4, 1, 18, 0));
        assertEquals(course.getName(), "Course 1");
    }
    
    @org.junit.Test
    public void registerCourse() {
        Student student = new Student("Claire Purcell", 20, new DateTime(1998, 9, 1, 9, 0), "12345678");
        CourseProgramme course = new CourseProgramme("Course 1", new DateTime(2018, 9, 1, 9, 0), new DateTime(2019, 4, 1, 18, 0));
        course.register(student);
        ArrayList<Student> expected = new ArrayList<Student>();
        expected.add(student);
        assertEquals(course.getStudents(), expected);
    }
    
    @org.junit.Test
    public void deregisterCourse() {
        Student student = new Student("Claire Purcell", 20, new DateTime(1998, 9, 1, 9, 0), "12345678");
        CourseProgramme course = new CourseProgramme("Course 1", new DateTime(2018, 9, 1, 9, 0), new DateTime(2019, 4, 1, 18, 0));
        course.register(student);
        course.deregister(student);
        ArrayList<Student> expected = new ArrayList<Student>();
        assertEquals(course.getStudents(), expected);
    }
    
    @org.junit.Test
    public void addModuleAndGetCourseModules() {
        Module module = new Module("Module 1", "CT1234");
        CourseProgramme course = new CourseProgramme("Course 1", new DateTime(2018, 9, 1, 9, 0), new DateTime(2019, 4, 1, 18, 0));
        course.addModule(module);
        ArrayList<Module> expected = new ArrayList<Module>();
        expected.add(module);
        assertEquals(course.getModules(), expected);
    }
}
