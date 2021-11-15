package my.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Client {

    public static void main(String[] args) {
        //Стиль лямбда (стрелочных функций) и без классических циклов с применением стандартных ф.интерфейсов
        List<Integer> data = new ArrayList<>();
        data.add(1); data.add(2); data.add(3);

        var ict = new IntegerCollectionTransformerWithStandardFunctionInterface();

        var result = ict.transform(data, x -> x * x * x);

        Function<Integer, Integer> lambda = x -> x * x * x * x;
        ict.transform(data, lambda).forEach(x -> {
            System.out.println(x);
        });
    }

















    //первый пример stream
    public static void main4(String[] args) {

        List<Integer> data = new ArrayList<>();
        data.add(1); data.add(2); data.add(3); data.add(4); data.add(5);

        //превращает список в тип данных, с котоырм можно проводить всякие операции транс, ф, сорт
        data.stream()
                .map(x -> x * x) //здесь использован функциональный интерфейс Function<Integer,Integer>
                .filter(x -> x > 10) //здесь использован Predicate<Integer> (только тип входа, так как возвращает только boolean)
                .forEach(x -> { //здесь использован Consumer<Integer> (тип void, не возвращает)
                    System.out.println(x);
                });

    }

    //модный лямбда стиль стрелочек без циклов
    public static void main3(String[] args) {
        //Стиль лямбда (стрелочных функций) и без классических циклов
        List<Integer> data = new ArrayList<>();
        data.add(1); data.add(2); data.add(3);

        IntegerCollectionTransformer ict = new IntegerCollectionTransformer();

        var result = ict.transform(data, x -> x * x * x);

        IntegerTransform lambda = x -> x * x * x * x;
        //модный цикл
        ict.transform(data, lambda).forEach(x -> {
            System.out.println(x);
        });
    }



    //классический лямбда стиль стрелочек
    public static void main2(String[] args) {
        //Стиль лямбда (стрелочных функций)
        List<Integer> data = new ArrayList<>();
        data.add(1); data.add(2); data.add(3);

        IntegerCollectionTransformer ict = new IntegerCollectionTransformer();

        var result = ict.transform(data, x -> x * x * x);

        IntegerTransform lambda = x -> x * x * x * x;
        result =  ict.transform(data, lambda);
        for(var x: result) {
            System.out.println(x);
        }
    }

//        var result = ict.transform(data, x -> {
//            return x * x * x;
//        });






    public static void main1(String[] args) {
        //Стиль анонимных классов. Неплохо, но тяжелая "комфорка"
        List<Integer> data = new ArrayList<>();
        data.add(1); data.add(2); data.add(3);

        IntegerCollectionTransformer ict = new IntegerCollectionTransformer();

        var result = ict.transform(data, new IntegerTransform() {
            @Override
            public Integer doTransform(Integer x) {
                return x * x;
            }
        });
        for(var x: result) {
            System.out.println(x);
        }
    }


//    public static void main(String[] args) {
//        //Это не модная работа прогера, который не хочет расти :)
//        //System.out.println("Hello, world!");
//        List<Integer> data = new ArrayList<>();
//        data.add(1); data.add(2); data.add(3);
//
//        IntegerCollectionTransformer ict = new IntegerCollectionTransformer();
//        var result = ict.squares(data);
//        for(var x: result) {
//            System.out.println(x);
//        }
//
//    }




}
