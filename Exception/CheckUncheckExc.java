package Exception;

public class CheckUncheckExc {
    static class LowBalanceException extends Exception {
        public String toString() {
            return "Balance should not be less than 5000";
        }
    }

    static void fun1() {
        try {
            System.out.println(10 / 0);  // unchecked exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new LowBalanceException();   // checked exception
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
