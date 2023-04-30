import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

//Task 1
        System.out.println("Enter 3 float numbers: ");
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        if(a>=b){
            if(a>=c){
                System.out.printf("%f is the max\n",a);
            }
            else{
                System.out.printf("%f is the max\n",c);
            }
        }
        else{
            if(b>=c){
                System.out.printf("%f is the max\n",b); 
            }
            else{
                System.out.printf("%f is the max\n",c); 
            }
        }
    
//Task 2
        System.out.println("Enter 3 numbers: ");
        short num1 = s.nextShort();
        short num2 = s.nextShort();
        short num3 = s.nextShort();
        int min = (num1 <= num2) ? ((num1 <= num3) ? num1 : num3) : ((num2 <= num3) ? num2 : num3);
        System.out.printf("%d is the min\n",min); 

//Task 3

        System.out.println("Enter 2 numbers:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.print("Enter a symbol (+, -, *, /): ");
        char symbol = s.next().charAt(0);

        int result = 0;
        switch (symbol) {
            case '-':
                result = n1 - n2;
                break;
            case '+':
                result = n1 + n2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    break;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Your choice is incorrect");
                break;
        }

        System.out.printf("Result: %d\n", result);

//Task 4
        System.out.println("Enter a charater: ");
    char ch = s.next().charAt(0);        
        if((int)ch>=65 && (int)ch<=90){
            ch+=32;
            System.out.println("New character: "+ch);
        }
        else if((int)ch>=97 && (int)ch<=122){
            ch-=32;
            System.out.println("New character: "+ch);
        }
        else{
            System.out.println("The character is not alphabetical");
        }

    int arr[] = new int[]{2,5,7,8,12,11,17,14};
    int n_1,n_2;
    int n1_first_term,n1_last_term,n2_first_term,n2_last_term;
    if(arr.length%2==1){
        n1_first_term = arr[0];
        n1_last_term = arr[arr.length-1];
        n2_first_term = arr[1];
        n2_last_term = arr[arr.length-2];
    }
    else{
        n1_first_term = arr[0];
        n1_last_term = arr[arr.length-2];
        n2_first_term = arr[1];
        n2_last_term = arr[arr.length-1];
    }
    n_1 = (n1_last_term - n1_first_term)/5 + 1;
    n_2 = (n2_last_term - n2_first_term)/3 + 1;
    
    int sum = n_1/2 * (n1_first_term+n1_last_term) + n_2/2 *(n2_first_term+n2_last_term);
    System.out.printf("The sum of the elements: %d\n",sum);
    s.close();

    }
}