package org.example;

public class Main {
    static void main() {
    //Задание на разворот строки
//        Input:  J@va the be$t!123
//        Output: t@eb eht av$J!123
        //Объявдяем стартовую строку
        String letterInput = "J@va the be$t!123";
        //Объявляем финишную строку
        String letterOutput;
        //Объявляем масстив char и сразу вносим стартовую строку
        char [] chars = letterInput.toCharArray();
        int left = 0;
        int right = letterInput.length()-1;

        while (left < right) {
            //Проверяем левый символ. Если не буква сразу двигаем каретку влево
            if (!(Character.isLetter(chars[left]))) {
                left++;
                //Иначе проверяем что правый символ тоже является буквой
            } else if (Character.isLetter(chars[right])) {
                char tmp = chars[left];     // меняем местами края
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;                     //и двигаем левую каретку

            }
            right--;            // в любом случае двигаем правую каретку
        }
            System.out.println(chars);
        }




    }

