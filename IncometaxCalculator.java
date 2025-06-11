import java.util.Scanner;
public class practice {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the income: ");
            int income=sc.nextInt();
            int tax=0;
            if(income>0 && income<500000){
                tax=0;
                System.out.println("You've to pay tax="+tax);
            }
            else if(income>500000 && income<1500000){ 
                tax = (int) ( income * 0.2);
                System.out.println("You've to pay tax= "+tax);
            }
            else{
                tax= (int) (income*0.3);
                System.out.println("Pay 30% tax="+tax);}
}
}
