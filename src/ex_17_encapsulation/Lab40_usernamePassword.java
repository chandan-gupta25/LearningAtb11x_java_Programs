package ex_17_encapsulation;

public class Lab40_usernamePassword {
    public static void main(String[] args) {

        vwLogging vwl1 = new vwLogging("chandan", "12345");

        vwl1.setUserName("chan1486");
        System.out.println(vwl1.getUserName());
        vwl1.setPassword("we41212", true);
        System.out.println(vwl1.getPassword());
    }
}



class vwLogging{

    private String userName;
    private  String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean Isadmin) {
        if (Isadmin){
        this.password = password;
    }else {
            System.out.println("not admin");
        }
    }


    public vwLogging(String userName, String password){

        this.userName = userName;
        this.password = password;

    }

}
