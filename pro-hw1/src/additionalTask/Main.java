// Doctor
// 1.1 Name // Имя
// 1.2 Surname // Имя
//2. Schedule // График
//3. Specialization // Специализация
//4. Work experience // Опыт
//5. Rating // Рейтинг

package additionalTask;

import additionalTask.owner.Owner;
import additionalTask.pet.Animal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Scanner SCN = new Scanner(System.in);

    public static void main(String[] args) {
        fillInOwnerData();
    }

    /**
     * Принимает от пользователя данные о животном
     * @return экземпляр класса Animal
     */
    private static Animal fillInAnimalData() {
        Animal animal = new Animal();
        System.out.print("Введите тип животного | # for exit : ");
        String tmpType = SCN.nextLine();
        System.out.println(" ");
        tmpType = SCN.nextLine();
        if (Character.compare(tmpType.charAt(0), '#') == 0) {
            return null;
        }
        animal.setAnimalType(tmpType);
        System.out.println("Введите породу животного");
        animal.setBreed(SCN.nextLine());
        System.out.println("Введите кличку животного");
        animal.setNickname(SCN.nextLine());
        System.out.println("Введите вес животного");
        animal.setWeight(SCN.nextDouble());
        System.out.println("Введите год рождения животного");
        int year = SCN.nextInt();
        System.out.println("Введите числом месяц рождения животного");
        int month = SCN.nextInt();
        System.out.println("Введите числом день рождения животного");
        int day = SCN.nextInt();
        animal.setBirthdate(LocalDate.of(year, month, day));

        return animal;
    }

    private static Owner fillInOwnerData() {
        // TODO написать ввод данных о владельце питомца
        Owner tmpOwner = new Owner();

        System.out.println("Please, enter customer data --");
        System.out.print("Name : ");
        tmpOwner.setName(SCN.nextLine());
        System.out.print("Surname : ");
        tmpOwner.setSurname(SCN.nextLine());
        System.out.println("Birth Date (yyyy/mm/dd) : ");
        String[] tmpDate = SCN.nextLine().split("/");
        System.out.println(Arrays.toString(tmpDate));
        tmpOwner.setBirthDate(LocalDate.of(
                Integer.parseInt(tmpDate[0]),
                Integer.parseInt(tmpDate[1]),
                Integer.parseInt(tmpDate[2])
        ));
        System.out.println("Full address : ");
        tmpOwner.setAddress(SCN.nextLine());
        System.out.print("Mob Number with country code : +");
        tmpOwner.setMobNumber(SCN.nextLong());
        Animal animal = null;
        do {
            animal = fillInAnimalData();
            if (animal != null) {
                tmpOwner.setCollectionOfAnimals(animal);
            }
        } while (animal != null);
        System.out.println(tmpOwner.toString());

        return null;
    }
}