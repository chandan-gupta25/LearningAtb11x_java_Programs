package ex_05_incerment_decrement;

public class Lab07_prefix_postfix_increment {
    public static void main(String[] args) {
        // pre increment
        int a = 10;
        int b = ++a; //the value of a increment first then store thats why value of a showing 11
        System.out.println(a);

        System.out.println(b);

//            post increment
        int a_post = 10;
        System.out.println(a_post++ + ++a_post);
        System.out.println(a_post);
        //System.out.println(a_post);


        int a1 = 10;
        int result = a1++;
        System.out.println(a1);
        System.out.println(result);

    }


}
