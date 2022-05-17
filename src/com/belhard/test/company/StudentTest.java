package com.belhard.test.company;

import com.belhard.model.Address;
import com.belhard.model.Group;
import com.belhard.model.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    Student student;
    @Before
    public void setUp() throws Exception {
//    Student student;
    }

    @Test
    public static void changeGroup(Group group) {
        Address address = new Address("Minsk","Esenina", 120,20);
        Address address1 = new Address("Minsk", "Esenina", 120, 15);
        Student student = new Student("Anton", "Fillipov", 23, address);
        Student student3 = new Student("Kirill", "Shpak", 21, address1);
        Student student4 = new Student("Alla", "Gay", 21, address1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student3);
        studentList.add(student4);

        group.getStudent();





    }
}
