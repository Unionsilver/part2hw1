public class Cogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;
    public void toCompareStudentCogtevran(Cogtevran student){
        int sum1 = this.getSmart() + this.getWise() + this.getWitty() + this.getFullOfCreativity();
        int sum2 = student.getSmart() + student.getWise() + student.getWitty() + student.getFullOfCreativity();
        if (sum1 > sum2) {
            System.out.println(this.getName() + "сильнее чем" + student.getName() );

        } else if (sum1 < sum2) {
            System.out.println(student.getName() + "сильнее чем " + this.getName());
        }
        else{
            System.out.println(this.getName() + " и " + student.getName() +"Равны между собой");
        }
    }

    public Cogtevran(String name, String surname, int smart, int wise, int witty, int fullOfCreativity, int thePowerOfMagic, int transgressionDistance) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Когтевранцы{" +
                ", умны " + smart +
                ", мудры " + wise +
                ", остроумны " + witty +
                ", полны творчества " + fullOfCreativity +
                '}';
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;

    }
}
