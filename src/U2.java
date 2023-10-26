public class U2 extends Rocket {
    private double chanceOfLaunchExplosion;
    private double chanceOfLandingCrash;

    public U2() {
        this.maxWeight = 29_000;
        this.currentWeight = 11_000;
        this.weight = 11_000;
        this.setCost(1_200_000);
    }

    @Override
    public boolean launch() {
        double random = Math.random() ;
        chanceOfLaunchExplosion = 0.04 * (((double) currentWeight - (double) weight) / (double) maxWeight);
        return random > chanceOfLaunchExplosion;
    }

    @Override
    public boolean land() {
        double random = Math.random() * 0.01;
        chanceOfLandingCrash =  0.08 * (((double) currentWeight - (double) weight) / (double) maxWeight);
        return random > chanceOfLandingCrash;
    }
}
