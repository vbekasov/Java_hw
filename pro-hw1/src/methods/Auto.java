/*1 В созданном пакете создайте класс Автомобиль.
 Создайте поля для типа автомобиля – грузовик, спорткар, легковой (можно сделать перечисление),
  мощность двигателя (сколько лошадиных сил), поля для марки и модели автомобиля.
   Одно из полей сделайте публичным, второе – без модификатора доступа, остальные – приватными.
    Создайте объект этого класса в программе и попробуйте установить значения для полей.
 Какие поля возможно установить? Для приватных полей напишите геттеры и сеттеры.
 */

package methods;

import methods.defaults.AutoType;

import java.util.Scanner;

public class Auto {
    public AutoType type;
    int         horsePower;
    private String      manufacturer;
    private String      model;

    {
        type = AutoType.UNKNOWN;
        horsePower = 0;
        manufacturer = "Unknown";
        model = "Unknown";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setManufacturer(String manufacturer) {
        while (manufacturer == null || manufacturer.isEmpty()) {
            Scanner input = new Scanner(System.in);
            System.err.print("Wrong manufacturer. Reenter please: ");
            manufacturer = input.next();
        }

        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        while (model == null || model.isEmpty()) {
            Scanner input = new Scanner(System.in);
            System.err.print("Wrong model. Reenter please: ");
            model = input.next();
        }

        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        while (horsePower < 0) {
            Scanner input = new Scanner(System.in);
            System.err.print("Wrong power. Reenter please: ");
            horsePower = input.nextInt();
        }

        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "type=" + type +
                ", horsePower=" + horsePower +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
