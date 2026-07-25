import org.junit.jupiter.api.Test;

import static org.example.util.StringUtil.reverseLetter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseLetter {

    //Обычный случай
    @Test
    void сommonСase() {
        String input = "J@va the be$t!123";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "t@eb eht av$J!123";

        assertEquals(expected, result);
    }
    //Пустая строка
    @Test
    void emptyString() {
        String input = "";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "";

        assertEquals(expected, result);
    }
    //Одна буква
    @Test
    void oneLetter() {
        String input = "a";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "a";

        assertEquals(expected, result);
    }
    //Строка без букв
    @Test
    void stringWithoutLetters() {
        String input = "123 !@#";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "123 !@#";

        assertEquals(expected, result);
    }
    //Только буквы
    @Test
    void onlyLetters() {
        String input = "abcd";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "dcba";

        assertEquals(expected, result);
    }
    //Небуквенные символы по краям и в середине
    @Test
    void nonLetterCharactersAroundTheEdgesAndInTheMiddle() {
        String input = "!@6J@va the&&9 beZt!123*";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "!@6t@Ze beh&&9 tavJ!123*";

        assertEquals(expected, result);
    }
    //Регистр
    @Test
    void registr() {
        String input = "J@VA the BE$T!123";
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "T@EB eht AV$J!123";

        assertEquals(expected, result);
    }
    //Null
    @Test
    void testNull() {
        String input = null;
        // Вызываем статический метод через класс StringUtil
        String result = reverseLetter(input);

        // Вставь сюда ожидаемую строку (то, что должен вернуть твой метод)
        String expected = "";

        assertEquals(expected, result);
    }

}