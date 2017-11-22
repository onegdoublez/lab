package com.lab.blood;

/**
 * Created by User on 022 22.11.17.
 */
import java.util.Scanner;

public class ExcersiceTwoTwo {

    public static void main(String[] args) {
        //Инициализируем строку алфавитом
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        //String alphabet =("abcdefghijklmnopqrstuvwxyz");

        //Вводим свой текст
        String str1 = "";
        System.out.println("Введите текст");
        Scanner sc1 = new Scanner(System.in);
        str1 = sc1.nextLine();

        //Преобразуем строку в массив char'ов
        char[] charArray = str1.toCharArray();

        //Выводим в консоль введенные символы с двумя пробелами
        for(int i = 0; i < str1.length(); i++){
            System.out.print(charArray[i] + "  ");
        }
        System.out.println("");

        //Выводим в консоль номер позиции буквы в алфавите
        for (char x : charArray){
            //Игнорируем символ пробела в веденном тексте
            if(x == ' '){
                System.out.print("");
            } else {
                int i = alphabet.lastIndexOf(x);
                i+=1;
                System.out.print(i + "  ");
            }
        }
    }
}