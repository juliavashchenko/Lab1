
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;


public class NumberOperations {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20.5);
        numbers.add(30);
        numbers.add(40.7);
        numbers.add(50);
        numbers.add(60.3);
        numbers.add(70);
        numbers.add(80.1);
        numbers.add(90);
        numbers.add(100.9);

        int i = 20;
        long l = 234;
        float f = 453.00f;
        double d = 24.2;
        BigDecimal bigDecimal = new BigDecimal("424343322422.345453");
        BigInteger bigInteger = new BigInteger("2325465768797");

        numbers.add(i);
        numbers.add(l);
        numbers.add(f);
        numbers.add(d);
        numbers.add(bigDecimal);
        numbers.add(bigInteger);

        System.out.println("Список усіх чисел: " + numbers);

        System.out.print("Список у форматі BigDecimal: [");

        for (Number number : numbers) {
                System.out.println(new BigDecimal(String.valueOf(number)));
        }

        System.out.print("Список у форматі цілих чисел: [");

        for (Number number : numbers) {
            if (!String.valueOf(number).contains("."))
                System.out.print(number + " ");
            else if (number.getClass() == BigDecimal.class)
                System.out.print(new BigDecimal(String.valueOf(number)).setScale(0, RoundingMode.HALF_DOWN)+ " ");
            else
                System.out.print(Math.round(number.doubleValue()) + " ");
        }



        System.out.println("]");

        System.out.print("Список у форматі дробових чисел: [");

        for (Number number : numbers)
            System.out.print(new BigDecimal(String.valueOf(number)).setScale(2, RoundingMode.HALF_DOWN)+" ");
        System.out.println("]");

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Long> longs = new ArrayList<>();
        ArrayList<Float> floats = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        ArrayList<BigDecimal> bigDecimals = new ArrayList<>();
        ArrayList<BigInteger> bigIntegers = new ArrayList<>();


        for (Number number : numbers) {
            if (number instanceof Integer) {
                integers.add(number.intValue());
            } else if (number instanceof Long) {
                longs.add(number.longValue());
            } else if (number instanceof Float) {
                floats.add(number.floatValue());
            } else if (number instanceof Double) {
                doubles.add(number.doubleValue());
            } else if (number instanceof BigDecimal) {
                bigDecimals.add(new BigDecimal(String.valueOf(number)));
            } else if (number instanceof BigInteger) {
                bigIntegers.add(new BigInteger(String.valueOf(number)));
            }
        }

        System.out.println("Integers: " + integers);
        System.out.println("Longs: " + longs);
        System.out.println("Floats: " + floats);
        System.out.println("Doubles: " + doubles);
        System.out.println("BigDecimals: " + bigDecimals);
        System.out.println("BigIntegers: " + bigIntegers);

        ArrayList<Number> WholeNumbers = new ArrayList<>();

        for (Number number : numbers)
        {
            if (number.getClass() == BigDecimal.class)
            {
                if (new BigDecimal(String.valueOf(number)).compareTo(new BigDecimal(String.valueOf(number)).setScale(0, RoundingMode.HALF_DOWN)) == 0)
                    WholeNumbers.add(number);
            }
            else if (number.getClass() == BigInteger.class)
                WholeNumbers.add(number);
            else if (number.doubleValue() % 1 == 0)
                WholeNumbers.add(number);
        }

        System.out.println("Цілі числа: " + WholeNumbers);

        }


    }




