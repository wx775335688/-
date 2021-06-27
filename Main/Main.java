package Main;

import Action.*;
import Person.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        User user = new User("吴旭","1");
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎使用个人通信录系统，请认真阅读以下使用说明！");
        System.out.println("功能编号对应的功能：[1]表示查看联系人列表；[2]表示添加一位新的联系人；" +
                "[3]表示删除一位已有的联系人；[4]表示查看一位已有的联系人；[0]表示退出系统。");
        while (true){
            System.out.println("请您输入功能编号：");
            int x = in.nextInt();
            if (x==1){
                Action printAction = new PrintAction();
                printAction.dosome(user);
            }else if (x==2){
                Action addAction = new AddAction();
                addAction.dosome(user);
            }else if (x==3){
                Action delAction = new DelAction();
                delAction.dosome(user);
            }else if (x==4){
                Action showone = new ShowOne();
                showone.dosome(user);
            }else if (x==0){
                System.out.println("感谢您的使用，期待您的下次使用。");
                return;
            }else{
                System.out.println("您输入的编号有误,请您重新输入.");
            }
        }
    }
}
