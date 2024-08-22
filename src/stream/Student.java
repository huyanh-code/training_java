package stream;

import java.util.Arrays;
import java.util.List;

public class Student {
    private int id;
    private String name;

    /**
     * Ten lop hoc
     */
    private String className;

    /**
     * gioi tinh, 0: nam, 1: nu
     */
    private int sex;

    public Student(int id, String name, String className, int sex, double avgPoint) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.sex = sex;
        this.avgPoint = avgPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    private double avgPoint;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", sex=" + sex +
                ", avgPoint=" + avgPoint +
                '}';
    }


    public static List<Student> getRandomList() {
        return Arrays.asList(
                new Student(1, "Nguyen Van Anh", "1A", 0, 4.5f),
                new Student(2, "Tran Thi Binh", "2A", 1, 5.5f),
                new Student(3, "Nguyen Tuan Cong", "1A", 0, 2.5f),
                new Student(4, "Dang Ngoc Dung", "3A", 1, 7.5f),
                new Student(5, "Pham Van Duong", "1A", 0, 3.5f)
        );
    }
}
