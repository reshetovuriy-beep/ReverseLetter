package org.example.util;

public class StringUtil {

    public static String reverseLetter (String letterInput) {

        //Объявляем массив char и вносим стартовую строку после проверки на null
        char[] chars;
        //Добавил проверку, что исходная строка не null
        if (letterInput != null) {
            chars = letterInput.toCharArray();
        } else {
            System.out.println("Исходная строка null, заполните исходную строку каким-то значением!");
            return "";
        }

        int left = 0;
        int right = letterInput.length() - 1;

        while (left < right) {
            //Проверяем левый символ. Если не буква сразу двигаем каретку влево
            if (!(Character.isLetter(chars[left]))) {
                left++;
                //Иначе проверяем что правый символ тоже является буквой
            } else if (Character.isLetter(chars[right])) {
                char tmp = chars[left];     // меняем местами края
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;                     //и двигаем обе каретки
                right--;
            }
            //Проверяем правый символ. Если не буква - двигаем каретку вправо
            if (!(Character.isLetter(chars[right]))) {
                right--;
            }
        }
        return new String(chars);
    }
}
