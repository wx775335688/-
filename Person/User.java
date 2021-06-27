package Person;

import java.util.*;

public class User {
    private String name;
    private String password;
    private List<Contacts> list = new LinkedList<Contacts>();
    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        List <Contacts> list = new LinkedList<Contacts>();
        this.list = list;
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

    public List<Contacts> getList() {
        return list;
    }

    public void setList(List<Contacts> list) {
        this.list = list;
    }

    public boolean login (User user){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入密码：");
        int pw = in.nextInt();
        String str = new String();
        str = str.valueOf(pw);
        if (str.equals(this.getPassword())){
            System.out.println("登陆成功，欢迎您使用本系统！");
            System.out.println("-----------------------------------------------------------------------------");
            return true;
        }else{
            System.out.println("密码错误，登录失败！");
            System.out.println("------------------------------------------------------------------------------");
        }
        return false;
    }
}

