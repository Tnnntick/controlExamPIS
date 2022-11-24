public class UrbanElfAdapter implements WildElf {
    UrbanElf urbanElf;

    public UrbanElfAdapter(UrbanElf urbanElf) {
        this.urbanElf = urbanElf;
    }


    @Override
    public void hideInGrass() {
        urbanElf.hideInCity();
    }

    @Override
    public void daggerAttack() {
        System.out.println("[The elf is attacking by dagger!]");
    }
}
