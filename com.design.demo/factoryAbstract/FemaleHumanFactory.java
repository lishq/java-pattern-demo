package factoryAbstract;

public class FemaleHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createBlackHuman() {
        return createHuman(HumanEnum.FemaleBlackHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return createHuman(HumanEnum.FemaleWhiteHuman);
    }

    @Override
    public Human createYellowHuman() {
        return createHuman(HumanEnum.FemaleYellowHuman);
    }
}
