package stream;

import stream.models.Student;

import java.util.stream.Collectors;

public class StudentManagement {

    public static void main(String[] args) {

        var studentList = Student.getRandomList();

        System.out.println(studentList);

        // danh sach ten sinh vien

        var nameList = studentList.stream().map(student -> {
            var fullname = student.getName();
            var items = fullname.split(" ");
            return items[items.length - 1];
        }).toList();

        System.out.println("\n--------------");
        System.out.println(nameList);

        var groupByClassName = studentList.stream()
                .collect(Collectors.groupingBy(student -> student.getClassName()))
        ;

        System.out.println(groupByClassName);

        for(var className : groupByClassName.keySet()) {
            var studentInClass = groupByClassName.get(className);

            var avg = studentInClass.stream()
                    .collect(Collectors.averagingDouble(student -> student.getAvgPoint()));

            System.out.printf("Lop %s, diem trung binh: %f\n", className, avg);
        }

        var maleAvg = studentList.stream()
                .filter(student -> student.getSex() == 0)
                .collect(Collectors.averagingDouble(s -> s.getAvgPoint()));

        var femaleAvg = studentList.stream()
                .filter(student -> student.getSex() == 1)
                .collect(Collectors.averagingDouble(Student::getAvgPoint));

        System.out.printf("Diem trung binh theo gioi tinh, nam: %f, nu: %f\n", maleAvg, femaleAvg);
    }
}
