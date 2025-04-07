import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        // Datos del cliente
        String name = "Tony Stark";
        String accountType = "Corriente";
        double balance = 1599.99;
        int option = 0;

        System.out.println("************************************");
        System.out.println("\nNombre del cliente: " + name);
        System.out.println("El tipo de cuenta es: " + accountType);
        System.out.println("El saldo disponible es: $/." + balance);
        System.out.println("\n************************************");

        // Menu de opciones
        String menu = """
                *** Escriba el número de la opción deseada ***
                1 - Consultar saldo
                2 - Retirar saldo
                3 - Depositar saldo
                9 - Salir
                """;

        Scanner keyboard = new Scanner(System.in);
        while (option != 9) {
            System.out.println(menu);
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.println("El saldo actualizado es: $/." + balance);
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double cashValue = keyboard.nextDouble();
                    if (cashValue > balance) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        balance -= cashValue;
                        System.out.println("El saldo actualizado es: $/." + balance);
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea depositar?");
                    double depositValue = keyboard.nextDouble();
                    balance += depositValue;
                    System.out.println("El saldo actualizado es: $/." + balance);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}