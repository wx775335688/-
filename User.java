import java.util.Scanner;

public class User {
    private String name;
    private String password;

    public User() {
        
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login (User user){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入密码：");
        int pw = in.nextInt();
        String str = new String();
        str = str.valueOf(pw);
        if (str.equals(this.getPassword())){
            System.out.println("登陆成功，欢迎您使用本系统！");
            return true;
        }else{
            System.out.println("密码错误，登录失败！");
        }
        return false;
    }
}
