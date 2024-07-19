import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String m1,m2,m3,m4,m5,m6;
        int num,num2,counter = 5;


        m1 = "Please enter a number : ";
        m2 = "You failed.";
        m3 = "Your remaining right : ";
        m4 = "Right guess. Congratulation.";
        m5 = "The secret number is smaller.";
        m6 = "The secret number is larger.";
        num2 = (int) (Math.random()*10);


        do {

            System.out.print(m1);
            num = inp.nextInt();
            System.out.println(m3 + counter);

            if (num < num2){
                System.out.println(m6);
            } else if (num2 < num) {
                System.out.println(m5);
            }
            counter--;

            if (counter == 0){
                System.out.println(m2);
                break;
            }

        }while (num != num2);

        System.out.println(m4);




    }
}
