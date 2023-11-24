public class Item {
    private int weight;
    private String name;

    public Item (int weight, String name) {
        setWeight(weight);
        setName(name);
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
