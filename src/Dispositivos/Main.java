package Dispositivos;

import Dispositivos.*;
import Dispositivos.Services.Device;

import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int menuOption = 0;
        int opcao = 0;
        boolean turnedOn = false;
        boolean homeButton = false;
        Scanner read = new Scanner(System.in);
        Scanner readP = new Scanner(System.in);
        String pausa = null;
        Device meuiPhone = new Device();


        do{
            meuiPhone.desligar();
            System.out.print("Ligar iPhone:\n   1 - Sim;\n   2 - Não;\n");
            menuOption = read.nextInt();
            if(menuOption == 1){
                turnedOn = true;
            }

        }while(!turnedOn);

        do {
            meuiPhone.ligar();

            System.out.print("Ação: ");
            menuOption = read.nextInt();

            switch (menuOption){
                case 1:
                    do{
                        pausa = null;
                        meuiPhone.phone();
                        System.out.print("Ação: ");
                        opcao = read.nextInt();

                        switch (opcao){
                            case 1:
                                meuiPhone.ligar();
                                homeButton = false;
                                pausa = readP.nextLine();
                                break;
                            case 2:
                                meuiPhone.atender();
                                homeButton = false;
                                pausa = readP.nextLine();
                                pausa = null;
                                break;
                            case 3:
                                meuiPhone.iniciarCorreioDeVoz();
                                homeButton = false;
                                pausa = readP.nextLine();
                                pausa = null;
                                break;
                            case 4:
                                homeButton = true;
                                break;
                            default:
                                break;
                        }
                    }while (!homeButton);
                    break;
                case 2:
                    do{
                        meuiPhone.iPod();
                        System.out.print("Ação: ");
                        opcao = read.nextInt();

                        switch (opcao){
                            case 1:
                                meuiPhone.tocar();
                                homeButton = false;
                                pausa = readP.nextLine();
                                break;
                            case 2:
                                meuiPhone.pausar();
                                homeButton = false;
                                pausa = readP.nextLine();
                                break;
                            case 3:
                                meuiPhone.selecionarMusica();
                                pausa = readP.nextLine();
                                homeButton = false;
                                break;
                            case 4:
                                homeButton = true;
                                break;
                            default:
                                break;
                        }
                    }while (!homeButton);
                    break;
                case 3:
                    do{
                        meuiPhone.web();
                        System.out.print("Ação: ");
                        opcao = read.nextInt();

                        switch (opcao){
                            case 1:
                                meuiPhone.exibirPagina();
                                homeButton = false;
                                pausa = readP.nextLine();
                                break;
                            case 2:
                                meuiPhone.adicionarNovaAba();
                                homeButton = false;
                                pausa = readP.nextLine();
                                break;
                            case 3:
                                meuiPhone.atualizarPagina();
                                pausa = readP.nextLine();
                                homeButton = false;
                                break;
                            case 4:
                                homeButton = true;
                                break;
                            default:
                                break;
                        }
                    }while (!homeButton);
                    break;
                case 4:
                    turnedOn = false;
                    meuiPhone.desligar();
                    break;
                default:
                    break;
            }
        }while (turnedOn);
    }
}