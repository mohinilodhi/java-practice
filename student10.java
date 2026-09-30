// Encapsulation


class BankAccount{
    private int balance;  //data private

    void setbalance(int balance){
        this.balance = balance;

    }
    int getbalance(){
        return balance;


    }

    }
    public class student10{
        public static void main(String[]args){
            BankAccount a1 = new BankAccount();
            a1.setbalance(90);
            System.out.println(a1.getbalance());



        }
    }

