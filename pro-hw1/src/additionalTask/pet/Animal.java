//    private long animalId;
//    private String animalType;
//    private String breed;
//    private String nickname;
//    private double weight;
//    private LocalDate birthdate;
//    private String color;
//    private boolean isIll;
//    private Gender gender = Gender.UNKNOWN;
//    private boolean hasVaccinateCertificate;

package additionalTask.pet;

import java.time.LocalDate;

public class Animal {
    public static long id = 0;
    private long animalId;
    private String animalType;
    private String breed;
    private String nickname;
    private double weight;
    private LocalDate birthdate;
    private String color;
    private boolean isIll;
    private Gender gender = Gender.UNKNOWN;
    private boolean hasVaccinateCertificate;

    public void setAnimalId(long animalId) {
        this.animalId = animalId;
    }

    public Animal() {
        this.animalId = id++;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setHasVaccinateCertificate(boolean hasVaccinateCertificate) {
        this.hasVaccinateCertificate = hasVaccinateCertificate;
    }

    public long getAnimalId() {
        return animalId;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBreed() {
        return breed;
    }

    public String getNickname() {
        return nickname;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getColor() {
        return color;
    }

    public boolean isIll() {
        return isIll;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isHasVaccinateCertificate() {
        return hasVaccinateCertificate;
    }
}
