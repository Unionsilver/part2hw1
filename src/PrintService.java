public class PrintService {
    public void print(Gryffindor[] gryffindor) {
        System.out.println("Количество  учеников Грифиндора - " + gryffindor.length);
        for (int i = 0; i < gryffindor.length; i++) {
            Gryffindor gryffindor1 = gryffindor[i];
            System.out.println("Имя " + gryffindor1.getName() + "; Фамилия " + gryffindor1.getSurname() +
                    "; благородство " + gryffindor1.getNobility() + "; честь " + gryffindor1.getHonor() +
                    "; храбрость  " + gryffindor1.getBravery());

        }
        System.out.println();
    }

    public void print(Puffendui[] puffenduis) {
        System.out.println("Количество  учеников Пуффендуис - " + puffenduis.length);
        for (int i = 0; i < puffenduis.length; i++) {
            Puffendui puffendui = puffenduis[i];
            System.out.println("Имя " + puffendui.getName() + "; Фамилия " + puffendui.getSurname() +
                    "; трудолюбивы  " + puffendui.getHardworking() + "; верны   " + puffendui.getLoyal() +
                    "; честны  " + puffendui.getHonest());
        }
        System.out.println();
    }

    public void print(Cogtevran[] cogtevrans) {
        System.out.println("Количество учеников Когтевранс - " + cogtevrans.length);
        for (int i = 0; i < cogtevrans.length; i++) {
            Cogtevran cogtevran = cogtevrans[i];
            System.out.println("Имя " + cogtevran.getName() + "; Фамилия " + cogtevran.getSurname() +
                    "; умны " + cogtevran.getSmart() + "; мудры " + cogtevran.getWise() + "; остроумны " +
                    cogtevran.getWitty() + "; полны творчества " + cogtevran.getFullOfCreativity());

        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("Количество  учеников Слизерин - " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя " + slytherin.getName() + "; Фамилия " +
                    slytherin.getSurname() + "; хитрость " + slytherin.getCunning() +
                    "; решительность " + slytherin.getDetermination() + "; амбициозность " +
                    slytherin.getAmbition() + "; находчивость " + slytherin.getResourcefulness() +
                    "; жажда власти " + slytherin.getLustForPower());
        }
        System.out.println();
    }
}
