import java.util.Collections;
import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("账户:");
            String s1 = scanner.next();
            if (!"admin".equals(s1)) {
                System.out.println("账户不存在");
                System.out.println("还剩" + (i - 1) + "次机会");
                continue;
            }
            System.out.println("密码:");
            String s2 = scanner.next();
            if (!"admin".equals(s2)) {
                System.out.println("密码错误");
                System.out.println("还剩" + (i - 1) + "次机会");
                continue;
            }
            System.out.println("登陆成功,欢迎你");
            return;
        }

    }
}
