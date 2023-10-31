package Builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "775a, Nowa Sarzyna, 37-310 Polska";
    }

    public GPSNavigator(String manualRoute)
    {
        this.route = manualRoute;
    }

    public String getRoute()
    {
        return route;
    }
}
