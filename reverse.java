import java.util.Scanner;
class reverse {
public static void main(String[] args){
    int r,n,d,N;
    
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter a number:");

    n = sc.nextInt();
    sc.close();
     N=n;
    r = 0;
     while(n > 0)
    {
        d = n%10;
        r = r*10+d;
        n = n/10;
        
     }
     System.out.println("reverse number:"+ r);
    
     if(r==N){
        System.out.println("Number is palindrome");
     }
      
    else{
        System.out.println("number is not plindrome");
    }
}
}

