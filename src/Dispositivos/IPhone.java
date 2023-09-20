package Dispositivos;

import Services.CellPhone;
import Services.IPod;
import Services.WebBrowser;

public class IPhone implements IPod, CellPhone, WebBrowser {

    //iPod

    public void tocar() {
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃   MÚSICAS    ┃\n" +
                "|┃              ┃\n" +
                " ┃ The Beatles  ┃\n" +
                " ┃  Something   ┃\n" +
                " ┃              ┃\n" +
                " ┃   <- ► ->    ┃\n" +
                " ┃______________┃\n" +
                " ┃      O       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    public void pausar() {
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃   MÚSICAS    ┃\n" +
                "|┃              ┃\n" +
                " ┃ The Beatles  ┃\n" +
                " ┃  Something   ┃\n" +
                " ┃              ┃\n" +
                " ┃   <- ⏸ ->   ┃\n" +
                " ┃______________┃\n" +
                " ┃      O       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    public void selecionarMusica() {
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃   MÚSICAS    ┃\n" +
                "|┃              ┃\n" +
                " ┃   Hey Jude   ┃\n" +
                " ┃  Yesterday   ┃\n" +
                " ┃  Let It Be   ┃\n" +
                " ┃  Something   ┃\n" +
                " ┃______________┃\n" +
                " ┃      O       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    //Phone

    public void ligar() {
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃  91234-4321  ┃\n" +
                "|┃              ┃\n" +
                " ┃  |1| |2| |3| ┃\n" +
                " ┃  |4| |5| |6| ┃\n" +
                " ┃  |7| |8| |9| ┃\n" +
                " ┃  |*| |0| |9| ┃\n" +
                " ┃______________┃\n" +
                " ┃      O       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    public void atender() {
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃ Marcos Paulo ┃\n" +
                "|┃              ┃\n" +
                " ┃              ┃\n" +
                " ┃  |ACEITAR|   ┃\n" +
                " ┃              ┃\n" +
                " ┃  |RECUSAR|   ┃\n" +
                " ┃______________┃\n" +
                " ┃      O       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    public void iniciarCorreioDeVoz() {
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃CORREIO DE VOZ┃\n" +
                "|┃              ┃\n" +
                " ┃ Miguel 02:10 ┃\n" +
                " ┃ Jonas  01:21 ┃\n" +
                " ┃ Bruno  00:45 ┃\n" +
                " ┃ Yago   05:15 ┃\n" +
                " ┃______________┃\n" +
                " ┃      O       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    //web

    public void exibirPagina(){
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃          |+| ┃\n" +
                "|┃   |Google|   ┃\n" +
                " ┃              ┃\n" +
                " ┃  qwertyuiop  ┃\n" +
                " ┃  asdfghjkl   ┃\n" +
                " ┃   zxcvbnm    ┃\n" +
                " ┃______________┃\n" +
                " ┃      O       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    public void adicionarNovaAba(){
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃          |+| ┃\n" +
                "|┃  __________  ┃\n" +
                " ┃  | Google |  ┃\n" +
                " ┃  __________  ┃\n" +
                " ┃  |  Nova  |  ┃\n" +
                " ┃  |   Aba  |  ┃\n" +
                " ┃______________┃\n" +
                " ┃      O       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    public void atualizarPagina(){
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃          |+| ┃\n" +
                "|┃   |Google|   ┃\n" +
                " ┃              ┃\n" +
                " ┃              ┃\n" +
                " ┃              ┃\n" +
                " ┃              ┃\n" +
                " ┃______________┃\n" +
                " ┃      O       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }
}