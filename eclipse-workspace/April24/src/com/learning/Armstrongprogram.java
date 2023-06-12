package com.learning;


public class Armstrongprogram {

 public static void main(String[] args) {
  int number=1634;
  Armstrongprogram am=new Armstrongprogram();
  int count=am.count_number(number);
  System.out.println("Count number result:"+count);
  int result=am.find_armstrong(number,count);
  System.out.println("Armsrong no result:"+result);
  if(number==result)
   System.out.println("The given number is Armstrong number");
  else
   System.out.println("Not Armstrong number");

 }

 int find_armstrong(int number, int count) {
  int arms=0;
  while(number>0)
  {
  int rem=number%10;
  arms=arms+find_power(rem,count);
  number=number/10;
  }
  return arms;
 }

 private int find_power(int base, int power) {
  int box=1;
  while(power>0)
  {
   box=box*base;
   power=power-1;
  }
  return box;
 }

 int count_number(int num) {
  int count=0;
  while(num>0)
  {
   int rem=num%10;
   count=count+1;
   num=num/10;
  }
  return count; 
 }

 
 
}