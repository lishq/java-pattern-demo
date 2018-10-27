package factoryAbstract;

public enum HumanEnum {

    FemaleBlackHuman("com.design.demo.factoryAbstract.FemaleBlackHuman"),

    MaleBlackHuman("com.design.demo.factoryAbstract.MaleBlackHuman"),

    FemaleWhiteHuman("com.design.demo.factoryAbstract.FemaleWhiteHuman"),

    MaleWhiteHuman("com.design.demo.factoryAbstract.MaleWhiteHuman"),

    FemaleYellowHuman("com.design.demo.factoryAbstract.FemaleYellowHuman"),

    MaleYellowHuman("com.design.demo.factoryAbstract.MaleYellowHuman");

    String className;

    HumanEnum(String className) {
        this.className = className;
    }

    public String getValue() {
        return className;
    }
}
