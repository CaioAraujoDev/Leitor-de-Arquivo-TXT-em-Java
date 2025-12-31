package com.araujo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String confirm;
        Scanner entUsua = new Scanner(System.in);
        System.out.println("\nLeitor de arquivo TXT");
        while(true) {
            System.out.println("\nPrimeiro adicione seu Arquivo TXT dentro da pasta resource(src/main/resources)\nEm seguida, coloque o nome: teste");
            System.out.println("\nApós ler as instruções acima, confirme se você ja adicionou o arquivo (S/N)");
            confirm = entUsua.nextLine();
            if (confirm.toLowerCase().charAt(0) == 'n') {
                System.out.println("Volte quando colocar");
                System.exit(0);
            } else if (confirm.toLowerCase().charAt(0) == 's') {
                break;
            }else {
                System.out.println("Resposta incorreta");
            }
        }
        System.out.println("Texto sendo mostrado abaixo: \n\n");
        Arquivotxt.lerarquivo();

    }
}
