import java.util.Scanner;

public class Member {

   private String name;
   private int mage, msalary;


    public void setname(String n) {
        //System.out.println("Member's Name:");
        //this.name=n;
    }
    public String getname(){}

    public void setage(int age) {

        this.mage = age;
    }

    public int getage() {
        //System.out.println("Member's Age" + mage);
        return mage;
    }

    public void setsal(int salary) {

        msalary = salary;
    }

    public int getsal() {
        //System.out.println("Member's Salary" + msal);
        return msalary;
    }

}

    public static void main(String[] args){
        Member m1=new Member();
        String s1=m1.getname("Harry Potter");
        int a=m1.setage(30);
        m1.getage();
        int b=m1.setsal(2500.3);
        m1.getsal();

        System.out.println("Member's Name:"+s1+"Member's Age:"+a+"Member's Salary:"+b);



    }


}
