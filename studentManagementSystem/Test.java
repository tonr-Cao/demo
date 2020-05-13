package studentManagementSystem;

/**
 * @author tonr_cao
 * @date 2020/5/11 - 7:22 下午
 */
public class Test {

    public static void main(String[] args) {

        LogIn[] logIns = DateBase.logIns;

        Teacher t1 = new Teacher(1,1234,123,"cao",25,"男",10000);
        Teacher t2 = new Teacher(2,5678,333,"tong",30,"男",15000);

        //老师初始化
        Teacher[] teachers = DateBase.teachers;
        teachers[0] = t1;
        teachers[1] = t2;

        LogIn logIn = new LogIn();
        logIn.setPhone(1234);
        logIn.setRole(1);
        logIns[0] = logIn;

        LogIn logIn2 = new LogIn();
        logIn2.setPhone(5678);
        logIn2.setRole(1);
        logIns[1] = logIn2;

        //学生初始化
        Student[] students = DateBase.students;
        Student s1 = new Student(01,1311,123,"tong",25,"nana",100,1);
        LogIn logIn3 = new LogIn();
        logIn3.setPhone(1311);
        logIn3.setRole(0);
        students[0] = s1;
        logIns[2] = logIn3;

        Student s2 = new Student(02,1312,456,"qiong",30,"nv",90,2);
        LogIn logIn4 = new LogIn();
        logIn4.setPhone(1312);
        logIn4.setRole(0);
        students[1] = s2;
        logIns[4] = logIn4;



        ShowUI showUI = new ShowUI();

        showUI.mainUI();

    }
}
