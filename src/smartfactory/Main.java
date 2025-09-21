package smartfactory;

import smartfactory.factorymethod.*;
import smartfactory.products.*;
import smartfactory.abstractfactory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(SmartphoneFactory.createSmartphone(SmartphoneType.IPHONE).getName());
        System.out.println(SmartphoneFactory.createSmartphone(SmartphoneType.SAMSUNG).getName());
        System.out.println(SmartphoneFactory.createSmartphone(SmartphoneType.XIAOMI).getName());

        System.out.println(new AppleFactory().brand());
        System.out.println(new SamsungFactory().brand());
        System.out.println(new XiaomiFactory().brand());
    }
}