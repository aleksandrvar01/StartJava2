import java.math.*;
public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte core = 4;
        short rum = 8;
        int mhz = 3500;
        long assemblyVersion = 19041;
        float smbios = 3.2f;
        double contVersion = 255.255d;
        char aType = 'X';
        boolean isTrue = true; 
        System.out.println("core = " + core + "\nrum = " + rum + "\nmhz = " + mhz
                + "\nassemblyVersion = " + assemblyVersion + "\nsmbios = " + smbios
                + "\neСontVersion = " + contVersion + "\naType = " + aType
                + "\nisTrue = " + isTrue + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        //Расчет стоимости товара со скидкой
        double pricePen = 105.5d;
        double priceBook = 235.83d;
        double discount = 0.11d;
        double totalCost = Math.round((pricePen + priceBook) * 100.0) / 100.0;
        double sumDiscount = Math.round((totalCost * discount) * 100.0) / 100.0;
        double totalCostDiscount = Math.round((totalCost - sumDiscount) * 100.0) / 100.0;
        System.out.println("Общая сумма товаров = " + totalCost + " руб."
                + "\nСумма скидки = " + sumDiscount + " руб."
                + "\nОбщая стоимость товара со скидкой = "
                + totalCostDiscount + " руб.\n");

        /*System.out.println("Bторой вариант решения задачи с помощью BigDecimal");
        //Расчет стоимости товара со скидкой
        BigDecimal pricePen = new BigDecimal("105.5");
        BigDecimal priceBook = new BigDecimal("235.83");
        BigDecimal discount = new BigDecimal("0.11");
        BigDecimal totalCost = pricePen.add(priceBook);
        BigDecimal sumDiscount = totalCost.multiply(discount).setScale(2, RoundingMode.UP);;
        BigDecimal totalCostDiscount = totalCost.subtract(sumDiscount).setScale(2, RoundingMode.UP);
        System.out.println("Общая сумма товаров = " + totalCost + " руб."
                + "\nСумма скидки = " + sumDiscount + " руб."
                + "\nОбщая стоимость товара со скидкой = "
                + totalCostDiscount + " руб.\n");*/

        /*System.out.println("Третий вариант решения задачи с помощью форматирования вывода)
        float pricePen = 105.5f;
        float priceBook = 235.83f;
        float discount = 0.11f;
        float totalCost = pricePen + priceBook;
        float sumDiscount =totalCost * discount;
        float totalCostDiscount =(totalCost - sumDiscount);
        System.out.printf("Общая сумма товаров = " + "%.2f \n", totalCost);
        System.out.printf("Сумма скидки = " + "%.2f \n", sumDiscount);
        System.out.printf("Общая стоимость товара со скидкой = " + "%.2f \n", totalCostDiscount);*/

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;
        char num5 = 65535;
        System.out.println("byte " + num1 + "\nmax " + (num1++) + "\nmin " + (num1--) + "\n");
        System.out.println("short " + num2 + "\nmax " + (num2++) + "\nmin " + (num2--) + "\n");
        System.out.println("int " + num3 + "\nmax " + (num3++) + "\nmin " + (num3--) + "\n");
        System.out.println("long " + num4 + "\nmax " + (num4++) + "\nmin " + (num4--) + "\n");
        System.out.println("char " + (int) num5 + "\nmax " + (int) (num5++) + "\nmin " 
                + (int) (num5--) + "\n");

        System.out.println("5. Перестановка значений переменных");
        int digit1 = 2;
        int digit2 = 5;
        int digit3 = digit1;
        System.out.println("Перестановка с помощью третьей переменной \ndigit1 = "
                + digit1 + "\ndigit2 = " + digit2 + "\n");
        
        //с помощью третьей переменной
        digit1 = digit2;
        digit2 = digit3;
        System.out.println("digit1 = " + digit1 + "\ndigit2 = " + digit2 + "\n");

        //с помощью арифметических операций
        digit1 = digit1 - digit2;
        digit2 = digit1 + digit2;
        digit1 = digit2 - digit1;
        System.out.println("Перестановка с помощью арифметических операций \ndigit1 = "
                + digit1  + "\ndigit2 = " + digit2 + "\n");
        
        //с помощью побитовой операции ^
        digit1 ^= digit2;
        digit2 ^= digit1;
        digit1 ^= digit2;
        System.out.println("Перестановка с помощью побитовой операции ^ \ndigit1 = "
                + digit1 + "\ndigit2 = " + digit2 + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char symbol1 = '$';
        char symbol2 = '*';
        char symbol3 = '@';
        char symbol4 = '|';
        char symbol5 = '~';
        int symbolNum1 = symbol1;
        int symbolNum2 = symbol2;
        int symbolNum3 = symbol3;
        int symbolNum4 = symbol4;
        int symbolNum5 = symbol5;

        System.out.println(symbolNum1 + " " + symbol1 + "\n" + symbolNum2 + " "
                + symbol2 + "\n" + symbolNum3 + " " + symbol3 + "\n" + symbolNum4
                + " " + symbol4 + "\n" + symbolNum5 + " " + symbol5 + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char a = '/';
        char b = '\\';
        char c = ')';
        char d = '(';
        char e = '_';
        System.out.println("          " + a + b);
        System.out.println("         " + a + "  " + b);
        System.out.println("        " + a + e + d + " " + c + b);
        System.out.println("       " + a + "      " + b);
        System.out.println("      " + a + e + e + e + e + a + b + e + e + b + "\n");

        System.out.println("8.Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int ones = num % 10;
        int tens = num % 100 / 10;
        int hundreds = num / 100;
        int sum = ones + tens + hundreds;
        int multiplication = ones * tens * hundreds;
        System.out.println("Число 123 содержит: " + "\nсотен - " + hundreds
                + "\nдесятков - " + tens + "\nединиц - " + ones + "\nСумма его цифр = "
                + sum + "\nПроизведение его цифр = " + multiplication + "\n");

        System.out.println("9. Вывод времени");
        int totalSeconds = 86399;
        int hours = (totalSeconds - totalSeconds % 3600) / 3600;
        int minutes = (totalSeconds % 3600 - totalSeconds % 3600 % 60) / 60;
        int seconds = totalSeconds % 3600 % 60;;
        System.out.println(hours +  ":" + minutes + ":" + seconds + "\n");
    }
}