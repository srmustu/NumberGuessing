import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String m1,m2,m3,m4;
        int num,num2,counter = 5;


        m1 = "Please enter a number : ";
        m2 = "You failed.";
        m3 = "Your remaining right : ";
        m4 = "Right guess. Congratulation.";
        num2 = (int) (Math.random()*10);


        do {

            System.out.print(m1);
            num = inp.nextInt();
            System.out.println(m3 + counter);
            counter--;

            if (counter == 0){
                System.out.println(m2);
                break;
            }

        }while (num != num2);

        System.out.println(m4);




    }
}
