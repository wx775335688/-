package Action;

import Person.*;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddAction implements Action{
    Scanner in = new Scanner(System.in);
    public void dosome (User user) {
            int index=user.getList().size();
            Contacts contact = new Contacts();
            contact.setNo(index);
            System.out.print("请输入第"+(index+1)+"个联系人的id(数字)：");
            int id = in.nextInt();
            contact.setId(id);
            System.out.print("请输入第"+(index+1)+"个联系人的姓名：");
            String name = in.next();
            contact.setName(name);
            System.out.print("请输入第"+(index+1)+"个联系人的电话号码：");
            String telnum = in.next();
            contact.setTelno(telnum);
            System.out.print("请输入第"+(index+1)+"个联系人的电邮地址：");
            String emailAddress = in.next();
            contact.setEmailaddress(emailAddress);
            System.out.println("该联系人已经添加到您的通讯录。");
            System.out.println("-------------------------------------------------------------------------------------");
            user.getList().add(index,contact);
            index++;
    }
}
