package ex_24_Exception;

public class Bank {

    private Integer amount;
    private  String currency;


    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }



    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public Integer add (Bank newbank)  {

        if (newbank.currency.equals("INR")){
            return newbank.amount + this.amount;
        }else {
            try {
                throw new customException("currency Mismatch");
            } catch (customException e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;


    }


}

     class customException extends Exception{
         customException(String msg){
             super(msg);
         }
     }

