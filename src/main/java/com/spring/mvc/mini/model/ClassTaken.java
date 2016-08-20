package com.spring.mvc.mini.model;

/**
 * Created by lusun on 8/17/16.
 */
public class ClassTaken {
    private Integer studentId;
    private Integer classId;
    private String grade;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ClassTaken{" +
                "studentId=" + studentId +
                ", classId=" + classId +
                ", grade='" + grade + '\'' +
                '}';
    }
}
