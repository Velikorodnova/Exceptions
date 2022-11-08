public class Data {
    private static final String LETTERS_AND_SYMBOLS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789_";

    public static boolean dataValidation(String login, String password, String confirmPassword) {
        try {
            validation(login, password, confirmPassword);

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void validation(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!validationData(login)) {
            throw new WrongLoginException("Логин неверный");
        }
        if (!validationData(password)) {
            throw new WrongPasswordException("Пароль неверный");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны быть одинаковыми");
        }
    }

    public static boolean validationData(String c) {
        if (c.length() > 20) {
            return false;
        }

        for (int i = 0; i < c.length(); i++) {
            if (!LETTERS_AND_SYMBOLS.contains(String.valueOf(c.charAt(i)))) {
                return false;

            }
            
        }
        return true;

    }

}
