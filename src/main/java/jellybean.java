public class jellybean implements staff {
    String name;
    int price;
    int weight;
    String uniqueFeature;
    public jellybean (String name, int price, int weight, String uniqueFeature) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.uniqueFeature = uniqueFeature;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String getUnigueFeature() {
        return uniqueFeature;
    }

}
