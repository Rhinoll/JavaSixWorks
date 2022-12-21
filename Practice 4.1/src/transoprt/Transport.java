package transoprt;

public abstract class Transport
{
    private int speed;
    private int fuel;

    private int priceFuel;
    private double cargoRate;

    private double price;

    public Transport(int speed, int fuel, int priceFuel, double cargoRate)
    {
        this.speed = speed;
        this.fuel = fuel;
        this.priceFuel = priceFuel;
        this.cargoRate = cargoRate;
        price=(fuel*priceFuel)/100;
    }

    public double getPrise()
    {
        return price;
    }

    public int getFuel()
    {
        return fuel;
    }

    public double getCargoRate()
    {
        return cargoRate;
    }

    public int getPriceFuel()
    {
        return priceFuel;
    }

    public int getSpeed()
    {
        return speed;
    }

    @Override
    public abstract String toString() ;
}

