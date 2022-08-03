public class U1 extends Rocket{
    public U1(){
        cost = 100;
        weight = 10000;
        maxWeight = 18000;
        chanceOfLaunchExplosion = 0;
        chanceOfLandingCrash = 0;
    }
    @Override
    public boolean launch() {
        int random = (int)Math.floor(Math.random()*(100+1)+0);
        this.chanceOfLaunchExplosion = 5%((this.currentWeight - this.weight) / (this.maxWeight - this.weight));

        if (random>this.chanceOfLaunchExplosion) {
            return true;
        } else {
            return false;
        }
    }
}
