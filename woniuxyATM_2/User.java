package woniuxyATM_2;

/**
 * User类
 *
 *      属性：
 *          姓名
 *          密码
 *          余额
 * @author tonr_cao
 * @date 2020/5/10 - 8:48 上午
 */
public class User {

    private String name;
    private int passWord;
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User(String name, int passWord, double money) {
        this.name = name;
        this.passWord = passWord;
        this.money = money;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", passWord=" + passWord +
                ", money=" + money +
                '}';
    }
}
