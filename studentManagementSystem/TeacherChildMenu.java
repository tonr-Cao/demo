package studentManagementSystem;

import java.util.Scanner;

/**
 * @author tonr_cao
 * @date 2020/5/11 - 7:06 下午
 */
public class TeacherChildMenu {

    /**
     * 查询选择自己的所有学生的成绩
     */
    public void checkStudentScores(int index) {

        System.out.println("您所有学生成绩如下：");

        //获取Database中的teacher数组对应下标处的对象
        Teacher teacher = DateBase.teachers[index];

        //获取老师的编号
        int teacherId = teacher.getTeacherId();

        //获取DataBase中的student数组
        Student[] students = DateBase.students;

        //对学生进行排序

        //查询成绩
        for (int i = 0; i < students.length; i++) {
            //判断是否该老师id号的学生
            if (students[i] != null && students[i].getTeacherId() == teacherId) {
                System.out.println("学生姓名：" + students[i].getName() + "成绩：" + students[i].getScore());
            }
        }
        Util util = new Util();
        util.sortStudentScore();
    }


    /**
     * 登记成绩
     */
    public void registerScore(int index) {

        //获取该老师的对象
        Teacher teacher = DateBase.teachers[index];

        //获取该老师的id号
        int teacherId = teacher.getTeacherId();

        Scanner sc = new Scanner(System.in);
        //获取学生的数组
        Student[] students = DateBase.students;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getTeacherId() == teacherId) {
                System.out.println("请输入" + students[i].getName() + "成绩：");
                int score = sc.nextInt();
                students[i].setScore(score);
            }
        }
        //查询所有学生的成绩
        checkStudentScores(index);
    }

    /**
     * 根据学生姓名修改指定学生的成绩
     */
    public void setStudentScore(int index) {

        //获取老师对象
        Teacher teacher = DateBase.teachers[index];
        //获取老师ID
        int teacherId = teacher.getTeacherId();

        //获取学生数组
        Student[] students = DateBase.students;
        //输入学生姓名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名:");
        String studentName = sc.next();

        int studentIndex = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getName().equals(studentName) && students[i].getTeacherId() == teacherId) {
                studentIndex = i;
                break;
            }
        }

        //根据索引值判断学生是否存在
        if (studentIndex != -1) {
            System.out.println("请输入成绩：");
            int score = sc.nextInt();
            students[studentIndex].setScore(score);
            //查询所有的学生成绩
            checkStudentScores(index);
        } else {
            System.out.println("该学生不存在");
        }
    }
}
