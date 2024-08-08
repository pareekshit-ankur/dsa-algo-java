package main.java.com.pareekshit;

public class Student implements Comparable<Student> {

    private String name;
    private int marks;
    private int id;

    public Student(String name, int marks, int id) {
        this.name = name;
        this.marks = marks;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.equals(o.name)) {
            return o.marks - this.marks;
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", id=" + id +
                '}';
    }
}
