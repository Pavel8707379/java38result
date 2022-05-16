package com.belhard.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private int age;
    private Address address;
    private List<Student> students = new ArrayList<Student>();

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() {
        return address;
    }
    public Student(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    public String displayInfo() {
        return "Учащийся" + " | " + name + " " + surname + " " + age + " " + address.displayInfo();
    }

    @Override
    public String toString() {
        return "Student" + " " +
                "name" + " " + name +
                "surname" + " " + surname + " " +
                "age" + " " + age +
                "address" + " " + address;
    }
    public void removeStudent (List<Student> removeStudents){
        students.removeAll(removeStudents);
    }
    public void addStudent(List<Student> newStudents){
        students.addAll(newStudents);
    }
//    @Override
//    public int compareTo(Student o) {
//        return o;
//}

//     @Override
//    public int compareTo(Student o) {
//        return this.name ;
//    }

    }