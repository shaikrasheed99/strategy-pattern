package com.tw.student;

import com.tw.student.exceptions.NegativeGradeException;

public class Student {
    private IWritingStrategy writeWith;

    public Student(int grade) throws NegativeGradeException {
        if (grade < 0) throw new NegativeGradeException();
        if (grade <= 2) {
            writeWith = new SlatePencilStrategy();
        } else if (grade <= 5) {
            writeWith = new PencilStrategy();
        }
    }

    public String write() {
        return writeWith.write();
    }
}
