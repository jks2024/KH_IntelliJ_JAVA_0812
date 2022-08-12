package 자동차종합연습;
public class SportsCar extends Car {
    public SportsCar(String name) {
        this.name = name;
        this.maxSpeed = 250;
        this.fuelEff = 8;
        this.fuelTank = 30;
        this.seatCnt = 2;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) maxSpeed *= 1.2;
    }
}
