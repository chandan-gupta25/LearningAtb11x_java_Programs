package ex_22_enum;

public enum URLs {

    google ("http/google.com"),
    safari ("http/safari.com");

    private String Urls;
    URLs(String Urls){
        this.Urls =Urls;
    }
    String getUrls(){
        return this.Urls;
    }

}
