public class U1 extends Rocket{
    private double chanceOfLaunchExplosion;
    private double chanceOfLandingCrash;

    public U1() {
        this.maxWeight = 18_750;
        this.currentWeight = 10_000;
        this.chanceOfLaunchExplosion = 0.05 * (currentWeight / maxWeight);
        this.chanceOfLandingCrash = 0.01 * (currentWeight / maxWeight);
    }

    @Override
    public boolean launch() {
        double random = Math.random();
        return random > chanceOfLaunchExplosion;
    }

    @Override
    public boolean land() {
        double random = Math.random();
        return random > chanceOfLandingCrash;
    }
}
