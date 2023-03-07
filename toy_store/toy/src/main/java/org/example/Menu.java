package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    final String path = "/home/vildan/IdeaProjects/attestation/toy_store/data.json";
    final String winners = "/home/vildan/IdeaProjects/attestation/toy_store/winners.json";
    private boolean flag = true;

    public void programMenu() {

        Scanner scan = new Scanner(System.in);

        while (flag) {
            System.out.println("////////////////////////////////////////////////////////////");
            System.out.print("""
                    Menu:
                    1 - Создание рандомных игрушек и запись в базу данных
                    2 - Вывести список игрушек из базы данных
                    3 - Проведение розыгрыша и добавление выйгранной игрушки в список
                    4 - Вывести список выйгранных игрушек
                    5 - Выдача игрушки из списка выйгранных
                    0 - Exit
                    """);
            System.out.println("////////////////////////////////////////////////////////////");
            String number = scan.nextLine();
            switch (number) {
                case "1" -> {
                    CreateToysList l = new CreateToysList(10);
                    ArrayList<Toy> toyList = l.getToysList();
                    WriteToJson.write(toyList, path);
                }
                case "2" -> {
                    ArrayList<Toy> toyList = ReadFromJson.read(path);
                    for (Toy t : toyList) {
                        System.out.println(t.toyInfo());
                    }
                }
                case "3" -> {
                    ArrayList<Toy> toyList = ReadFromJson.read(path);
                    ArrayList<Toy> winList = ReadFromJson.read(winners);
                    LotteryDraw ld = new LotteryDraw(toyList, winList);
                    ld.draw();
                    WriteToJson.write(ld.getWinner(), winners);
                    WriteToJson.write(ld.getToys(), path);
                }
                case "4" -> {
                    ArrayList<Toy> toyList = ReadFromJson.read(winners);
                    for (Toy t : toyList) {
                        System.out.println(t.toyInfo());
                    }
                }
                case "5" -> {
                    ArrayList<Toy> toyList = ReadFromJson.read(winners);
                    EditJson edit = new EditJson(toyList);
                    Toy toy = edit.getToy();
                    WriteToJson.write(edit.getToys(), winners);
                }
                case "0" -> {
                    flag = false;
                }
                default -> {
                    System.out.println("Error");
                }
            }
        }
    }
}
