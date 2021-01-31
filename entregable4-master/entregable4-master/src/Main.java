import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el telefono que quieras");
        String telefono=sc.nextLine();
       Phonehouse.Phonehouses(telefono);
        System.out.println("Presiona enter para comparar precios en las dos paginas");
        sc.nextLine();
         MiMovil.MiMovil(telefono);



    }

}
