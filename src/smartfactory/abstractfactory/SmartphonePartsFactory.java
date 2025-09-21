package smartfactory.abstractfactory;

public interface SmartphonePartsFactory {
    String brand();
    CPU createCpu();
    OS createOs();
    Display createDisplay();
}