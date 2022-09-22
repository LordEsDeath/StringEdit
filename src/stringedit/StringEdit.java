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
        System.out.println("==== StringEdit ====");
        System.out.println("=====================");
        System.out.println("Введите текст (Латиницей): ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int numberFunction;
        int repeat = 1;
         switch (numberFunction) {
                case 0:
                    System.out.println("Ну ладно!");
                    repeat = 0;
                    break;
                case 1:
                    System.out.println("Вы выбрали функцию \"1. Количество символов в тексте");
                    char[] strChar = str.toCharArray();
                    System.out.println("Посчитано: "+strChar.length+ " символов.");
                    break;
                case 2:
                    System.out.println("Вы выбрали функцию: \"2. Количество слов в тексте");
                    String[] wordArray = str.split(" ");
                    System.out.println("Посчитано: "+wordArray.length+ " слов.");
                    break;
                case 3:
                    System.out.println("Вы выбрали функцию \n3. Находит указанную подстроку в тексте");
                    System.out.println("Введите подстроку для поиска: ");
                    String subStr = scanner.nextLine();
                    int indexSubStr = str.indexOf(subStr);
                    if(indexSubStr < 0) {
                        System.out.println("Такой подстроки в строке нет");
                    }else{
                        indexSubStr++;
                        System.out.println("Подстрока находится на "+indexSubStr +" позиции в строке");
                    }
                    break;
                case 4:
                    System.out.println("Вы выбрали функцию \"4. Заменяет указанную подстроку на другую подстроку.");
                    System.out.println("Введите подстроку которую надо заменить: ");
                    subStr = scanner.nextLine();
                    indexSubStr = str.indexOf(subStr);
                    if(indexSubStr < 0){
                        System.out.println("Такой подстроки в строке нет");
                    }else{
                        System.out.println("Введите строку замены: ");
                        String replaceStr = scanner.nextLine();
                        System.out.println("Результат замены: "+str.replace(subStr, replaceStr));
                    }
                    break;
                default:
                    break;
            }
            System.out.println("------------------------------");
            if(repeat == 0) break;
        } while (true);
}