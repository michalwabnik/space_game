public class U2 extends Rocket {
    private double chanceOfLaunchExplosion;
    private double chanceOfLandingCrash;

    public U2() {
        this.maxWeight = 18000;
        this.currentWeight = 10000;
/*        this.chanceOfLaunchExplosion = 0.05 * (currentWeight / maxWeight);
        this.chanceOfLandingCrash = 0.01 * (currentWeight / maxWeight);*/
    }

    @Override
    public boolean launch() {
        double random = Math.random();
        chanceOfLaunchExplosion = 0.05 * (currentWeight / maxWeight);
        return random > chanceOfLaunchExplosion;
    }

    @Override
    public boolean land() {
        double random = Math.random();
        chanceOfLandingCrash = 0.01 * (currentWeight / maxWeight);
        return random > chanceOfLandingCrash;
    }
}
