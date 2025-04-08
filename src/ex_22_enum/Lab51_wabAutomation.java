package ex_22_enum;

public class Lab51_wabAutomation {
    public static void main(String[] args) {
        System.out.println(Locator.page_button.getLocator());
        System.out.println(Locator.page_input.getLocator());

        System.out.println(URLs.google.getUrls());
        System.out.println(URLs.safari.getUrls());
    }
}
