package my.lambdas;

//функциональный интерфейс - это интерфейс ровно с одним методом

@FunctionalInterface //это просто аннотация, чтобы компилятор не дал добавить творой метод
public interface IntegerTransform {
    Integer doTransform(Integer x);



}
