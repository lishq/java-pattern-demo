package util;


public class Commons {

    final public static String codeFormat = "%s是二的幂次方?%s";

    @org.junit.Test
    public void test() {

        for (int i = 0; i < 10; i++) {
            boolean result = isPowerOfTwo(i);
            System.out.println(String.format(codeFormat,i,result));
        }
    }

    private static boolean isPowerOfTwo(int val) {
        return (val & -val) == val;
    }
}
