package com.belhard.util;

import com.belhard.model.Teacher;

import java.util.Comparator;

public class ComparatorTeacher implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getAge() - o2.getAge();
    }
}
