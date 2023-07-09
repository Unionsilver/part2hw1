public class Puffendui extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public void toCompareStudentPuffendui(Puffendui student) {
        int sum1 = this.getHardworking() + this.getLoyal() + this.getHonest();
        int sum2 = student.getHardworking() + student.getLoyal() + student.getHonest();
        if (sum1 > sum2) {
            System.out.println(this.getName() + "сильнее чем" + student.getName());

        } else if (sum1 < sum2) {
            System.out.println(student.getName() + "сильнее чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + "Равны между собой");
        }
    }

    public Puffendui(String name, String surname, int hardworking, int loyal, int honest, int thePowerOfMagic, int transgressionDistance) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Пуффендуй " +
                ", трудолюбивы " + hardworking +
                ", верны " + loyal +
                ", честны " + honest +
                '}';
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;

    }
}
