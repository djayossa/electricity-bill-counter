import java.util.Scanner;
class DecimalToBinary {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a decimal number: ");
int decNumber = input.nextInt();
//System.out.println(decNumber/2);
String binary = "";
String sumOfNumbers = "";
for (int i = 1 ; i>= 0; i++) {
binary = String.valueOf((decNumber%2));
sumOfNumbers += binary;
decNumber = decNumber/2;
if (decNumber == 1){
binary = String.valueOf((decNumber%2));
sumOfNumbers += binary;
String reversed = new StringBuilder(sumOfNumbers).reverse().toString();
System.out.println(reversed);
break;
}

}
}
}