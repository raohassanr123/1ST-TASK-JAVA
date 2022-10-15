
import java.util.Scanner;

class cpn {
    public static void main (String arg[]){


    double matric;
    double inter; 
    double entry;
    double cpn;


    Scanner input = new Scanner(System.in);

    
    

    System.out.println("Enter your matric  marks");
    matric = input.nextDouble();

    System.out.println("Enter your Inter marks");
    inter = input.nextDouble();

    System.out.println("Enter your Entry test marks");
    entry = input.nextDouble();

    // System.out.println("This is your CPN");
    // cpn = input.nextDouble();


        cpn=(matric*0.10)+(inter*0.30)+(entry*0.60);
        System.out.println("This is your CPN "+(cpn));
   
    }


    
}
