package studentManagementSystem;

/**
 * @author tonr_cao
 * @date 2020/5/11 - 6:52 下午
 */
public class Teacher {

    private int teacherId;
    private int phone;
    private int passWord;
    private String name;
    private int age;
    private String sex;
    private double pay;

    public Teacher(int teacherId, int phone, int passWord, String name, int age, String sex, double pay) {
        this.teacherId = teacherId;
        this.phone = phone;
        this.passWord = passWord;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.pay = pay;
    }

    public Teacher() {
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }


}
