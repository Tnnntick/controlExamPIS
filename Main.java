public class Main {
    public static void main(String[] args) {
        ForestElf forestElf = new ForestElf();
        RoyalElf royalElf = new RoyalElf();

        WildElf elfAdapter = new UrbanElfAdapter(royalElf);

        System.out.println("<<Forest elf>>");
        forestElf.daggerAttack();
        forestElf.hideInGrass();

        System.out.println("<<Royal elf>>");
        royalElf.hideInCity();
        royalElf.swordAttack();

        // wild elf behave like a urban elf
        System.out.println("<<Elf adapting>>");
        elfAdapter.hideInGrass();
        elfAdapter.daggerAttack();
    }
}