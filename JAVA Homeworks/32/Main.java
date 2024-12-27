package sedmaSedmica.Cetvrtak_Test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Planina> listaPlanina = new ArrayList<>();
        Planina planina1 = new Planina("Planina 1", 200, true);
        Planina planina2 = new Planina("Planina 2", 100, false);
        Planina planina3 = new Planina("Planina 3", 300, false);
        Planina planina4 = new Planina("Planina 4", 250, true);
        Planina planina5 = new Planina("Planina 5", 150, false);
        Planina planina6 = new Planina("Planina 6", 350, true);
        listaPlanina.add(planina1);
        listaPlanina.add(planina2);
        listaPlanina.add(planina3);
        listaPlanina.add(planina4);
        listaPlanina.add(planina5);
        listaPlanina.add(planina6);

        Planinar rekreativac = new Rekreativac(listaPlanina, 100);
        Planinar amater = new Amater(listaPlanina, 200);
        Planinar pro = new Pro(listaPlanina, 300);

        Planina p = new Planina("P", 300, true);

        pro.dodaj(p);
        System.out.println(listaPlanina);

    }
}
