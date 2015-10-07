import java.util.*;
public class monteCarlo{


public static void main(String[] args){
long current = 0;
double log = 4000000000L;
double tries = 0 ;
double hits = 0;
double x,y;
Random sc = new Random(1);

while(current < log){
x = sc.nextDouble();
y= sc.nextDouble();
tries++;

double result = (x*x) + (y*y);
if(result <= 1)
    hits++;
current ++;
}


System.out.println(4*(hits/tries)); 
}
}
