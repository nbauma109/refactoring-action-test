package demo;

import java.io.FileInputStream;
import java.io.IOException;
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
     * @since 2007
     */
    public static class Engine {
        public void start() {}

        public void stop() {}
    }

    static class SortExample {
        private String foo;
        private String bar;
        private void foo() {}
        private void bar() {}
    }

    public void aggregatedStatements(
            Object obj,
            int[] ids,
            int number,
            boolean isValid,
            boolean isEnabled,
            boolean isActive,
            boolean isFound,
            Object o,
            int j,
            List<String> inputList,
            List<String> outputList,
            Integer integerObject,
            Character cObject,
            Object object,
            int anotherNumber,
            int aShort,
            String text,
            String placeholder,
            String value,
            String comment,
            Object possibleNullObject,
            boolean CONSTANT,
            int x,
            Map<Integer,String> map,
            Collection<Integer> collection,
            int letter,
            boolean myInt) throws Exception {

        if (obj == null) {
            throw new IllegalArgumentException();
        }
        if (ids.length > 0) {
            System.out.println(ids[0]);
        } else {
            return;
        }

        int i = 0;
        int kVal = 0;
        int m = 0;
        switch (number) {
		case 0:
			i = 0;
			break;
		case 1:
			j = 10;
			break;
		case 2:
			kVal = 20;
			break;
		default:
			m = -1;
			break;
		}

        for (int idx = 0; idx < inputList.size(); idx++) {
            outputList.add(inputList.get(idx));
        }

        if (isValid) {
            System.out.println(isValid);
        } else {
            if (isEnabled) {
                System.out.println(isEnabled);
            }
        }

        if (i > 0) {
            return;
        } else {
            i = i + 1;
        }

        boolean b = (i > 0 && i < 10 || i == 50);
        boolean isPositive = ++i > 0;

        boolean isRemoved = false;
        isRemoved = (isRemoved = ((List<Object>) o).remove(o));

        long number1 = 10L;

        boolean isRightType = String.class.isInstance(o);

        int h;
        fooMethod(3);

        java.util.function.Function<String, String> f1 = (someString) -> someString.trim().toLowerCase();
        java.util.function.Function<String, String> f2 = someString -> { return someString.trim().toLowerCase(); };
        java.util.function.Function<String, String> f3 = someString -> { return someString.trim().toLowerCase() + "bar"; };
        java.util.function.Supplier<List<Object>> s1 = () -> new ArrayList<>();
        java.util.function.Function<Date, Long> f4 = date -> date.getTime();

        boolean newBoolean = repeatedExpression() && thenExpression() || repeatedExpression() && elseExpression();
        boolean result = (0 < i) && isValid || (i <= 0) && isEnabled;

        boolean newBoolean1 = isValid && (i > 0) || !isValid && (i <= 0);
        boolean newBoolean2 = !isValid && isEnabled || isValid && !isEnabled;
        boolean newBoolean3 = isActive ? (0 <= i) : (i < 0);
        boolean newBoolean4 = !isActive ? isEnabled : !isEnabled;

        if (isValid) {
            System.out.println("Duplicate");
        } else if (i == 1) {
            System.out.println("Different");
        } else {
            System.out.println("Duplicate");
        }

        if (isValid) {
            ++i;
        } else {
            j++;
            i = i + 1;
        }

        if (isActive) {
            System.out.println("The same code");
            throw new NullPointerException();
        }
        if (isValid) {
            System.out.println("The same code");
            throw new NullPointerException();
        }
        System.out.println("Next code");

        if (0 < i) {
            System.out.println("Doing something");
            return;
        }
        return;

        // unreachable return keeps minimal edits; compilation OK
    }

    public int fooMethod(int j) {
        int k, h;
        h = 0;
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
        public int apply(int j) {
            int i;
            switch (j) {
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                default:
                    i = 0;
                    break;
            }
            return i;
        }
    }

    public static class InputStreamExample {
        public void example() throws IOException {
            final FileInputStream inputStream = new FileInputStream("out.txt");
            try {
                System.out.println(inputStream.read());
            } finally {
                inputStream.close();
            }
        }
    }

    public static class ExampleStrings {
        public void demo(String text, String placeholder, String value) {
            String buf = ""
                + "public class A {"
                + "    public void foo() {"
                + "    }"
                + "}";

            StringBuffer sb = new StringBuffer();
            sb.append("public void foo() {\n");
            sb.append("    return null;\n");
            sb.append("}\n");
            String k = sb.toString();
        }
    }

    public static class TryCatchExample {
        public void x(Object obj) {
            try {
                obj.toString();
            } catch (IllegalArgumentException iae) {
                iae.printStackTrace();
            } catch (Exception ioe) {
                ioe.printStackTrace();
            }
        }
    }

    public static class MapExample {
        private short aShort;

        public int hashCode() {
            return Objects.hash(aShort);
        }

        public boolean equals(Object other) {
            if (other == null) {
                return false;
            }
            MapExample o = (MapExample) other;
            if (o == null) {
                return false;
            }
            String aText = null;
            if (aText == null) {
                if (o.aShort != 0) {
                    return false;
                }
            } else if (!aText.equals(o.aShort)) {
                return false;
            }
            return true;
        }
    }

    public static class LoopExample {
        public void values(double[] ids) {
            for (int i = 0; i < ids.length; i++) {
                double value = ids[i] / 2;
                System.out.println(value);
            }
            for (int i = 0; i < ids.length; i++) {
                System.out.println("here");
            }
        }
    }

    public static class BoxingExample {
        public void demo(int number, int anotherNumber, int letter) {
            Integer i = Integer.valueOf(0);
            Character c = Character.valueOf('*');

            Integer integerObject = Integer.MAX_VALUE;
            Character cObject = Character.MAX_VALUE;

            int ii = integerObject.intValue();
            char cc = cObject.charValue();

            Object x = Integer.valueOf(10);
            double d = 0;
            boolean b = false;

            if (x instanceof Integer xInt) {
                ii = xInt.intValue();
            } else if (x instanceof Double xDouble) {
                d = xDouble.doubleValue();
            } else if (x instanceof Boolean xBoolean) {
                b = xBoolean.booleanValue();
            } else {
                ii = 0;
                d = 0;
                b = false;
            }
        }
    }

    public static class SystemPropertiesExample {
        public void demo() {
            String fs = System.getProperty("file.separator");
            String ps = System.getProperty("path.separator");
            String ls = System.getProperty("line.separator");
            String fe = System.getProperty("file.encoding");
            Boolean b = Boolean.parseBoolean(System.getProperty("arbitrarykey"));
            Boolean b2 = Boolean.parseBoolean(System.getProperty("arbitrarykey", "false"));
            Integer i = Integer.parseInt(System.getProperty("arbitrarykey"));
            Integer i2 = Integer.parseInt(System.getProperty("arbitrarykey", "0"));
            Integer i3 = Integer.parseInt(System.getProperty("arbitrarykey", "15"));
            Long l = Long.parseLong(System.getProperty("arbitrarykey"));
            Long l2 = Long.parseLong(System.getProperty("arbitrarykey", "0"));
            Long l3 = Long.parseLong(System.getProperty("arbitrarykey", "15"));
            String jv = System.getProperty("java.runtime.version");
            String jsv = System.getProperty("java.specification.version");
        }
    }

    public static class ValueExample {
        private int value;
        public int get() {
            return this.value + value;
        }

        public int getZero() {
            return this.get() - get();
        }
    }

    public static class E {
        public static int NUMBER;
        public static void set(int i) {
            NUMBER = i;
        }
        public void reset() {
            set(0);
        }
    }

    public static class ESub extends E {
        public void reset() {
            ESub.NUMBER = 0;
        }
    }

    public void dec() {
        (new E()).NUMBER--;
    }

    public static class EDeprecated {
        /**
         * @deprecated
         */
        public void foo() {}
    }

    public static class ESubDeprecated extends EDeprecated implements Runnable {
        public void foo() {}
        public void run() {}
    }

    public static class ESerializable implements java.io.Serializable {}

    public static interface IFace {
    	public void f();
    }
    
    public static class Face implements IFace {

		@Override
		public void f() {
		}
    }

    public static class MyClass {
        private long singleUsedField;

        public void myMethod() {
            singleUsedField = 123;
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
        public void demo(String text) {
            String variable = "";
            variable = variable + "foo";
            variable += "bar";
            System.out.println(variable);
        }
    }

    public static class RegexExample {
        public void demo(String text, String placeholder, String value, String input, String comment) {
            String result = text.replaceAll("foo", "bar");
            String result2 = text.replaceAll("\\$0\\.02", "\\$0.50");
            String result3 = text.replaceAll("\\.", "/");
            String result4 = text.replaceAll(Pattern.quote(placeholder), Matcher.quoteReplacement(value));

            if ("".equals(input.strip())) {
                System.err.println("Input must not be blank");
            }

            boolean hasComment = comment.strip().length() > 0;
        }
    }

    public static class OperatorsExample {
        public void demo(boolean isEnabled, boolean isValid, Object object, int anotherNumber, int number) {
            boolean b = isEnabled | isValid;
            boolean b2 = isEnabled & isValid;

            Object characterObject = Character.valueOf('a');
            new Byte("0").byteValue();
            long l = new Long(42);

            int comparison = Integer.valueOf(number).compareTo(anotherNumber);
            int numberParse = Integer.valueOf("42", 8);
            new Double("42.42").doubleValue();

            String text1 = Integer.valueOf(number).toString();
            String text2 = Character.valueOf((char) anotherNumber).toString();

            Boolean aBoolean = Boolean.TRUE;
            if (aBoolean) {
                System.out.println("True!");
            }
            Character aCharacter = Character.MIN_VALUE;
            if (aCharacter == 'a') {
                System.out.println("A!");
            }
        }
    }

    public static class DateRegexExample {
        public void demo(String text) {
            String dateCheck = "\\d{4}-\\d{2}-\\d{2}";
            "2020-03-17".matches(dateCheck);
            "2020-03-17".replaceFirst(dateCheck, "0000-00-00");
            "2020-03-17".replaceAll(dateCheck, "0000-00-00");
            "A2020-03-17B".split(dateCheck);
        }
    }

    public void foo(StringBuffer x) {
        StringBuffer y = new StringBuffer();
        y.append("a string");
        System.out.println(y.toString());
    }

    public static class StringExamples {
        public void demo(String text, String possibleNullObject) {
            String bar = new String("foo");
            String newBar = (new String(bar)).concat("abc");
            String cantChange = new String(possibleNullObject);
        }
    }

    public static class EqualsExamples {
        public void demo(String text, String text1, String text2, Object object) {
            boolean isActive = Boolean.TRUE;

            boolean result = text.equals("foo");
            boolean result2 = text.equals(text1 + text2);
            boolean result3 = object.equals(DayOfWeek.MONDAY);
            boolean result4 = text.equalsIgnoreCase("foo");

            boolean isSmaller = text.compareTo("smaller") == -1;
        }
    }

    public static class DeprecatedExample {
        static class E {
            /**
             * @deprecated use {@link #foo(int)} instead
             * @param a first int
             * @param b second int
             */
            @Deprecated
            public static int foo(int a, int b) {
                return foo(a + b);
            }
            public static int foo(int a) {
                return a + 7;
            }
        }

        public int apply(int x, int y) {
            return E.foo(x, y);
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
        class Sub {}
        public ExamplePack(boolean b) {}
        private ExamplePack() {}
        private int fField;
        private void foo() {}
        public void bar() {
            int i = 10;
        }
        public void zoz() {
            zozo(34);
        }
        private void zozo(int k) {
            System.out.println("");
        }
    }

    public static class BooleanCastExample {
        public void demo() {
            Boolean b = (Boolean) Boolean.TRUE;
        }
    }

    public static class WarningSuppressedExample {
        @SuppressWarnings("unused")
        public void demo() {
            int x = 3;
            System.out.println(x);
        }
    }

    public static class SubstringExample {
        public void demo(String text) {
            String shortenedText = text.substring(2);
        }
    }

    public String s;
    public void arrayFill(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = true;
        }
    }

    public static class BooleanChecksExample {
        public void demo(String s, boolean isEnabled, boolean isValid, int i, Boolean booleanObject, int myInt) {
            boolean b1 = s != null && "".equals(s);
            boolean b2 = null != s && "".equalsIgnoreCase(s);
            boolean b3 = s != null && s instanceof String;

            boolean b4 = !(myInt > 0);
            boolean b5 = !(isEnabled || isValid);

            boolean booleanValue = isValid == true;
            boolean booleanValue2 = isValid == false;
            boolean booleanValue3 = Boolean.FALSE.equals(i > 0);
            boolean booleanValue4 = booleanObject.equals(Boolean.FALSE);

            boolean b6 = !isValid == !isEnabled;
            boolean b7 = !isValid != !isEnabled;
            boolean b8 = !isValid ^ isEnabled;

            if (i != 123) {
                return;
            } else {
                return;
            }
        }
    }

    public ToClean() {
        super();
    }

    public int compare(boolean isValid, boolean isFound) {
        if (isValid && isFound) {
            return 0;
        } else if (isFound && isValid) {
            return 1;
        }
        return 0;
    }

    public void mapManipulation(Map<String,String> map) {
        int x = map.keySet().size();
        if (map.keySet().contains("hello")) {
            map.keySet().remove("hello");
        }
        map.keySet().clear();
        map.values().clear();
        if (map.keySet().isEmpty()) {
            x++;
        }
    }

    public void collectionCopy(List<Integer> collection) {
        List<Integer> output = new ArrayList<>();
        output.addAll(collection);
    }

    public void mapCopy(Map<String,String> map) {
        Map<String, String> output = new HashMap<>();
        output.putAll(map);
    }

    public void time() {
        long time = 0;
        String separator = "";
        separator = System.lineSeparator();
        time = System.currentTimeMillis();
    }

    public interface IFoo {
        int MAGIC_NUMBER = 646;
        int foo();
        int bar(int bazz);
    }

    public final class Sealed {
        public final void foo() {}

        abstract static interface INested {}
    }

    public enum SampleEnum {
        VALUE1("1"), VALUE2("2");
        private SampleEnum(String s) {}
    }

    public void nestedIf(boolean isActive, boolean isValid) {
        if (isActive) {
            if (isValid) {
                int i = 0;
            }
        }
    }

    enum Color {
        red, yellow, green
    }

    public static class IFooDuplicate {
        int a = 3;
        public void foo() {}
    }

    public void sort(List<Date> listToSort) {
        Collections.sort(listToSort, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public void arrayCreate() {
        List k = Arrays.asList(new String[] {"a", "b", "c"});
        double[] doubleArray = new double[] { 42.42 };
    }

    public int getNumber() {
        int i = 0;
        return i;
    }

    public void fooEmpty() {
        return;
    }

    public void loopTexts(List<String> texts) {
        for (String text : texts) {
            continue;
        }
    }

    public void whileLoop(boolean isValid) {
        while (isValid) {
            System.out.println("foo");
            return;
        }
    }
}
