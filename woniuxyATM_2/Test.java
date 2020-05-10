package woniuxyATM_2;

/**
 * 主方法类
 *
 * @author tonr_cao
 * @date 2020/5/10 - 8:49 上午
 */
public class Test {

    public static void main(String[] args) {

        //创建一个存放User对象的数组
        User[] userArr = new User[10];


        User user = new User();
        user.setName("cao");
        user.setPassWord(123);
        user.setMoney(100);

        User user2 = new User();
        user2.setName("yang");
        user2.setPassWord(123);
        user2.setMoney(1000);

        userArr[0] = user;
        userArr[1] = user2;



        //创建UI对象
        ShowUI showUI = new ShowUI();

        showUI.mainUI(userArr);


    }

    public static void printArray(User[] user) {
        for (int i = 0; i < user.length; i++) {
            if (user[i] != null) {
                System.out.println(user[i] + "");
            }
            System.out.println();
        }
    }
}
