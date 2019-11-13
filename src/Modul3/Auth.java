package Modul3;

import java.util.HashMap;
import java.util.Map;

public class Auth {

    private HashMap<String, String> tabelAkun = new HashMap<>();
    private HashMap<String, String> tabelSesiLogin = new HashMap<>();
    private int loginCount = 0;
    private int logoutCount = 0;


    public boolean registerAkun(String email, String password){
        try{
            tabelAkun.put(email,password);
        } catch (Exception e) {
            System.out.println("Error While Putting data to Table : " + e);
            return false;
        }
        return true;
    }

    public boolean hapusAkun(String email, String konfirmasiPassword){
        if (tabelAkun.remove(email,konfirmasiPassword)){
            System.out.println("Success Deleting " + email + " From Table");
            return true;
        }
        System.out.println("Error While Deleting " + email + " From Table");
        return false;
    }

    public int totalEmailUMM(){
        int counter = 0;
        for (Map.Entry<String, String> e : tabelAkun.entrySet()) {
            String key = e.getKey();
            if (key.contains("@umm.ac.id"))
                counter ++;
        }
        return counter;
    }

    public boolean loginAkun(String email, String password){
        if (tabelAkun.get(email).equals(password)){
            tabelSesiLogin.put(email,tabelAkun.get(email));
            loginCount ++;
            logoutCount -= ((logoutCount > 0) ? 1 : 0);

            System.out.println("Login Success");
            return true;
        }
        System.out.println("Login Failed");
        return false;
    }

    public boolean logoutAkun(String email){
        try{
            tabelSesiLogin.remove(email);
            logoutCount++;
            loginCount -= ((loginCount > 0) ? 1 : 0);
            System.out.println("Logout Success");
        }catch (Exception e){
            System.out.println("Logout Failed");
            return false;
        }
        return true;
    }

    public int totalLogout(){
        return logoutCount;
    }

    public int totalLogin(){
        return loginCount;
    }
    public int totalAuth(){
        return tabelSesiLogin.size();
    }

}
