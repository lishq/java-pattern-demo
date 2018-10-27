package com.design.demo.factoryAbstract;

public class MaleHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createBlackHuman() {
        return createHuman(HumanEnum.MaleBlackHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return createHuman(HumanEnum.MaleWhiteHuman);
    }

    @Override
    public Human createYellowHuman() {
        return createHuman(HumanEnum.MaleYellowHuman);
    }
}
