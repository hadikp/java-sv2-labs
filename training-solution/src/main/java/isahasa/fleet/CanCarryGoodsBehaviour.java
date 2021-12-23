package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {

    private int cargoWeight;
    private int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) { //rakomány súlya
        int restWeight = 0;
        if (maxCargoWeight - cargoWeight >= 0) {
            this.cargoWeight = cargoWeight;
        }
        if (maxCargoWeight - cargoWeight < 0) {
            this.cargoWeight = maxCargoWeight;
            restWeight = cargoWeight - maxCargoWeight;
        }
        return restWeight;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
