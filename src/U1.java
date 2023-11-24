public class U1 extends Rocket {

    public U1() {
        this.maxWeight = 18_000;
        this.currentWeight = 10_000;
        this.weight = 10_000;
        this.setCost(1_000_000);
    }

    @Override
    public boolean launch() {
        double random = Math.random();
        double chanceOfLaunchExplosion = 0.05 * (((double) currentWeight - (double) weight) / maxWeight);
        return random > chanceOfLaunchExplosion;
    }

    @Override
    public boolean land() {
        double random = Math.random() * 0.01;
        double chanceOfLandingCrash = 0.01 * (((double) currentWeight - (double) weight) / maxWeight);
        return random > chanceOfLandingCrash;
    }
}
