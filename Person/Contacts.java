package Person;

public class Contacts {
    private int no;
    private String name;
    private String telno;
    private String emailaddress;
    private int id;

    public Contacts() {
    }

    public Contacts(int no, String name, String telno, String emailaddress, int id) {
        this.no = no;
        this.name = name;
        this.telno = telno;
        this.emailaddress = emailaddress;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    @Override
    public String toString() {
        return
                "id="+this.getId()+"\n"+
                "name="+this.getName()+"\n"+
                 "telno="+this.getTelno()+"\n"+
                 "email="+this.getEmailaddress()+"\n"+
                  "------------------------------------------------------------------------------------------";
    }
}
