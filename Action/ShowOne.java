package Action;
import Person.*;
import java.awt.List;
import java.util.*;
public class ShowOne implements Action{

    public void dosome(User user) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你想查看的联系人的姓名或者电话号码：");
        String message = in.next();
        for (int i = 0; i <user.getList().size(); i++) {
            if (message.equals(user.getList().get(i).getName())){
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("该联系人的电话号码为:"+user.getList().get(i).getTelno());
                System.out.println("该联系人的电邮地址为:"+user.getList().get(i).getEmailaddress());
                System.out.println("-------------------------------------------------------------------------------------");
            }
            else if (message.equals(user.getList().get(i).getTelno())){
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("该联系人的姓名为:"+user.getList().get(i).getName());
                System.out.println("-------------------------------------------------------------------------------------");
            }
        }
    }
}
