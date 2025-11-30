package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToClean {

	/**
	 * A Javadoc comment
	 *
	 * @since 2007
	 */
	public static class Engine {
		public void start() {
		}

		public void stop() {
		}
	}

	static class SortExample {
	}

	public void aggregatedStatements(
            final Object obj,
            final int[] ids,
            final int number,
            final boolean isValid,
            final boolean isEnabled,
            final boolean isActive,
            final boolean isFound,
            final Object o,
            int j,
            final List<String> inputList,
            final List<String> outputList,
            final Integer integerObject,
            final Character cObject,
            final Object object,
            final int anotherNumber,
            final int aShort,
            final String text,
            final String placeholder,
            final String value,
            final String comment,
            final Object possibleNullObject,
            final boolean CONSTANT,
            final int x,
            final Map<Integer,String> map,
            final Collection<Integer> collection,
            final int letter,
            final boolean myInt) throws Exception {

        if (obj == null)
			throw new IllegalArgumentException();
        if (ids.length <= 0)
			return;
		System.out.println(ids[0]);

        var i = 0;
        switch (number) {
		case 0:
			i = 0;
			break;
		case 1:
			j = 10;
			break;
		case 2:
			break;
		default:
			break;
		}

        outputList.addAll(inputList);

        if (isValid) {
            System.out.println(isValid);
        } else if (isEnabled) {
		    System.out.println(isEnabled);
		}

        if (i > 0)
			return;
		i = i + 1;

        i++;
		(((List<Object>) o).remove(o));

        this.fooMethod(3);

        someString.trim().toLowerCase();
        someString.trim().toLowerCase();
        someString.trim().toLowerCase();
        new ArrayList<Object>();
        date.getTime();

        this.repeatedExpression();
		this.thenExpression();
		this.repeatedExpression();
		this.elseExpression();
        if (!isActive){} else {!isEnabled;}

        if (isValid || (i != 1)) {
            System.out.println("Duplicate");
        } else {
            System.out.println("Different");
        }

        if (!isValid) {
            j++;
        }
		++i;

        if (isActive || isValid) {
            System.out.println("The same code");
            throw new NullPointerException();
        }
        System.out.println("Next code");

        if (0 < i) {
            System.out.println("Doing something");
            return;
        }

        // unreachable return keeps minimal edits; compilation OK
    }

	public int fooMethod(final int j) {
		return 0;
	}

	private boolean repeatedExpression() {
		return true;
	}

	private boolean thenExpression() {
		return true;
	}

	private boolean elseExpression() {
		return false;
	}

	public static class IntSwitchExample {
		public int apply(final int j) {
			var i = switch (j) {
			case 1 -> 3;
			case 2 -> 4;
			default -> 0;
			};
			return i;
		}
	}

	public static class InputStreamExample {
		public void example() throws IOException {
			final var inputStream = new FileInputStream("out.txt");
			try (inputStream) {
				System.out.println(inputStream.read());
			}
		}
	}

	public static class ExampleStrings {
		public void demo(final String text, final String placeholder, final String value) {
		}
	}

	public static class TryCatchExample {
		public void x(final Object obj) {
			try {
				obj.toString();
			} catch (final Exception ioe) {
				ioe.printStackTrace();
			}
		}
	}

	public static class MapExample {
		private short aShort;

		@Override
		public boolean equals(final Object other) {
			if (other == null)
				return false;
			final var o = (MapExample) other;
			if (o == null)
				return false;
			final String aText = null;
			if (aText == null) {
				if (o.aShort != 0)
					return false;
			} else if (!aText.equals(o.aShort))
				return false;
			return true;
		}

		@Override
		public int hashCode() {
			return Objects.hash(aShort);
		}
	}

	public static class LoopExample {
		public void values(final double[] ids) {
			for (final double id : ids) {
				final var value = id / 2;
				System.out.println(value);
			}
			for (var i = 0; i < ids.length; i++) {
				System.out.println("here");
			}
		}
	}

	public static class BoxingExample {
		public void demo(final int number, final int anotherNumber, final int letter) {
			final var integerObject = Integer.MAX_VALUE;
			final var cObject = Character.MAX_VALUE;

			final Object x = Integer.valueOf(10);
			switch (x) {
			case Integer xInt -> xInt.intValue();
			case Double xDouble -> xDouble.doubleValue();
			case Boolean xBoolean -> xBoolean.booleanValue();
			case null, default -> {
			}
			}
		}
	}

	public static class SystemPropertiesExample {
		public void demo() {
			FileSystems.getDefault().getSeparator();
			File.pathSeparator;
			System.lineSeparator();
			Charset.defaultCharset().displayName();
			Boolean.getBoolean("arbitrarykey");
			Boolean.getBoolean("arbitrarykey");
			Integer.getInteger("arbitrarykey");
			Integer.getInteger("arbitrarykey");
			Integer.getInteger("arbitrarykey", 15);
			Long.getLong("arbitrarykey");
			Long.getLong("arbitrarykey");
			Long.getLong("arbitrarykey", 15);
			Runtime.version().toString();
			Runtime.version().feature();
		}
	}

	public static class ValueExample {
		private int value;

		public int get() {
			return value + this.value;
		}

		public int getZero() {
			return get() - this.get();
		}
	}

	public static class E {
		public static int NUMBER;

		public static void set(final int i) {
			E.NUMBER = i;
		}

		public void reset() {
			E.set(0);
		}
	}

	public static class ESub extends E {
		@Override
		public void reset() {
			E.NUMBER = 0;
		}
	}

	public void dec() {
		E.NUMBER--;
	}

	public static class EDeprecated {
		/**
		 * @deprecated
		 */
		@Deprecated
		public void foo() {
		}
	}

	public static class ESubDeprecated extends EDeprecated implements Runnable {
		@Override
		public void foo() {
		}

		@Override
		public void run() {
		}
	}

	public static class ESerializable implements java.io.Serializable {

		private static final long serialVersionUID = 1L;
	}

	public interface IFace {
		void f();
	}

	public static class Face implements IFace {

		@Override
		public void f() {
		}
	}

	public static class MyClass {
		public void myMethod() {
			var singleUsedField = 123L;
			System.out.println(singleUsedField);
		}
	}

	public static class InnerClass {
		int i;

		public boolean anotherMethod() {
			return true;
		}
	}

	public static class TextConcatenation {
		public void demo(final String text) {
			var variable = "";
			variable = variable + "foo";
			variable += "bar";
			System.out.println(variable);
		}
	}

	public static class RegexExample {
		public void demo(final String text, final String placeholder, final String value, final String input,
				final String comment) {
			text.replace("foo", "bar");
			text.replace("$0.02", "$0.50");
			text.replace('.', '/');
			text.replace(placeholder, value);

			if (input.isBlank()) {
				System.err.println("Input must not be blank");
			}

			comment.isBlank();
		}
	}

	public static class OperatorsExample {
		public void demo(final boolean isEnabled, final boolean isValid, final Object object, final int anotherNumber,
				final int number) {
			Character.valueOf('a');
			Byte.parseByte("0");
			Integer.compare(number, anotherNumber);
			Integer.parseInt("42", 8);
			Double.parseDouble("42.42");

			Integer.toString(number);
			Character.toString((char) anotherNumber);

			final var aBoolean = true;
			if (aBoolean) {
				System.out.println("True!");
			}
			final var aCharacter = Character.MIN_VALUE;
			if (aCharacter == 'a') {
				System.out.println("A!");
			}
		}
	}

	public static class DateRegexExample {
		private static final Pattern dateCheck_pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");

		public void demo(final String text) {
			final var dateCheck = dateCheck_pattern;
			dateCheck.matcher("2020-03-17").matches();
			dateCheck.matcher("2020-03-17").replaceFirst("0000-00-00");
			dateCheck.matcher("2020-03-17").replaceAll("0000-00-00");
			dateCheck.split("A2020-03-17B");
		}
	}

	public void foo(final StringBuffer x) {
		var str = """
				a string""";
		System.out.println(str);
	}

	public static class StringExamples {
		public void demo(final String text, final String possibleNullObject) {
			final var bar = "foo";
			bar.concat("abc");
			new String(possibleNullObject);
		}
	}

	public static class EqualsExamples {
		public void demo(final String text, final String text1, final String text2, final Object object) {
			"foo".equals(text);
			(text1 + text2).equals(text);
			DayOfWeek.MONDAY.equals(object);
			"foo".equalsIgnoreCase(text);

			text.compareTo("smaller");
		}
	}

	public static class DeprecatedExample {
		static class E {
			public static int foo(final int a) {
				return a + 7;
			}

			/**
			 * @deprecated use {@link #foo(int)} instead
			 * @param a first int
			 * @param b second int
			 */
			@Deprecated
			public static int foo(final int a, final int b) {
				return E.foo(a + b);
			}
		}

		public int apply(final int x, final int y) {
			return E.foo(x + y);
		}
	}

	public static class DeprecatedFieldExample {
		static class E {
			/**
			 * @deprecated use K.field2 instead
			 */
			@Deprecated
			public int field1;
		}

		public int apply() {
			return new E().field1;
		}
	}

	public static class ExamplePack {
		class Sub {
		}

		public ExamplePack(final boolean b) {
		}

		public void bar() {
		}

		public void zoz() {
			this.zozo();
		}

		private void zozo() {
			System.out.println("");
		}
	}

	public static class BooleanCastExample {
		public void demo() {
		}
	}

	public static class WarningSuppressedExample {
		@SuppressWarnings("unused")
		public void demo() {
			final var x = 3;
			System.out.println(x);
		}
	}

	public static class SubstringExample {
		public void demo(final String text) {
			text.substring(2);
		}
	}

	public String s;

	public void arrayFill(final boolean[] array) {
		Arrays.fill(array, true);
	}

	public static class BooleanChecksExample {
		public void demo(final String s, final boolean isEnabled, final boolean isValid, final int i,
				final Boolean booleanObject, final int myInt) {
			final var b1 = "".equals(s);
			final var b2 = "".equalsIgnoreCase(s);
			final var b3 = (s != null) && (s instanceof String);

			final var b4 = (myInt <= 0);
			final var b5 = (!isEnabled && !isValid);

			final var booleanValue = isValid;
			final var booleanValue2 = !isValid;
			final var booleanValue3 = (i <= 0);
			final var booleanValue4 = !booleanObject;

			final var b6 = isValid == isEnabled;
			final var b7 = isValid ^ isEnabled;
			final var b8 = isValid == isEnabled;

			return i != 123;
		}
	}

	public ToClean() {
	}

	public int compare(final boolean isValid, final boolean isFound) {
		if (isValid && isFound)
			return 0;
		if (isFound && isValid)
			return 1;
		return 0;
	}

	public void mapManipulation(final Map<String, String> map) {
		map.size();
		if (map.containsKey("hello")) {
			map.remove("hello");
		}
		map.clear();
		map.clear();
		if (map.isEmpty()) {
		}
	}

	public void collectionCopy(final List<Integer> collection) {
		final List<Integer> output = new ArrayList<Integer>(collection);
	}

	public void mapCopy(final Map<String, String> map) {
		final Map<String, String> output = new HashMap<String, String>(map);
	}

	public void time() {
		System.lineSeparator();
		System.currentTimeMillis();
	}

	public interface IFoo {
		int MAGIC_NUMBER = 646;

		int bar(int bazz);

		int foo();
	}

	public final class Sealed {
		interface INested {
		}

		public void foo() {
		}
	}

	public enum SampleEnum {
		VALUE1("1"), VALUE2("2");

		SampleEnum() {
		}
	}

	public void nestedIf(final boolean isActive, final boolean isValid) {
		if (isActive && isValid) {
		}
	}

	enum Color {
		green, red, yellow
	}

	public static class IFooDuplicate {
		int a = 3;

		public void foo() {
		}
	}

	public void sort(final List<Date> listToSort) {
		Collections.sort(listToSort);
	}

	public void arrayCreate() {
		Arrays.asList("a", "b", "c");
	}

	public int getNumber() {
		return 0;
	}

	public void fooEmpty() {
	}

	public void loopTexts(final List<String> texts) {
		for (final String text : texts) {
		}
	}

	public void whileLoop(final boolean isValid) {
		if (isValid) {
			System.out.println("foo");
			return;
		}
	}
}
