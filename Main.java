import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        /*
        Вычислите и выведите объем шара, прочитав его радиус r с консоли.
        Примечание: считать по формуле V  =  4/3 * 3.14 * r^3
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1/9 РАСЧЕТ ОБЬЕМА ШАРА \n");
//        System.out.print("Введите радиус шара \n r = ");
//        int r = scanner.nextInt();
//        double v = (4 / 3.) * Math.PI * Math.pow(r, 3);
//        System.out.println("Убьем шара равен \n V = " + v + "\n\n");

        /*
        На вход подается два целых числа – a и b.
        Вычислите и выведите среднее квадратическое a и b.
         */
//        System.out.println("2/9 РАСЧЕТ СРЕДНЕГО КВАДРАТИЧЕСКОГО ДВУХ ЧИСЕЛ\n");
//        System.out.println("Введите два числа \n");
//        System.out.print("a = ");
//        int a = scanner.nextInt();
//        System.out.print("\nb = ");
//        int b = scanner.nextInt();
//        double rootMeanSquare = Math.sqrt((a * a + b * b) / 2);
//        System.out.println("\nСреднеквадратичное этих чисел равно\n\nXrms = " + rootMeanSquare + "\n\n");

        /*
        Прочитайте из консоли имя пользователя и выведите в консоль строку
        Привет, <имя пользователя>!
         */

//        System.out.println("3/9 Вывод: Привет, <имя пользователя>!\n\n");
//        System.out.println("Введите имя: \n");
//        String name = scanner.nextLine();
//        System.out.println("Привет, " + name + "!");

        /*
        На вход подается количество секунд, прошедших с начала текущего дня – count.
        Выведите в консоль текущее время в формате: часы и минуты.
         */

//        int seconds = scanner.nextInt();
//        int hours = seconds/3600;
//        int minutes = (seconds-hours*3600)/60;
//        System.out.println(hours + " " + minutes);

        /*
        Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров).
        На вход подается количество дюймов, выведите количество сантиметров.
         */
//        double inch = scanner.nextDouble();
//        double centimeter = inch*2.54;
//        System.out.println(centimeter);

        /*
        На вход подается количеств миль – count.
        Переведите мили в километры (1 миля = 1,60934 км) и выведите количество километров.
         */
//        double miles = scanner.nextDouble();
//        double kilometers = miles*1.60934;
//        System.out.println(kilometers);

        /*
        На вход подается двузначное число n.
        Выведите число, полученное перестановкой цифр в исходном числе n.
         */

//        int n = scanner.nextInt();
//        System.out.println(new DecimalFormat( "00" ).format(n%10*10 + n/10));

        /*
        На вход подается баланс счета в банке – n.
        Рассчитайте дневной бюджет на 30 дней.
         */

//        double n = scanner.nextDouble();
//        double budget = n / 30;
//        System.out.println(budget);

        /*
        На вход подается бюджет мероприятия – n тугриков.
        Бюджет на одного гостя – k тугриков.
        Вычислите и выведите, сколько гостей можно пригласить на мероприятие.
         */

//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        System.out.println("Можно пригласить " + n/k + " гостей");

        /*              ДЗ 1 Часть 2
        1. (1 балл) За каждый год работы Петя получает на ревью оценку. На вход
        подаются оценки Пети за последние три года (три целых положительных числа).
        Если последовательность оценок строго монотонно убывает, то вывести "Петя,
        пора трудиться"
        В остальных случаях вывести "Петя молодец!"
         */
        /*
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b && b > c)
            System.out.println("Петя, пора трудиться");
        else
            System.out.println("Петя молодец!");
        */
        /*
        2. (1 балл) Петя пришел домой и помогает дочке решать математику. Ей нужно
        определить, принадлежит ли точка с указанными координатами первому
        квадранту. Недолго думая, Петя решил автоматизировать процесс и написать
        программу: на вход нужно принимать два целых числа (координаты точки),
        выводить true, когда точка попала в квадрант и false иначе.
        Но сначала Петя вспомнил, что точка лежит в первом квадранте тогда, когда её
        координаты удовлетворяют условию: x >= 0 и y >= 0
         */

        /*

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println(x>=0 && y>=0);

        */

        /*
        3. (1 балл) Петя снова пошел на работу. С сегодняшнего дня он решил ходить на
        обед строго после полудня. Периодически он посматривает на часы (x - час,
        который он увидел). Помогите Пете решить, пора ли ему на обед или нет. Если
        время больше полудня, то вывести "Пора". Иначе - “Рано” На вход
        гарантируется передача числа от 0 до 23 включительно.
         */

        /*

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if (x > 12)
            System.out.println("Пора");
        else
            System.out.println("Рано");

         */

        /*
        4. (1 балл) После вкусного обеда Петя принимается за подсчет дней до выходных.
        Календаря под рукой не оказалось, а если спросить у коллеги Феди, то тот
        называет только порядковый номер дня недели, что не очень удобно. Поэтому
        Петя решил написать программу, которая по порядковому номеру дня недели
        выводит сколько осталось дней до субботы. А если же сегодня шестой
        (суббота) или седьмой (воскресенье) день, то программа выводит "Ура,
        выходные!"

         */

        /*

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if (x > 5)
            System.out.println("Ура, выходные!");
        else
            System.out.println(6 - x);

         */

        /*
        5. (1 балл) Дома дочери Пети опять нужна помощь с математикой! В этот раз ей
        нужно проверить, имеет ли предложенное квадратное уравнение решение или
        нет.
         */

        /*

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (b * b - 4 * a * c > 0)
            System.out.println("Решение есть");
        else
            System.out.println("Решения нет");

         */

        /*
        6. (1 балл) На следующий день на работе Петю и его коллег попросили заполнить
        анкету. Один из вопросов был про уровень владения английского. Петя и его
        коллеги примерно представляют, сколько они знают иностранных слов. Также у
        них есть табличка перевода количества слов в уровень владения английском
        языком. Было бы здорово автоматизировать этот перевод!
        На вход подается положительное целое число count - количество выученных
        иностранных слов. Нужно вывести какому уровню соответствует это количество
         */

        /*

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        if (count >= 3500)
            System.out.println("fluent");
        else if (count >= 2500)
            System.out.println("upper-intermediate");
        else if (count >= 1500)
            System.out.println("intermediate");
        else if (count >= 500)
            System.out.println("pre-intermediate");
        else
            System.out.println("beginner");

         */

        /*
        7. (1 балл) Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
        Ему хочется уметь разделять строку по первому пробелу. Для этого он может
        воспользоваться методами indexOf() и substring().
        На вход подается строка. Нужно вывести две строки, полученные из входной
        разделением по первому пробелу.

         */

        /*


        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(str);

        str = input.nextLine();

        System.out.println(str.substring(1));

         */

        /*
        8. (1 балл) Раз так легко получается разделять по первому пробелу, Петя решил
        немного изменить предыдущую программу и теперь разделять строку по
        последнему пробелу.
         */
        /*

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(str.substring(0, str.lastIndexOf(" ")) + "\n" + str.substring(str.lastIndexOf(" ") + 1));

         */

        /*
        9. (1 балл) Пока Петя практиковался в работе со строками, к нему подбежала его
        дочь и спросила: "А правда ли, что тригонометрическое тождество (sin^2(x)+
        cos^2(x) - 1 == 0) всегда-всегда выполняется?"
        Напишите программу, которая проверяет, что при любом x на входе
        тригонометрическое тождество будет выполняться (то есть будет выводить true
        при любом x).
         */

        /*

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        System.out.println(Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2) - 1 == 0);

         */

        /*
        10. (1 балл) "А логарифмическое?" - не унималась дочь.
        Напишите программу, которая проверяет, что log(e^n) == n для любого
        вещественного n.
         */

        /*

        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();

        System.out.println(Math.log(Math.pow(Math.E, n)) == n);


         */

        /*
        11. (1 балл) Разобравшись со своими (и не только) задачками, Петя уже собирался
        лечь спать и отдохнуть перед очередным тяжелым рабочим днем, но вдруг в
        тишине раздается детский шепот: "Паааапааа, мы забыли решить ещё одну
        задачку! Давай проверим, можно ли из трех сторон составить треугольник?".
        Что ж, придется написать еще одну программу, связанную со школьной
        математикой.
        На вход подается три целых положительных числа – длины сторон
        треугольника. Нужно вывести true, если можно составить треугольник из этих
        сторон и false иначе.
         */

        /*

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println(a < b + c && b < a + c && c < a + b);

         */

        /*
        Дополнительные задачи
        1. (2 балла) У Марата был взломан пароль. Он решил написать программу,
        которая проверяет его пароль на сложность. В интернете он узнал, что пароль
        должен отвечать следующим требованиям:
        ● пароль должен состоять из хотя бы 8 символов;
        ● в пароле должны быть:
            ○ заглавные буквы
            ○ строчные символы
            ○ числа
            ○ специальные знаки(_*-)
        Если пароль прошел проверку, то программа должна вывести в консоль строку
        идеально! :D, иначе строку: пароль не прошел проверку(

         */

        /*

        Scanner input = new Scanner(System.in);
        String str = input.next();


        if (   (((int) str.charAt(0) >= 48 && (int) str.charAt(0) <= 57) ||
                ((int) str.charAt(1) >= 48 && (int) str.charAt(1) <= 57) ||
                ((int) str.charAt(2) >= 48 && (int) str.charAt(2) <= 57) ||
                ((int) str.charAt(3) >= 48 && (int) str.charAt(3) <= 57) ||
                ((int) str.charAt(4) >= 48 && (int) str.charAt(4) <= 57) ||
                ((int) str.charAt(5) >= 48 && (int) str.charAt(5) <= 57) ||
                ((int) str.charAt(6) >= 48 && (int) str.charAt(6) <= 57) ||
                ((int) str.charAt(7) >= 48 && (int) str.charAt(7) <= 57)) &&
                (((int) str.charAt(0) >= 65 && (int) str.charAt(0) <= 90) ||
                ((int) str.charAt(1) >= 65 && (int) str.charAt(1) <= 90) ||
                ((int) str.charAt(2) >= 65 && (int) str.charAt(2) <= 90) ||
                ((int) str.charAt(3) >= 65 && (int) str.charAt(3) <= 90) ||
                ((int) str.charAt(4) >= 65 && (int) str.charAt(4) <= 90) ||
                ((int) str.charAt(5) >= 65 && (int) str.charAt(5) <= 90) ||
                ((int) str.charAt(6) >= 65 && (int) str.charAt(6) <= 90) ||
                ((int) str.charAt(7) >= 56 && (int) str.charAt(7) <= 90)) &&
                (((int) str.charAt(0) >= 97 && (int) str.charAt(0) <= 122) ||
                ((int) str.charAt(1) >= 97 && (int) str.charAt(1) <= 122) ||
                ((int) str.charAt(2) >= 97 && (int) str.charAt(2) <= 122) ||
                ((int) str.charAt(3) >= 97 && (int) str.charAt(3) <= 122) ||
                ((int) str.charAt(4) >= 97 && (int) str.charAt(4) <= 122) ||
                ((int) str.charAt(5) >= 97 && (int) str.charAt(5) <= 122) ||
                ((int) str.charAt(6) >= 97 && (int) str.charAt(6) <= 122) ||
                ((int) str.charAt(7) >= 97 && (int) str.charAt(7) <= 122)) &&
                ((int) str.charAt(0) == 42 || (int) str.charAt(0) == 45 || (int) str.charAt(0) == 95 ||
                (int) str.charAt(1) == 42 || (int) str.charAt(1) == 45 || (int) str.charAt(1) == 95 ||
                (int) str.charAt(2) == 42 || (int) str.charAt(2) == 45 || (int) str.charAt(2) == 95 ||
                (int) str.charAt(3) == 42 || (int) str.charAt(3) == 45 || (int) str.charAt(3) == 95 ||
                (int) str.charAt(4) == 42 || (int) str.charAt(4) == 45 || (int) str.charAt(4) == 95 ||
                (int) str.charAt(5) == 42 || (int) str.charAt(5) == 45 || (int) str.charAt(5) == 95 ||
                (int) str.charAt(6) == 42 || (int) str.charAt(6) == 45 || (int) str.charAt(6) == 95 ||
                (int) str.charAt(7) == 42 || (int) str.charAt(7) == 45 || (int) str.charAt(7) == 95))

            System.out.println("пароль надежный");
        else
            System.out.println("пароль не прошел проверку(");

         */

        /*
        (2 балла) У нас есть почтовая посылка (String mailPackage). Каждая почтовая
        посылка проходит через руки проверяющего. Работа проверяющего
        заключается в следующем:
            ●, во-первых, посмотреть не пустая ли посылка;
            ●, во-вторых, проверить нет ли в ней камней или запрещенной продукции.
        Наличие камней или запрещенной продукции указывается в самой посылке в конце
        или в начале. Если в посылке есть камни, то будет написано слово "камни!", если
        запрещенная продукция, то будет фраза "запрещенная продукция".
        После осмотра посылки проверяющий должен сказать:
            ● "камни в посылке" – если в посылке есть камни;
            ● "в посылке запрещенная продукция" – если в посылке есть что-то запрещенное;
            ● "в посылке камни и запрещенная продукция" – если в посылке находятся камни
                и запрещенная продукция;
            ● "все ок" – если с посылкой все хорошо.
            Если посылка пустая, то с посылкой все хорошо.
            Напишите программу, которая будет заменять проверяющего.
         */

        /*

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        if ((str.contains("запрещенная продукция")) && str.contains("камни"))
            System.out.println("в посылке камни и запрещенная продукция");
        else if (str.contains("камни"))
            System.out.println("камни в посылке");
        else if (str.contains("запрещенная продукция"))
            System.out.println("в посылке запрещенная продукция");
        else
            System.out.println("все ок");


         */

        /*
        3. (2 балла) Старый телефон Андрея сломался, поэтому он решил приобрести
        новый. Продавец телефонов предлагает разные варианты, но Андрея
        интересуют только модели серии samsung или iphone. Также Андрей решил
        рассматривать телефоны только от 50000 до 120000 рублей. Чтобы не тратить
        время на разговоры, Андрей хочет написать программу, которая поможет ему
        сделать выбор.
        На вход подается строка – модель телефона и число – стоимость телефона.
        Нужно вывести "Можно купить", если модель содержит слово samsung или
        iphone и стоимость от 50000 до 120000 рублей включительно. Иначе вывести
        "Не подходит".
        Гарантируется, что в модели телефона не указано одновременно несколько
        серий.

         */

        /*

        Scanner input = new Scanner(System.in);
        String modelphone = input.nextLine();
        int phonePrice = input.nextInt();

        if ((modelphone.contains("samsung") || modelphone.contains("iphone")) &&
                (phonePrice <= 120000 && phonePrice >= 50000))
            System.out.println("Можно купить");
        else
            System.out.println("Не подходит");


         */

        int[] source = {3,4,5};
        int[] target = new int[source.length];

        System.arraycopy(source,0,target,0,source.length);




    }
}