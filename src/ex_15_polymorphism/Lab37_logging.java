package ex_15_polymorphism;

public class Lab37_logging {
    public static void main(String[] args) {

        logging l1 = new logging();
        System.out.println(l1.log("chadan", "125455"));
    }
}


class logging{
    String log(String username, String password){
        System.out.println("enter username and password");
        return username + password;
    }


    }




