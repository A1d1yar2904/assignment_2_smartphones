package smartfactory.factorymethod;

import smartfactory.products.*;

public class SmartphoneFactory {

    public static Smartphone createSmartphone(SmartphoneType type) {
        switch (type) {
            case IPHONE:
                return new Iphone();
            case SAMSUNG:
                return new Samsung();
            case XIAOMI:
                return new Xiaomi();
            default:
                throw new IllegalArgumentException("Unknown smartphone type: " + type);
        }
    }
}