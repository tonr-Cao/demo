package studentManagementSystem;

/**
 * @author tonr_cao
 * @date 2020/5/11 - 6:52 下午
 */
public class Student {

    private int stuId;
    private int phone;
    private int passWord;
    private String name;
    private int age;
    private String sex;
    private int score;
    private int teacherId;
    public Student() {
    }

    public Student(int stuId, int phone, int passWord, String name, int age, String sex, int score, int teacherId) {
        this.stuId = stuId;
        this.phone = phone;
        this.passWord = passWord;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
        this.teacherId = teacherId;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }


}
