package Dispositivos;

import Services.*;
public class Device extends IPhone{
    public void ligarIphone() {
        System.out.println(
            "\n\n\n\n\n\n" +
            " ╭━━━━━━━━━━━━━━╮\n" +
            " ┃----●━━━══----┃\n" +
            " ┃              ┃\n" +
            "|┃  1 - Phone   ┃\n" +
            " ┃   2 - iPod   ┃\n" +
            " ┃   3 - Web    ┃\n" +
            " ┃   4 - Off    ┃\n" +
            " ┃              ┃\n" +
            " ┃______________┃\n" +
            " ┃      0       ┃\n" +
            " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    public void desligar() {
        System.out.println(
            "\n\n\n\n\n\n" +
            " ╭━━━━━━━━━━━━━━╮\n" +
            " ┃----●━━━══----┃\n" +
            " ┃              ┃\n" +
            "|┃              ┃\n" +
            " ┃              ┃\n" +
            " ┃              ┃\n" +
            " ┃              ┃\n" +
            " ┃              ┃\n" +
            " ┃______________┃\n" +
            " ┃      0       ┃\n" +
            " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    public void phone() {
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃              ┃\n" +
                "|┃  1 - Ligar   ┃\n" +
                " ┃ 2 - Atender  ┃\n" +
                " ┃3 - Voicemail ┃\n" +
                " ┃   4 - Home   ┃\n" +
                " ┃              ┃\n" +
                " ┃______________┃\n" +
                " ┃      0       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    public void iPod() {
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃              ┃\n" +
                "|┃   1 - Play   ┃\n" +
                " ┃   2 - Pause  ┃\n" +
                " ┃ 3 - Playlist ┃\n" +
                " ┃   4 - Home   ┃\n" +
                " ┃              ┃\n" +
                " ┃______________┃\n" +
                " ┃      0       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }

    public void web() {
        System.out.println(
                "\n\n\n\n\n\n" +
                " ╭━━━━━━━━━━━━━━╮\n" +
                " ┃----●━━━══----┃\n" +
                " ┃              ┃\n" +
                "|┃ 1 - Pesquisa ┃\n" +
                " ┃ 2 - Nova Aba ┃\n" +
                " ┃3 - Atualizar ┃\n" +
                " ┃   4 - Home   ┃\n" +
                " ┃              ┃\n" +
                " ┃______________┃\n" +
                " ┃      0       ┃\n" +
                " ╰━━━━━━━━━━━━━━╯\n"
        );
    }


}