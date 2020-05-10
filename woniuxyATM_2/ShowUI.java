package woniuxyATM_2;

import java.util.Scanner;

/**
 * 主界面类
 * @author tonr_cao
 * @date 2020/5/10 - 8:46 上午
 */
public class ShowUI {

    //主界面方法
    public void mainUI(User[] userArr){
        System.out.println("===========欢迎使用登陆界面===========");
        System.out.println("===请输入你的选项：1:登陆，2:注册，3:退出===");
        System.out.println("======================================");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        MainMenu mainMenu = new MainMenu();

        if (option == 1){
            mainMenu.logIn(userArr);
        }else if (option == 2){
            mainMenu.register(userArr);
        }else if(option == 3){
            mainMenu.end();
        }else{
            System.out.println("输入有误");
        }
    }

    //子界面方法
    public void childUI(User[] userArr,int index){
        Scanner sc = new Scanner(System.in);
        System.out.println("=======欢迎来到WonATM系统=======");
        System.out.println("============选项列表============");
        System.out.println("==1:查询，2:取款，3:存款，4:转账，5:返回上一层==");
        System.out.println("请输入选项编码：");

        ChildMenu childMenu = new ChildMenu();

        int number = sc.nextInt();
        if(number == 1){
            childMenu.query(userArr,index);
        }else if(number == 2){
            childMenu.get(userArr,index);
        }else if(number == 3){
            childMenu.save(userArr,index);
        }else if(number == 4){
            childMenu.trans(userArr,index);
        }else if(number == 5){
            childMenu.back(userArr);
        }else{
            System.out.println("输入的编号有误，请重新输入");
        }
    }


}
