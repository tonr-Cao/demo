package studentManagementSystem;

/**
 * 工具类
 *
 * @author tonr_cao
 * @date 2020/5/12 - 6:07 下午
 */
public class Util {

    public static int queryRoleByTel(int phone) {

        LogIn[] logIns = DateBase.logIns;
        int role = -1;
        for (int i = 0; i < logIns.length; i++) {

            //判断是否存在
            if (logIns[i] != null && logIns[i].getPhone() != 0 && logIns[i].getPhone() == phone) {
                role = logIns[i].getRole();
                break;
            }
        }
        return role;
    }

    public static void sortStudentScore() {

        Student[] students = DateBase.students;

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j] != null && students[j + 1] != null && students[j].getScore() < students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
