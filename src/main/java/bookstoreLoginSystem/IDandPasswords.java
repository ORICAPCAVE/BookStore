package bookstoreLoginSystem;

import java.util.HashMap;

/**https://www.youtube.com/watch?v=Hiv3gwJC5kw
 *
 */

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Bro","pizza");
        logininfo.put("Brometheus","PASSWORD");
        logininfo.put("BroCode","abc123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}

