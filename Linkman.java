public class Linkman {
    private String id;
    private String name;
    private String telephoneNumber;
    private String emailAddress;

    public Linkman() {
    }

    public Linkman(String id,String name, String telephoneNumber, String emailAddress) {
        this.name = name;
        this.id = id;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj==null||!(obj instanceof Linkman)){
            return false;
        }
        if (this==obj){
            return true;
        }
        Linkman linkman = (Linkman) obj;
        if (this.id==linkman.getId()){
            return true;
        }
        return false;
    }
}

