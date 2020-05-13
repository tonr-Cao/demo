package studentManagementSystem;

/**
 * @author tonr_cao
 * @date 2020/5/11 - 7:58 下午
 */
public class LogIn {

    private int phone;
    private int role;

    public LogIn() {
    }

    public LogIn(int phone, int role) {
        this.phone = phone;
        this.role = role;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
