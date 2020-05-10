package woniuxyATM_2;

import java.util.Scanner;

/**
 * 主功能类
 *
 * @author tonr_cao
 * @date 2020/5/10 - 8:47 上午
 */
public class MainMenu {


    Test t = new Test();

    //登陆方法
    public void logIn(User[] users) {
        System.out.println("===欢迎来到woniuATM登陆界面===");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账户名:");
        String userName = sc.next();

        //判断账户名是否存在
        //定义一个下标记录
        int index = -1;

        for (int i = 0; i < users.length; i++) {
            //判断时候已经存在该账户名
            if (users[i].getName() != null && users[i].getName().equals(userName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("请输入密码:");
            int pWord = sc.nextInt();

            //校验密码
            if (users[index].getPassWord() != 0 && users[index].getPassWord() == pWord) {
                ShowUI showUI = new ShowUI();
                showUI.childUI(users, index);
            } else {
                System.out.println("用户名与密码不符");
            }

        } else {
            System.out.println("该账户名不存在");
        }

    }

    //注册方法
    public void register(User[] users) {
        System.out.println("===欢迎来到woniuATM注册界面===");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账户名:");
        String userName = sc.next();

        //判断是否已经存在该用户
        boolean flag = true;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getName().equals(userName)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("请输入账户密码：");
            int pWord = sc.nextInt();
            System.out.println("请输入金额:");
            double money = sc.nextDouble();

            //寻找第一个为null的位置存入数据
            //定义一个下标
            int index = -1;
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                users[index] = new User();
                users[index].setName(userName);
                users[index].setPassWord(pWord);
                users[index].setMoney(money);
                t.printArray(users);
            } else {
                System.out.println("服务器爆满，请稍后再试");
            }
        } else {
            System.out.println("该账户名已被占用");
        }
    }

    //退出方法
    public void end() {
        System.out.println("正在退出");
        System.exit(0);
        System.out.println("退出成功");
    }
}
