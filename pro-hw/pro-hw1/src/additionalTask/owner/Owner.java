package additionalTask.owner;

import additionalTask.pet.Animal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Owner {

    private long customerId;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String address;
    private long mobNumber;
    private Set<Animal> collectionOfAnimals;

    private static List<Long> allIds;

    {
        customerId  = 0;
        name        = "NoFName";
        surname     = "NoSName";
        address     = "Homeless";
        birthDate   = LocalDate.EPOCH;
        mobNumber   = 0L;
        collectionOfAnimals = new HashSet<Animal>();
    }

    public Owner(
            String name,
            String surname,
            LocalDate birthDate,
            String address,
            long mobNumber
    ){
        if (allIds == null || allIds.isEmpty()){
            this.customerId = 1;
        } else {
            this.customerId = allIds.getLast() + 1;
        }
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.address = address;
        this.mobNumber = mobNumber;
    }

    public Owner() {
        if (allIds == null || allIds.isEmpty()){
            this.customerId = 1;
        } else {
            this.customerId = allIds.getLast() + 1;
        }
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public long getMobNumber() {
        return mobNumber;
    }

    public Set<Animal> getCollectionOfAnimals() {
        return collectionOfAnimals;
    }

    private void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobNumber(long mobNumber) {
        this.mobNumber = mobNumber;
    }

    public void setCollectionOfAnimals(Animal animal) {
        this.collectionOfAnimals.add(animal);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", mobNumber=" + mobNumber +
                ", collectionOfAnimals=" + collectionOfAnimals.size() +
                '}';
    }
}
