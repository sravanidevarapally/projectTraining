package io.threads;

/*
 * public class InterThreadExample {
 * 
 * }
 */

class Customer{  
int amount=10000;  
  
synchronized void withdraw(int amount){  
System.out.println("going to withdraw money from ATM...");  
  
if(this.amount<amount){  
System.out.println("Low balance alert; waiting for deposit...");  
try{wait();}catch(Exception e){}  
}  
this.amount-=amount;  
System.out.println("withdrawal completed...");  
}  
  
synchronized void deposit(int amount){  
System.out.println("going to deposit money in ATM...");  
this.amount+=amount;  
System.out.println("deposit completed... ");  
notify();  
}  
}  
  
class InterThreadExample{  
public static void main(String args[]){  
final Customer c=new Customer();  
new Thread(){  
public void run(){c.withdraw(15000);}  
}.start();  
new Thread(){  
public void run(){c.deposit(10000);}  
}.start();  
  
}}  