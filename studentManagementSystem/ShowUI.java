package studentManagementSystem;

import java.util.Scanner;

/**
 * @author tonr_cao
 * @date 2020/5/11 - 7:29 下午
 */
public class ShowUI {

    /**
     * 主界面
     */
    public void mainUI(){
        System.out.println("============欢迎来到学生管理系统==========");
        System.out.println("===请输入你的选项：1:登陆，2:注册，3:退出===");
        System.out.println("请输入你的选项：");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        MainMenu mainMenu = new MainMenu();
        if(option == 1){
            mainMenu.logIn();
        }else if(option == 2){
            mainMenu.register();
        }else if(option == 3){
            mainMenu.out();
        }else{
            System.out.println("你输入的选项有误");
        }

    }


    /**
     * 学生功能界面
     */
    public void studentChildMenu(int index){
        System.out.println("==========欢迎来到学生功能选项============");
        System.out.println("====请输入你的选项：1：查询自己的信息，2：修改密码，3：切换老师,4:退出=====");
        System.out.println("请输入你的选项：");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        StudentChildMenu studentChildMenu = new StudentChildMenu();
        if(option == 1){
            studentChildMenu.info(index);
        }else if(option == 2){
            studentChildMenu.setPassWord(index);
        }else if(option == 3){
            studentChildMenu.switchTeacher(index);
        }else if(option == 4){
            studentChildMenu.out();
        }else{
            System.out.println("你的输入有误");
        }
    }

    /**
     * 老师功能界面
     */
    public void teacherChildMenu(int index){
        System.out.println("==========欢迎来到老师功能选项============");
        System.out.println("====请输入你的选项：1：查询学生成绩，2：登记学生成绩，3：根据学生姓名修改学生成绩");
        System.out.println("请输入你的选项：");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        TeacherChildMenu teacherChildMenu = new TeacherChildMenu();
        if(option == 1){
            teacherChildMenu.checkStudentScores(index);
        }else if(option == 2){
            teacherChildMenu.registerScore(index);
        }else if(option == 3){
            teacherChildMenu.checkStudentScores(index);
        }else{
            System.out.println("你输入的选项有误");
        }
    }
}
