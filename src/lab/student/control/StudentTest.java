package lab.student.control;

import lab.student.entity.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("S1001", "김민수", "컴퓨터공학", 3);

        System.out.println(s1.getName() + " / " + s1.getMajor() + " / " + s1.getGrade() + "학년");

        System.out.println("5학년으로 변경");
        s1.setGrade(5);  // 잘못된 입력 → 경고 메시지 출력
    }
}
