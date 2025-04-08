package ex_22_enum;

public enum Locator {

    page_button ("#btn#"),
    page_input("#input");

    private String Locator;
    Locator (String Locator){
        this.Locator=Locator;
    }
    String getLocator(){
        return this.Locator;
    }
}
