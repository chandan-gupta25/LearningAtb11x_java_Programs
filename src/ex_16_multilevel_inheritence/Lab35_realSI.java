package ex_16_multilevel_inheritence;

public class Lab35_realSI {
    public static void main(String[] args) {

        Lab33_TC1 tc = new Lab33_TC1();
        //tc.openBrowser();
        //tc.closeBrowser();
        tc.runningTC1();
        //tc.readExelFiles();

        Lab34_TC2 testCase2 = new Lab34_TC2();
        System.out.println("this is TC2--------------");

        //testCase2.openBrowser();
        //testCase2.closeBrowser();
        testCase2.runningTC2();

    }

}
