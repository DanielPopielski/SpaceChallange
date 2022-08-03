public class Rocket implements SpaceShip{

    int cost;
    int weight;
    int chanceOfLaunchExplosion;
    int chanceOfLandingCrash;
    int maxWeight;
    int currentWeight;


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
        if (this.maxWeight < this.currentWeight + item.weight) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int carry(Item item) {
        this.currentWeight += item.weight;
        return this.currentWeight;
    }
}
