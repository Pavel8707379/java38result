package com.belhard.test.company;

import com.belhard.model.Address;
import com.belhard.model.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class StudentTest {
    Student student;
    @Before
    public void setUp() throws Exception {
        Address address = new Address("Minsk","Esenina", 120,20);
        Address address1 = new Address("Minsk", "Esenina", 120, 15);


        Student student = new Student("Anton", "Fillipov", 23, address);
        Student student3 = new Student("Kirill", "Shpak", 21, address1);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addStudent() {
        student.addStudent();
        Address address2 = new Address("Grodno", "Mira", 34, 56);
        Address address3 = new Address("Brest", "Centralnaya", 87, 2);
        Student student1 = new Student("Irina", "Frolova", 21, address2);
        Student student2 = new Student("Alina", "Ivanova", 22, address3);
        List<Student> students = new ArrayList<>();
        students.add(0, student1);
        students.add(2, student2);
        assertTrue(student1 == student2);

    }
}
