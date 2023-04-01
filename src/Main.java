public class Main {
    public static void main(String[] args) {
        boolean testData = Data.dataValidation("fgfgfg", "gkhjfhjf", "gkhjfhjf");
        if (testData) {
            System.out.println("Логин и пароль верные");
        } else {
            System.out.println("Логин и пароль неверные");
        }
    }
}