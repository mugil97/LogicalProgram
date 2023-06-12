package com.learning;

class Looping_practice_2
{
public static void main (String[]args)
{
Looping_practice_2 lp = new Looping_practice_2();
int no = 1;
while (no<=5)
{
int power = lp.find_power(no,no);
System.out.println(power);
no = no + 1;
}
}
int find_power(int base,int power)
{
int box = 1;
while(power>0)
{
box = box * base;
power = power - 1;
}
return box;

}

}
