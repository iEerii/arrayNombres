import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre: ");
            nombres[i] = sc.nextLine();
        }

        System.out.println("los nombres son: ");

        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + ", ");
        }

    }
}