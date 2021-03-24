package com.company;

import javax.print.DocFlavor;
import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //создали списки
        ArrayList<String> spisok1 = new ArrayList<>();
        ArrayList<String> spisok2 = new ArrayList<>();
        ArrayList<String> spisok3 = new ArrayList<>();
        //создали сканер для ввода
        Scanner scanner= new Scanner(System.in);
        String enter;
        //пока размер списка1 меньше 5 то {
       while(spisok1.size()<5){
           System.out.println("вВЕДИТЕ ДАННЫЕ для 1 списка");
           //вызываем ввод
           enter = scanner.nextLine();
           //список1 добавилли ввод
           spisok1.add(enter);
       }
       //пока размер списка2 меньше 5 то {
       while (spisok2.size()<5){
           System.out.println("введите данные для 2 списка");
           //вызываем ввод
           enter = scanner.nextLine();
           //список2 добавили ввод
           spisok2.add(enter);
       }
        System.out.println("1 spisok: " + spisok1 );
        System.out.println("2 spisok: " + spisok2 );
        //перевернули список
        Collections.reverse(spisok2);
       int i =0;
       //пока размер списка3 меньше 10 то
       while (spisok3.size()<10){
           //список3 добавляет (элемент из списка1)
           spisok3.add(spisok1.get(i));
           //список3 добывляет (элемент из списка2)
           spisok3.add(spisok2.get(i));
           //прибовляет по 1
           i++;
        }
        System.out.println("3 spisok: " + spisok3);
       //отсортировали ро каличеству элементов
       Collections.sort(spisok3, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return o1.length() - o2.length();
           }
       });
        System.out.println(spisok3 +"отсортированный 3 spisok");




    }
}
