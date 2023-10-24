public class U1 extends Rocket {
    private double chanceOfLaunchExplosion;
    private double chanceOfLandingCrash;

  public U1() {
        this.maxWeight = 18000;
        this.currentWeight = 10000;
        this.weight = 10000;
        this.cost = 1_000_000;
/*        this.chanceOfLaunchExplosion = 0.05 * (currentWeight / maxWeight);
        this.chanceOfLandingCrash = 0.01 * (currentWeight / maxWeight);*/
    }

    @Override
    public boolean launch() {
        double random = Math.random();
        chanceOfLaunchExplosion = 0.05 * (((double) currentWeight - (double) weight) / (double) maxWeight);
        return random > chanceOfLaunchExplosion;
    }

    @Override
    public boolean land() {
        double random = Math.random() * 0.01;
        chanceOfLandingCrash =  0.01 * (((double) currentWeight - (double) weight) / (double) maxWeight);
        return random > chanceOfLandingCrash;
    }
}
