class FibonacciSeries{

//Non Recursive
public void Display1(int Count){
    int n1=0,n2=1,n3,i;   
    System.out.print(n1+" "+n2);//printing 0 and 1    
    
    for(i=2;i<Count;++i)//loop starts from 2 because 0 and 1 are already printed    
    {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
    }
    System.out.println(" ");
}

//Recursive
static int n1=0,n2=1,n3=0;    
static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 } 

public static void main(String args[])  
{    
 
FibonacciSeries F1 = new FibonacciSeries();
F1.Display1(10);

System.out.print(n1+" "+n2);//printing 0 and 1
printFibonacci(10-2);   ///n-2 because 2 numbers are already printed

}
}