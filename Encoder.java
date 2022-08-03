public class Encoder {
        static int key = 0;
        static String russianAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        static String englishAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        static String symbols = "\r\n.?!,;: -()\"";
        static String numbers = "1234567890";
        static String CryptoAlphabet = russianAlphabet + englishAlphabet + symbols + numbers;
        static char[] chars = symbols.toCharArray();

    }

}
