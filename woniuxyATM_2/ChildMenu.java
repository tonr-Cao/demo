package woniuxyATM_2;

import java.util.Scanner;

/**
 * 子功能类
 *
 * @author tonr_cao
 * @date 2020/5/10 - 8:48 上午
 */
public class ChildMenu {

    //查询方法
    public void query(User[] userArr, int index) {
        double money = userArr[index].getMoney();
        System.out.println("账户余额为：" + money);
    }

    //取款方法
    public void get(User[] userArr, int index) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入取款金额：");
        double outputMoney = sc.nextDouble();

        //账户中有的金额
        if (userArr[index].getMoney() >= outputMoney) {
            double result = userArr[index].getMoney() - outputMoney;
            userArr[index].setMoney(result);
            Test t = new Test();
            t.printArray(userArr);
        } else {
            System.out.println("你的余额不足，取款无效");
        }

    }


    //存款方法
    public void save(User[] userArr, int index) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存款金额:");
        double inputMoney = sc.nextDouble();

        //账户中的金额
        double money = userArr[index].getMoney();
        double result = money + inputMoney;
        userArr[index].setMoney(result);
        Test t = new Test();
        t.printArray(userArr);
    }

    //转帐方法
    public void trans(User[] userArr, int index) {
        //要转账的用户
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户姓名:");
        String otherName = sc.next();

        //判断用户是否存在，如果存在就记录下标，如果不存在就提示转账失败
        int otherIndex = -1;
        for (int i = 0; i < userArr.length; i++) {
            if (userArr[i] != null && userArr[i].getName().equals(otherName)) {
                otherIndex = i;
                break;
            }
        }
        if (otherIndex != -1) {
            System.out.println("请输入转账金额:");
            double outPutMoney = sc.nextDouble();
            double money = userArr[index].getMoney();
            //提取方剩余的钱
            money = money - outPutMoney;
            //得到方剩余的钱
            double newMoney = userArr[otherIndex].getMoney() + outPutMoney;
            userArr[index].setMoney(money);
            userArr[otherIndex].setMoney(newMoney);
            Test t = new Test();
            t.printArray(userArr);
        }
    }

    //放回主界面的方法
    public void back(User[] userArr) {
        ShowUI showUI = new ShowUI();
        showUI.mainUI(userArr);
    }


}
