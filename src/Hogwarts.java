import java.util.Objects;

public class Hogwarts {
    private String name;
    private String surname;
    private int thePowerOfMagic;
    private int transgressionDistance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return thePowerOfMagic == hogwarts.thePowerOfMagic && transgressionDistance == hogwarts.transgressionDistance && Objects.equals(name, hogwarts.name) && Objects.equals(surname, hogwarts.surname);
    }

    public void compareGriffindorStudents(Gryffindor s2) {
        if (this.equals(s2)) {
            System.out.println("Попытка сравнить одинакового студента ");
        } else {
            System.out.println("одинаковая статистика");
        }
    }


    public Hogwarts(String name, String surname, int thePowerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }


    @Override
    public String toString() {
        return "Хогвадс " +
                "Имя " + name + '\'' +
                ", Фамилия " + surname + '\'' +
                ", сила магии " + thePowerOfMagic +
                ", расстояние трансгрессии " + transgressionDistance +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}
