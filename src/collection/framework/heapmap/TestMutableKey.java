package collection.framework.heapmap;

import java.util.HashMap;

/**
 * Created by neelabhsingh on 26/10/16.
 */
class Account{
    private int accountNumber;
    private String holderName;
    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setHolderName(String holderName){
        this.holderName = holderName;
    }
    public String getHolderName(){
        return holderName;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    //Hash Code should only depends on Account Number
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result*prime + accountNumber;
        return result;
    }

    //Compare only account number
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() !=obj.getClass()){
            return false;
        }
        Account obj1 = (Account)obj;
        if(obj1.accountNumber!=this.accountNumber){
            return false;
        }
        return true;
    }
}
public class TestMutableKey {
    public static void main(String [] args){
        HashMap<Account, String> hashMap = new HashMap<Account, String>();
        Account acc1 = new Account(1);
        acc1.setHolderName("ABC");
        hashMap.put(acc1, acc1.getHolderName());

        Account acc2 = new Account(2);
        acc1.setHolderName("CDE");
        hashMap.put(acc2, acc2.getHolderName());

        Account acc3 = new Account(1);
        acc1.setHolderName("FFG");
        hashMap.put(acc3, acc3.getHolderName());
    }
}
