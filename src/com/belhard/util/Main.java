package com.belhard.util;

import com.belhard.model.Address;
import com.belhard.model.Group;
import com.belhard.model.Student;
import com.belhard.model.Teacher;
import com.belhard.repository.GroupRepository;
import com.belhard.service.GroupService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ParserUtil.parserTeacher();
        ParserUtil.parserStudent();

        GroupRepository groupRepository = new GroupRepository();
        GroupService groupService = new GroupService(groupRepository);


        Address address1 = new Address("Minsk", "Esenina", 120, 15);
        Address address2 = new Address("Grodno", "Mira", 34, 56);
        Address address3 = new Address("Brest", "Centralnaya", 87, 2);
        Address address4 = new Address("Mogilew", "Lenina", 167, 94);

        Student student = new Student("Anton", "Fillipov", 23, address1);
        Student student1 = new Student("Irina", "Frolova", 21, address2);
        Student student2 = new Student("Alina", "Ivanova", 22, address3);
        Student student3 = new Student("Kirill", "Shpak", 21, address4);

        Teacher teacher1 = new Teacher("Inga", "Vasilevna", 43, address1, 15, 7, 1);
        Teacher teacher2 = new Teacher("Igor", "Petrow", 45, address2, 22, 9, 1);
        Teacher teacher3 = new Teacher("Ignat", "Ivanov", 50, address3, 14, 9, 2);
        Teacher teacher4 = new Teacher("Olga", "Kurinkova", 35, address4, 21, 9, 1);


        ArrayList<Student> result = new ArrayList<>();
        result.add(0, student);
        result.add(1, student1);
        result.add(2, student2);

        result.remove(1);
        result.get(0);
        result.get(1);
        result.forEach(s -> {
            System.out.println(s);
        });
        List<Student> students1 = new ArrayList<>();
        students1.add(student);
        students1.add(student1);

        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);

        Group group = new Group( "Экономика",1,student1, teacher1 );
        List<Group> groups = new ArrayList<>();
        groups.add(group);
        groupService.addGroups(groups);


//        Group group1 = new Group("Finance", 2, student, teacher1);
//        groupService.addGroups(group1);
//        groupService.removeGroups();


        List<Teacher> teachers = new ArrayList<Teacher>() {{
            add(teacher1);
            add(teacher2);
            add(teacher3);
            add(teacher4);
        }};
        teachers.stream().sorted().forEach(teacher -> System.out.println(teacher));

        System.out.println();

        Comparator teacherComparator = new ComparatorTeacher();
        teachers.stream().sorted(teacherComparator).forEach(teacher -> System.out.println(teacher));

        System.out.println();






//               AgeUtil.checkAge(40);
    }
}
