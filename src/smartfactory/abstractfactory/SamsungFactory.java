package smartfactory.abstractfactory;

public class SamsungFactory implements SmartphonePartsFactory {
    @Override
    public String brand() { return "Samsung"; }

    @Override
    public CPU createCpu() { return () -> "Exynos"; }

    @Override
    public OS createOs() { return () -> "Android"; }

    @Override
    public Display createDisplay() { return () -> "AMOLED"; }
}