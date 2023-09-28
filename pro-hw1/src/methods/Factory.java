/* 2 Создайте класс Завод.
 Класс будет производить три вида автомобилей (иметь 3 метода) – спорткар, грузовик, легковой.
 В основной программе создайте несколько автомобилей с помощью класса Завод.
 */

package methods;

import methods.defaults.AutoType;

public class Factory {
    public static Auto productLorry(
            int horsePower,
            String manufacturer, String model)
    {
        Auto outAuto = new Auto();
        outAuto.type = AutoType.LORRY;
        outAuto.setHorsePower(horsePower);
        outAuto.setManufacturer(manufacturer);
        outAuto.setModel(model);

        return outAuto;
    }
    public static Auto productSedan(
            int horsePower,
            String manufacturer, String model)
    {
        Auto outAuto = new Auto();
        outAuto.type = AutoType.SEDAN;
        outAuto.setHorsePower(horsePower);
        outAuto.setManufacturer(manufacturer);
        outAuto.setModel(model);

        return outAuto;
    }
    public static Auto productSportsCar(
            int horsePower,
            String manufacturer, String model)
    {
        Auto outAuto = new Auto();
        outAuto.type = AutoType.SPORTS_CAR;
        outAuto.setHorsePower(horsePower);
        outAuto.setManufacturer(manufacturer);
        outAuto.setModel(model);

        return outAuto;
    }

}
