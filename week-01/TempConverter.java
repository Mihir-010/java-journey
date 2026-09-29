import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        float temp = sc.nextFloat();

        System.out.println("Convert to (C/F): ");
        char ch = sc.next().charAt(0);

        if(ch == 'C'){
            float res = (temp - 32) * 5/9;
            System.out.println(+temp+" F = "+res);
        }
        else if(ch == 'F'){
            float res = temp * 9/5 + 32;
            System.out.println(+temp+" C = "+res);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
