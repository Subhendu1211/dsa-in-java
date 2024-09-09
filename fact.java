import java.util.Scanner;

public class fact { 
    public static void main(String[] args) {
        int n;
        System.out.println("enter any no");
        scanner f=new scanner(System.in);
        n=f.nextInt();
        fact obj=new fact();
        int result=obj.factorial(n);
        System.out.println(+result);
    }
int factorial(int n){
    if(n==1){
        return 1;
    }
    else{
        return n*factorial(n-1);
    }
}
}