package main;

import classes.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        System.out.println("Reprodutor Musical");
        iphone.selecionarMusica(" Simple Man-Lynyrd Skynyrd");
        iphone.pausar();
        iphone.tocar();
        System.out.println("\n");

        System.out.println("Aparelho Telefônico");
        iphone.ligar(" 119XXXXXXXX");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("\n");
        
        System.out.println("Navegador Internet");
        iphone.exibirpagina(" www.github.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}
