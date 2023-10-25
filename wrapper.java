
class WrapperExample1 {
    public static void main(String args[]) {
        // Converting int into Integer
        int a = 20;
        float b = 56.3f;
        Integer i = Integer.valueOf(a);
        Integer j = a;
        Float i1 = Float.valueOf(b);
        Float j1 = b;
        System.out.println(a + " " + i + " " + j);
        System.out.println(b + " " + i1 + " " + j1);
    }
}
