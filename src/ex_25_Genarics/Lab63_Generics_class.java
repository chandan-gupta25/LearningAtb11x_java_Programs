package ex_25_Genarics;

public class Lab63_Generics_class {
    public static void main(String[] args) {

        GenericClass<Integer> objectRefer = new GenericClass(10);
       // GenericClass<String> stringObjectRefer = new GenericClass("chandan");   if we pass string then T become String

    }
}  // this is a generics class
class GenericClass <T>{       // if we pass integer then T become Integer
    private T data;    // T is a placeholder it can be any data type

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}


