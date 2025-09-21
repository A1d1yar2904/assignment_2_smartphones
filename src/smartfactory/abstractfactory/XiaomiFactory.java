package smartfactory.abstractfactory;

public class XiaomiFactory implements SmartphonePartsFactory {
    @Override
    public String brand() { return "Xiaomi"; }

    @Override
    public CPU createCpu() { return () -> "Snapdragon"; }

    @Override
    public OS createOs() { return () -> "Android (MIUI)"; }

    @Override
    public Display createDisplay() { return () -> "OLED"; }
}