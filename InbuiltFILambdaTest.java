package Java_8;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbuiltFILambdaTest {

	public static void main(String[] args) {
		/*Function<Integer, Integer> func=(n)->n*n;
		Integer res=func.apply(2);
		System.out.println(res);
		
		BiFunction<Integer, Integer, Integer> bifunc=(a,b)->a*b;
		System.out.println(bifunc.apply(3, 7));
		
		Predicate<Integer> predicate=(a)->a%2==0;
		System.out.println(predicate.test(11));
		
		Supplier<Double> supplier=()->Math.random();
		System.out.println(supplier.get());*/
		
		/*Consumer<String> consumer =(a) -> System.out.println(a.length());
		consumer.accept("Hello");*/
		
		Function<String, Integer> func1=(a)->a.length();
		System.out.println(func1.apply("Hello world"));
		

	}

}
