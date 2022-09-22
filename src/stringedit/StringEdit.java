/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringedit;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class StringEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----- Строки в Java -----");
        System.out.println("Введите текст (латиницей): ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        do {
            System.out.println("Функции программы:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Вывести количество символов");
            System.out.println("2. Вывести количество слов");
            System.out.println("3. Найти слово в строке");
            System.out.println("4. Заменить указанное слово в строке");
            System.out.print("Выберите номер функции: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 0:
                    break;
                case 1:
                    System.out.println("Вы выбрали пункт "+number);
                    int count=0;
                    char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','w','x','y','z'};
                    HashSet set = new HashSet();
                    for (int i = 0; i < chars.length; i++) {
                        set.add(chars[i]);
                    }
                    String strInLowerCase = str.toLowerCase();
                    for (int i = 0; i < strInLowerCase.length(); i++) {
                        if(set.contains(strInLowerCase.charAt(i))) count++;
                    }
                    System.out.println("Количество символов: "+count);
                    break;
                case 2:
                    System.out.println("Вы выбрали пункт "+number);
                    String[] words = str.split(" ");
                    System.out.println("Количество слов: "+ words.length);
                    break;
                case 3:
                    System.out.println("Вы выбрали пункт "+number);
                    System.out.println("Какое слово найти: ");
                    String subStr = scanner.nextLine();
                    int index = str.indexOf(subStr);
                    if(index < 0){
                        System.out.println("Такого слова нет в строке");
                    }else{
                        index++;
                        System.out.println("Указанное слово находится на "+index+" позиции");
                    }   break;
                case 4:
                    System.out.println("Вы выбрали пункт "+number);
                    System.out.println("Введите слово которое хотите заменить: ");
                    String remove = scanner.nextLine();
                    String newStr;
                    index = str.indexOf(remove);
                    if(index < 0 ){
                        System.out.println("Такого слово в тексте нет");
                    }else{
                        System.out.println("На какое слово заменим же: ");
                        newStr = scanner.nextLine();
                        System.out.println("Измененная слов выглядит так: ");
                        System.out.println(str.replace(remove, newStr));
                    }
                    break;
                default:
                    break;
            }
            System.out.println("--------------------------------------");
        } while (true);

    }
}