package studentManagementSystem;

import java.util.Scanner;

/**
 * @author tonr_cao
 * @date 2020/5/11 - 6:53 下午
 */
public class StudentChildMenu {

    /**
     * 查询自己的所有信息
     */
    public void info(int index) {

        //根据老师的ID找到老师的姓名

        Student student = DateBase.students[index];
        int teacherId = student.getTeacherId();
        String teacherName = "没有选择老师";
        //获取老师的数组
        Teacher[] teachers = DateBase.teachers;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teacherId == teachers[i].getTeacherId()) {
                teacherName = teachers[i].getName();
                break;
            }
        }
        System.out.println("姓名" + student.getName() + "学号：" + student.getStuId() + "电话" + student.getPhone() + "密码：" +
                student.getPassWord() + "年龄" + student.getAge() + "性别：" + student.getSex() +
                "成绩" + student.getScore() + "老师" + teacherName);

        ShowUI showUI = new ShowUI();
        showUI.studentChildMenu(index);


    }

    /**
     * 修改自己的密码
     */
    public void setPassWord(int index) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前密码：");
        int oldPassWord = sc.nextInt();

        Student[] students = DateBase.students;

        //对比输入的密码和存的密码是否一样
        if (students[index].getPassWord() == oldPassWord) {
            System.out.println("请输入新的密码：");
            int newPassWord = sc.nextInt();
            System.out.println("请再次输入新的密码:");
            int newPassWord2 = sc.nextInt();

            if (newPassWord == newPassWord2) {

                students[index].setPassWord(newPassWord);

                MainMenu mainMenu = new MainMenu();
                System.out.println("修改密码成功，请登陆确认");
                mainMenu.logIn();
            } else {
                System.out.println("两次的密码不一样");
            }
        } else {
            System.out.println("输入的密码不正确");
        }
    }

    /**
     * 切换老师，只能切换成存在的老师
     */
    public void switchTeacher(int index) {

        ShowUI showUI = new ShowUI();

        //获取该下标的学生用户
        Student student = DateBase.students[index];
        System.out.println("可以选择的老师有：");
        //获取所有老师
        Teacher[] teachers = DateBase.teachers;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null) {
                System.out.println(teachers[i].getTeacherId() + " " + teachers[i].getName());
            }
        }

        System.out.println("请输入老师的编号：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //判断num是否是老师数组中的编号
        //定义一个flag变量
        boolean flag = true;
        //判断输入的和原油的老师编号不相等才修改，否则不修改
        if (num != student.getTeacherId()) {
            for (int i = 0; i < teachers.length; i++) {
                if (teachers[i] != null && teachers[i].getTeacherId() != 0) {
                    flag = false;
                    break;
                }
            }

            //根据flag判断老师是否存在
            if (flag == false) {
                //存在
                System.out.println("修改老师成功");
                student.setTeacherId(num);
            } else {
                //不存在
                System.out.println("输入的老师编号不存在，请核对后输入");
            }
        } else {
            System.out.println("你已经属于该老师的学生，请重新选择");
        }
        showUI.studentChildMenu(index);
    }

    public void out() {
        System.out.println("正在退出");
        try {
            Thread.sleep(500);
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
            }
            System.out.println("退出成功");
        } catch (InterruptedException e) {
            System.exit(0);
            e.printStackTrace();
        }
    }
}


//    public static void printArray() {
//        Student[] students = DateBase.students;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null) {
//                System.out.println("学生ID：" + students[i].getStuId() + "电话：" + students[i].getPhone() + "密码：" +
//                        students[i].getName() + "年龄" + students[i].getAge() + "性别:" + students[i].getSex() +
//                        students[i].getScore() + "老师ID：" + students[i].getTeacherId());
//            }
//            System.out.println();
//        }
//    }
//}
