import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class JavaStreamsClass1 {

	//@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Luiz");
		names.add("Amanda");
		names.add("Lucas");
		names.add("Amaury");
		names.add("Arthur");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}

		}
		System.out.println(count);
		System.out.println("******************************************");

	}

	//@Test
	public void stramFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Luiz");
		names.add("Amanda");
		names.add("Lucas");
		names.add("Amaury");
		names.add("Arthur");

		// there is no life for intermediate op if there is no terminal op
		// terminal operation will execute only if intermediate op (filter) returns true
		// We can create stream
		// How to use filter in Stream API

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		long d = Stream.of("Luiz", "Amanda", "Lucas", "Amaury", "Arthur").filter(s ->

		{
			s.startsWith("A");
			return false;
		}).count();
		System.out.println(d);

		// print all the names of ArrayList
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
		System.out.println("******************************************");
	}

	//@Test
	public void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("João");
		names.add("Maria");
		names.add("José");

		// print names witch have last letter as "a" with Uppercase
		Stream.of("Luiz", "Amand", "Lucas", "Amaury", "Arthur").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// print names witch have first letter as "a" with uppercase and sorted
		List<String> names1 = Arrays.asList("Luiz", "Amanda", "Lucas", "Amaury", "Arthur");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		// merging (concatenar) em duas listas diferentes
		Stream<String> concatenar = Stream.concat(names.stream(), names1.stream());
		concatenar.sorted().forEach(s -> System.out.println(s));// <<< comentado para usar duas vezes
		// boolean flag = concatenar.anyMatch(s->s.equalsIgnoreCase("Lucas"));
		// Assert.assertTrue(flag);
		// System.out.println(flag);

	}

	@Test 
	public void streamCollect() {
		List<String> ls = Stream.of("Luiz", "Amanda", "Lucas", "Amaury", "Maria").filter(s -> s.endsWith("a")).map(s ->
		s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		//print unique number from this array
		//sort the array
		//apenas unicos numeros não duplicados
		List <Integer> numbers= Arrays.asList(3,7,8,5,4,2,6,9,9,9,9,3,3,3,3,7,7,1,2,10);
		numbers.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("***************");
		numbers.stream().sorted().distinct().limit(3).forEach(s->System.out.println(s));
		List<Integer> n = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(n.get(9));
		
		
	}
}
