import java.util.*;
public class AddressList {
    private Linkman[] addresslist;
    Scanner in = new Scanner(System.in);
    public AddressList(){
        addresslist =new Linkman[1000];
    }
    int index=0;
    public void addLinkman (){
        for (int i = index; i < addresslist.length; i++) {
            if (null==addresslist[i]&&i<addresslist.length){
                Linkman linkman = new Linkman();
                Scanner in = new Scanner(System.in);
                System.out.print("请输入第"+(i+1)+"个联系人的id：");
                String id = in.next();
                linkman.setId(id);
                System.out.print("请输入第"+(i+1)+"个联系人的姓名：");
                String name = in.next();
                linkman.setName(name);
                System.out.print("请输入第"+(i+1)+"个联系人的电话号码：");
                String telnum = in.next();
                linkman.setTelephoneNumber(telnum);
                System.out.print("请输入第"+(i+1)+"个联系人的电邮地址：");
                String emailAddress = in.next();
                linkman.setEmailAddress(emailAddress);
                System.out.println("该联系人已经添加到您的通讯录。");
                System.out.println("---------------------------------------");
                addresslist[i] = linkman;
                index++;
                break;
            }else {
                System.out.println("通讯录人数已满，无法添加联系人！");
                break;
            }
        }
    }
    /*public void delLinkman (){
        System.out.println("请输入您想删除的联系人id：");
        String id = in.next();
        for (int i = 0; i < addresslist.length; i++) {
            if (null!=addresslist[i]&&id.equals(addresslist[i].getId())){
                addresslist[i]=null;
                System.out.println("该联系人已经从您的通讯录中删除。");
                break;
            }else{
                System.out.println("您输入的id不存在或有误。");
                break;
            }
        }
    }
    */

    public void showAll (){
        for (int i=0;i<addresslist.length;i++) {
            if (addresslist[i] != null) {
                System.out.println("------------------------------------------------------------");
                System.out.println("id:" + addresslist[i].getId());
                System.out.println("姓名:" + addresslist[i].getName());
                System.out.println("电话号码:" + addresslist[i].getTelephoneNumber());
                System.out.println("电邮地址:" + addresslist[i].getEmailAddress());
                System.out.println("------------------------------------------------------------");
                continue;
            }else {
                System.out.println("您的通讯录中暂时没有存入任何信息。");
                break;
            }
        }
    }
    public void show(){
        System.out.println("请输入你想查看的联系人的姓名或者电话号码：");
        String message = in.next();
        for (int i = 0; i < addresslist.length; i++) {
            if (null!=addresslist[i]&&message.equals(addresslist[i].getName())){
                System.out.println("-------------------------------------------------------------");
                System.out.println("该联系人的电话号码为:"+addresslist[i].getTelephoneNumber());
                System.out.println("该联系人的电邮地址为:"+addresslist[i].getEmailAddress());
                System.out.println("-------------------------------------------------------------");
            }
            else if (null!=addresslist[i]&&message.equals(addresslist[i].getTelephoneNumber())){
                System.out.println("-------------------------------------------------------------");
                System.out.println("该联系人的姓名为:"+addresslist[i].getName());
                System.out.println("-------------------------------------------------------------");
            }
        }
    };
}