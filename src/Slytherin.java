public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public void toCompareStudentSlytherin(Slytherin student) {
        int sum1 = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int sum2 = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();
        if (sum1 > sum2) {
            System.out.println(this.getName() + "сильнее чем" + student.getName());

        } else if (sum1 < sum2) {
            System.out.println(student.getName() + "сильнее чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + "Равны между собой");
        }
    }

    public Slytherin(String name, String surname, int cunning, int determination, int ambition, int resourcefulness, int lustForPower, int thePowerOfMagic, int transgressionDistance) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Слизерин " +
                ", хитрость " + cunning +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + lustForPower +
                '}';
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;

    }
}




