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
        do{
            System.out.print("Выберите номер функции: \n");
            System.out.println("0. Вывод из программы");
            System.out.println("1. Вывести количество символов");
            System.out.println("2. Вывести количество слов");
            System.out.println("3. Найти слово в строке");
            System.out.println("4. Заменить указаное слово в строке");
            int number = scanner.nextInt();
            if(number == 0){
                break;
            }else if(number == 1){
                System.out.print("Вы выбрали номер: " + number + "\n");
                System.out.println("Количество символов:" +str.length());
            }else if(number == 2){
                System.out.print("Вы выбрали номер: " + number + "\n");
                String[] words = str.split(" ");
                System.out.println("Количество слов: "+ words.length);
            }else if(number == 3){
                System.out.print("Вы выбрали номер: " + number + "\n");
                break;
                
            }else if(number == 4){
                System.out.print("Вы выбрали номер: " + number + "\n");
                break;
                
            }
        }while(true);


        

        
    }
    
}
