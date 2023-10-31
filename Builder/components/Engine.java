package Builder.components;

public class Engine {
    private final double volume;
    private double przebieg;
    private boolean started;


    public Engine(double volume, double przebieg)
    {
        this.volume = volume;
        this.przebieg= przebieg;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted()
    {
        return started;
    }

    public void go(double przebieg)
    {
        if(started)
        {
            this.przebieg += przebieg;
        }
        else
        {
            System.err.println("Nie może ruszyć, musisz najpierw włączyć silnik");
        }
    }

    public double getVolume()
    {
        return volume;
    }

    public double getPrzebieg()
    {
        return przebieg;
    }
}

