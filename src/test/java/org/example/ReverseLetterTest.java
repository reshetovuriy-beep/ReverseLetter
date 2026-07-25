package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.example.util.StringUtil.reverseLetter;


class ReverseLetterTest {

    //Обычный случай
    @Test
    void reverseLetter_commonСase() {
        String input = "J@va the be$t!123";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "t@eb eht av$J!123";

        Assertions.assertEquals(expected, result);
    }
    //Пустая строка
    @Test
    void reverseLetter_emptyString() {
        String input = "";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "";

        Assertions.assertEquals(expected, result);
    }
    //Одна буква
    @Test
    void reverseLetter_oneLetter() {
        String input = "a";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "a";

        Assertions.assertEquals(expected, result);
    }
    //Строка без букв
    @Test
    void reverseLetter_stringWithoutLetters() {
        String input = "123 !@#";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "123 !@#";

        Assertions.assertEquals(expected, result);
    }
    //Только буквы
    @Test
    void reverseLetter_onlyLetters() {
        String input = "abcd";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "dcba";

        Assertions.assertEquals(expected, result);
    }
    //Небуквенные символы по краям и в середине
    @Test
    void reverseLetter_nonLetterCharactersAroundTheEdgesAndInTheMiddle() {
        String input = "!@6J@va the&&9 beZt!123*";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "!@6t@Ze beh&&9 tavJ!123*";

        Assertions.assertEquals(expected, result);
    }
    //Регистр
    @Test
    void reverseLetter_registr() {
        String input = "J@VA the BE$T!123";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "T@EB eht AV$J!123";

        Assertions.assertEquals(expected, result);
    }
    //Null
    @Test
    void reverseLetter_testNull() {
        String input = null;
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "";

        Assertions.assertEquals(expected, result);
    }

}