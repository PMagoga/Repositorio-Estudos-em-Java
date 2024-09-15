package construtores.application;

import construtores.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        // declarando a variável com o objeto para utilizar em toda a classe
        Account account;

        // iniciando a interação com o usuário
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n");
        char response = sc.next().charAt(0);
        if (response == 'y'){ // se a resposta for sim, instancia account com 3 argumentos
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else { //caso resposta não, instancia account com 2 argumentos
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        sc.close();
    }
}
