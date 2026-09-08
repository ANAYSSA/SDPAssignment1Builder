import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        DirectorPizza d = new DirectorPizza();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Choose option:");
            System.out.println("1)Make Margarita");
            System.out.println("2)Make Own");
            System.out.println("0)Leave");
            int option = s.nextInt();
            if(option == 1){
                Pizza marga = d.makeMargarita();
                d.makeMargarita();
                System.out.println(marga);
            }else if(option == 2){
                System.out.println("Great lets start with name:");
                String name = s.next();
                System.out.println("Size:");
                String size = s.next();
                System.out.println("Temp:");
                String temp = s.next();
                System.out.println("Vegan:");
                boolean vegan = s.nextBoolean();
                d.makeOwn(name,size,temp,vegan);
                Pizza dd = d.makeOwn(name,size,temp,vegan);


                System.out.println(dd);
            }else if(option == 0){
                break;
            }

        }





    }

}