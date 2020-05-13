package studentManagementSystem;

import java.util.Scanner;

/**
 * @author tonr_cao
 * @date 2020/5/11 - 6:53 下午
 */
public class MainMenu {


    /**
     * 登陆的方法
     */
    public void logIn() {
        System.out.println("===欢迎来到StudentManagementSystem登陆界面===");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号码:");
        int userPhone = sc.nextInt();

        int role = Util.queryRoleByTel(userPhone);

        //根据role判断
        if (role == 0) {
            //学生的登陆界面
            studentLogIn(userPhone);
        }
        if (role == 1) {
            //老师的登陆界面
            teacherLogIn(userPhone);
        }
    }

    //学生的登陆界面
    public void studentLogIn(int userPhone) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码：");
        int studentPassWord = sc.nextInt();

        int index = -1;
        //根据电话号码查找该电话号码存在的下标位置
        Student[] students = DateBase.students;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getPhone() != 0 && students[i].getPhone() == userPhone) {
                index = i;
                break;
            }
        }
        //校验密码
        if (students[index].getPassWord() == studentPassWord) {
            //学生登陆成功之后，调用学生的子功能界面
            ShowUI showUI = new ShowUI();
            showUI.studentChildMenu(index);
        } else {
            System.out.println("学生的账号和密码不匹配");
        }
    }

    //老师的登陆界面
    public void teacherLogIn(int phone) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码：");
        int teacherPassWord = sc.nextInt();

        int index = -1;
        Teacher[] teachers = DateBase.teachers;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getPhone() != 0 && teachers[i].getPhone() == phone) {
                index = i;
                break;
            }
        }
        //校验密码
        if ( teachers[index].getPassWord() == teacherPassWord) {
            ShowUI showUI = new ShowUI();
            showUI.teacherChildMenu(index);
        } else {
            System.out.println("老师的账号和密码不匹配");
        }
    }


    /**
     * 注册的方法
     */
    public void register() {
        System.out.println("===欢迎来到StudentChildMenu注册界面===");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号码:");
        int studentPhone = sc.nextInt();

        //创建DateBase中的logIn数组
        LogIn[] logIns = DateBase.logIns;
        //定义一个角色,判断是否这个用户已经存在
        int role = Util.queryRoleByTel(studentPhone);
        if (role == -1) {
            //可以注册
            System.out.println("请输入密码：");
            int passWord = sc.nextInt();

            LogIn logIn = new LogIn();
            logIn.setRole(0);
            logIn.setPhone(studentPhone);

            //寻找login数组中第一个不为null的位置
            int logIndex = -1;
            for (int i = 0; i < logIns.length; i++) {
                //寻找第一个不为null的位置下标
                if (logIns[i] == null) {
                    logIndex = i;
                    break;
                }
            }
            //判断
            if (logIndex != -1) {
                logIns[logIndex] = logIn;
            } else {
                System.out.println("服务器爆满");
                return;
            }
            //再将学生的数据存入学生的数组
            Student[] students = DateBase.students;
            int studentIndex = -1;
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    studentIndex = i;
                    break;
                }
            }
            //创建学生对象
            Student s = new Student();
            s.setPhone(studentPhone);
            s.setPassWord(passWord);
            s.setStuId(studentIndex + 1);
            students[studentIndex] = s;

            //调用登陆
            logIn();
        } else {
            System.out.println("该账号已经被注册，是否登陆(y/n):");
            String mess = sc.next();

            //判断是还是否
            if (mess.equals("y")) {
                //跳转到登陆
                logIn();
            } else if (mess.equals("n")) {
                //再次调用自己，重新注册
                register();
            } else {
                System.out.println("输入有误");
            }
        }
    }

    /**
     * 退出的方法
     */
    public void out() {
        System.out.println("正在退出");
        System.exit(0);
        System.out.println("退出成功");
    }
}

