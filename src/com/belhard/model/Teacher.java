package com.belhard.model;

public class Teacher implements Comparable<Teacher> {
    public String name;
    private String surName;
    private int age;
    private  int day;           // день
    private  int time;         // время
    private double rate;     //ставка
    private Address address;
    double sum;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getSum() {
        return sum;
    }
    public int getDay() {
        return day;
    }
    public int getTime() {
        return time;
    }
    public double getRate() {
        return rate;
    }
    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() {
        return address;
    }
    public Teacher(String name, String surName, int age, Address address, int day, int rate, int time) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
        this.time = time;
        this.rate = rate;
        this.day = day;

    }
    public  double calkulation() {
        double sum = (rate * time) * day;
        return sum;

    }
    public String displayInfo(){
        return  "Преподаватель" + " |" + name + " " + surName + " " + age + " " + address.displayInfo() + " " + "ЗП" + " | " + sum;
    }
    public void setage (int age){
        if (age > 0){
            this.age = age;
        }
    }

    public String toString() {
        return "Teacher" + " | " + " " +
                "name" + " " + name + " " +
                "surName" + " " + surName + " " +
                "age" + " " + age + " " +
                "day" + " " + day + " " +
                "time" + " " + time + " " +
                "rat" +" " + rate + " " +
                "address" + " " + address + " " +
                "sum" + " " + sum ;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.age - o.age;
    }

}