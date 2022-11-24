public class ForestElf implements WildElf {

    @Override
    public void hideInGrass() {
        System.out.println("[The elf has turned into grass...]");
    }

    @Override
    public void daggerAttack() {
        System.out.println("[The elf is attacking by dagger!]");
    }
}
