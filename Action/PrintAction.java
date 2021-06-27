package Action;
import java.util.*;
import Person.*;

public class PrintAction implements Action{
    public void dosome (User user){
        Iterator<Contacts> iter = user.getList().iterator();
        while (iter.hasNext()){
            Contacts contacts = iter.next();
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println(contacts.toString());
        }
        System.out.println("打印完毕！");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
