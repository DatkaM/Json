package com.company;

public class Student {
    private String name;
    private int age;
    private EducationType educationType;

    public Student() {

    }

    public Student(String name, int age, EducationType educationType) {
        this.name = name;
        this.age = age;
        this.educationType = educationType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public EducationType getEducationType(){
        return educationType;
    }

    public void setEducationType(EducationType educationType){
        this.educationType = educationType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", educationType=" + educationType +
                '}';
    }

    public static Student getStudentMethod(String name,int age,EducationType educationType){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.educationType = educationType;
        return student;
    }
}
