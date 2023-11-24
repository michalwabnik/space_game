public class Rocket implements SpaceShip {
    int currentWeight;
    int maxWeight;
    int weight;
    private int cost;

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return currentWeight + item.getWeight() <= maxWeight;
    }

    @Override
    public void carry(Item item) {
        currentWeight += item.getWeight();
    }
}
