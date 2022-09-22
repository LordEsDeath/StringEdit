/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringedit;

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
                    break OUTER;
                case 1:
                    System.out.println("Вы выбрали пункт "+number);
                    System.out.println("Количество символов: "+str.length());
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
                    System.out.println("Введите заменяемую строку: ");
                    String removeStirng = scanner.nextLine();
                    String newStr;
                    int index = str.indexOf(removeStirng);
                    if(index < 0 ){
                        System.out.println("Такой строки в тексте нет");
                    }else{
                        System.out.println("На какую строку заменить: ");
                        newStr = scanner.nextLine();
                        System.out.println("Измененная строка выглядит так: ");
                        System.out.println(str.replace(removeStirng, newStr));
                    }
            
                    break;
                default:
                    break;
            }
            System.out.println("+++++++++++++++++++++++++++");
        } while (true);
        System.out.println("Пока!");
    }
}