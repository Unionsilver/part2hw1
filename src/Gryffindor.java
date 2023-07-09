public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public void toCompareStudentGryffindor(Gryffindor student){
        int sum1 = this.getNobility() + this.getHonor() + this.getBravery();
        int sum2 = student.getNobility() + student.getHonor() + student.getBravery();
        if (sum1 > sum2) {
            System.out.println(this.getName() + "сильнее чем" + student.getName() );
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + "сильнее чем " + this.getName());
        }
        else{
            System.out.println(this.getName() + " и " + student.getName() +"Равны между собой");
        }
    }

    public Gryffindor(String name, String surname, int nobility, int honor, int bravery, int thePowerOfMagic, int transgressionDistance) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Гриффиндорцы " +
                ", благородство " + nobility +
                ", честь " + honor +
                ", храбрость" + bravery +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;

    }
}
