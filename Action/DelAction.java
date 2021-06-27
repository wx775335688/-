package Action;
import java.util.*;

import Person.Contacts;
import Person.User;

public class DelAction implements Action{

    public void dosome(User user) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您想要删除联系人的id:");
        int id = in.nextInt();
        Iterator<Contacts> iter = user.getList().iterator();
        while (iter.hasNext()){
            Contacts contacts = iter.next();
            if (contacts.getId()==id){
                user.getList().remove(id-1);
                System.out.println("删除成功！");
                System.out.println("-------------------------------------------------------------------------------------");
                break;
            }
        }
    }
}
