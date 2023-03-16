import java.util.Scanner;
public class user{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random()*100);
        int num=0;
        do{
            System.out.println("Guess The Number From 1 to 99");
            num = sc.nextInt();
            if(num==number){
                System.out.println("You guess the Right number");
                break;
            }
            else if(num>number){
                System.out.println("You guess is bigger");
            }
            else{
                System.out.println("Your guess is small");
            }
        }while(num >= 0);
        System.out.println("your number is " );
        System.out.println(number);
    }
    
}