/* 2 Создайте класс Завод.
 Класс будет производить три вида автомобилей (иметь 3 метода) – спорткар, грузовик, легковой.
 В основной программе создайте несколько автомобилей с помощью класса Завод.
 */

package methods;

import methods.defaults.AutoType;

public class Factory {
    public static Auto productAuto(
            AutoType type, int horsePower,
            String manufacturer, String model)
    {
        Auto outAuto = new Auto();
        outAuto.type = type;
        outAuto.setHorsePower(horsePower);
        outAuto.setManufacturer(manufacturer);
        outAuto.setModel(model);

        return outAuto;
    }
}
