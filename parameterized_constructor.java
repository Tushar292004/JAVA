public class parameterized_constructor {
        int num ;
        parameterized_constructor(int num) {
            this.num = num;
            if (num/2 == 0) {
                System.out.println(num + " IS EVEN");
            }
            else {
                 System.out.println(num + " IS ODD");
            }
        }

        public static void main(String[] args) {
            new parameterized_constructor(5);
        }
}
