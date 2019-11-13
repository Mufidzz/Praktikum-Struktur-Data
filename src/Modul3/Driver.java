package Modul3;

public class Driver {
    public static void main(String[] args) {
        Auth a = new Auth();
        a.registerAkun("a","a");
        a.registerAkun("b@umm.ac.id","a");
        a.registerAkun("c@umm.ac.id","a");

        a.loginAkun("a","a");
        a.loginAkun("c@umm.ac.id","c");

        a.logoutAkun("b");

        System.out.println(a.totalEmailUMM());
        System.out.println(a.totalAuth());
        System.out.println(a.totalLogin());
        System.out.println(a.totalLogout());

    }
}
