package smartfactory.abstractfactory;

public class AppleFactory implements SmartphonePartsFactory {
    @Override
    public String brand() { return "Apple"; }

    @Override
    public CPU createCpu() { return () -> "Apple CPU"; }

    @Override
    public OS createOs() { return () -> "iOS"; }

    @Override
    public Display createDisplay() { return () -> "Retina Display"; }
}