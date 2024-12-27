package sedmaSedmica.Ponedeljak.Kupovina;

public class Main {
    public static void main(String[] args) {

        Stavka stavka1 = new Stavka("Majica", 14.5);
        KreditnaKartica kreditnaKartica = new KreditnaKartica(100);

        //kupovina u radnji
        FizickaKorpa fizickaKorpa = new FizickaKorpa(stavka1, kreditnaKartica);
        System.out.println(fizickaKorpa.kolikoPutaMozemoKupitiStavku());
        fizickaKorpa.plati();
        System.out.println(kreditnaKartica.getStanjeNaRacunu());

        //online kupovina
        Stavka stavka2 = new Stavka("Torba", 20);
        OnlineKorpa onlineKorpa = new OnlineKorpa(stavka2, kreditnaKartica);
        System.out.println(onlineKorpa.kolikoPutaMozemoKupitiStavku());
        onlineKorpa.plati();
        System.out.println(kreditnaKartica.getStanjeNaRacunu());

    }
}
