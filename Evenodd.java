import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("enetered number is even.");
        }
        else{
            System.out.println("enetred number is odd.");
        }
    }
}
