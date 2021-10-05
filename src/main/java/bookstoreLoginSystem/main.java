package bookstoreLoginSystem;

/**https://www.youtube.com/watch?v=Hiv3gwJC5kw
 *
 */

public class main {
    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

    }
}


