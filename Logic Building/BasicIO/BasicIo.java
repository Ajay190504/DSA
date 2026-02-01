//Read integer N, print its of different data types.

import java.util.Scanner;
public class BasicIo{

    
    public static void main(String[] args) {
        try (Scanner scr = new Scanner(System.in)) {
            System.out.print("Enter a Byte number: ");
            byte b = scr.nextByte();
            System.out.print("Byte: "+b);
            
            System.out.print("Enter a Short number: ");
            short sh = scr.nextShort();
            System.out.print("Short: "+sh);
            
            System.out.print("Enter an Integer number: ");
            int i = scr.nextInt();
            System.out.print("Integer: "+i);
            
            System.out.print("Enter a Long number: ");
            long l = scr.nextLong();
            System.out.print("Long: "+l);
            
            System.out.print("Enter a Float number: ");
            float f = scr.nextFloat();
            System.out.print("Float: "+f);
            
            System.out.print("Enter a Double number: ");
            double d = scr.nextDouble();
            System.out.print("Double: "+d);
            
            System.out.print("Enter a Character: ");
            char c = scr.next().charAt(0);
            System.out.print("Character: "+c);
            
            System.out.print("Enter a Boolean value: ");
            boolean bl = scr.nextBoolean();
            System.out.print("Boolean: "+bl);
            
            System.out.print("Enter a String: ");
            String str = scr.next();             //Only single word or token
            System.out.print("String: "+str);
            
            System.out.print("Enter a String: ");
            String str2 = scr.nextLine();        //Strig with spaces or multiple words or line
            System.out.print("String: "+str2);
        }
    }
}