public class Main {

    public static void main(String[] args) {
        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри  ", "Поттер", 100, 100, 100, 100, 100),
                new Gryffindor("Гермиона  ", "Грейнджер", 100, 100, 100, 100, 100),
                new Gryffindor("Рон  ", "Уизли", 100, 100, 100, 100, 100)
        };
        gryffindor[0].toCompareStudentGryffindor(gryffindor[1]);


        Puffendui[] puffenduis = {
                new Puffendui("Захария  ", "Смит", 29, 60, 49, 74, 38),
                new Puffendui("Седрик  ", "Диггори", 49, 67, 66, 28, 94),
                new Puffendui("Джастин  ", "Финч-Флетчли ", 97, 44, 66, 78, 33)
        };
        puffenduis[0].toCompareStudentPuffendui(puffenduis[1]);

        Cogtevran[] cogtevrans = {
                new Cogtevran("Чжоу  ", "Чанг", 79, 89, 99, 83, 89, 22),
                new Cogtevran("Падма  ", "Патил", 44, 77, 44, 77, 88, 33),
                new Cogtevran("Маркус  ", "Белби", 34, 87, 55, 89, 33, 21)
        };
        cogtevrans[0].toCompareStudentCogtevran(cogtevrans[1]);


        Slytherin[] slytherins = {
                new Slytherin("Драко  ", "Малфой", 96, 100, 98, 67, 44, 99, 99),
                new Slytherin("Грэхэм  ", "Монтегю", 88, 70, 56, 65, 79, 33, 97),
                new Slytherin("Грегори  ", "Гойл", 56, 95, 90, 88, 99, 45, 88)
        };
        slytherins[0].toCompareStudentSlytherin(slytherins[1]);


        System.out.println();
        gryffindor[0].compareGriffindorStudents(gryffindor[1]);
        System.out.println();
        PrintService printService = new PrintService();
        printService.print(gryffindor);
        printService.print(puffenduis);
        printService.print(cogtevrans);
        printService.print(slytherins);

    }
}