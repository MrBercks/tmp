package my.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class IntegerCollectionTransformerWithStandardFunctionInterface {

//    public List<Integer> squares(List<Integer> data){
//        List<Integer> result = new ArrayList<>();
//
//        for(int x: data) {
//            result.add(x * x);
//        }
//        return result;
//    }



//Не обязательно писать свои собственные функциональные интерфейсы, в большинстве случаев уже есть готовые. Вот тут function с apply
    public List<Integer> transform(List<Integer> data, Function<Integer, Integer> transform){ //тут generic, изучи
        List<Integer> result = new ArrayList<>();

        for(int x: data) {
            result.add(transform.apply(x));
        }
        return result;
    }




}
