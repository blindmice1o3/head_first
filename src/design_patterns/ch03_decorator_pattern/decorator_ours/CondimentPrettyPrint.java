package design_patterns.ch03_decorator_pattern.decorator_ours;

public class CondimentPrettyPrint extends CondimentDecorator {

    Beverage beverage;

    public CondimentPrettyPrint(Beverage beverage) {
        this.beverage = beverage;
    }

    // getDescription is where we will implement the bulk of CondimentPrettyPrint's functionality
    public String getDescription() {
        return "";
    }

    public double cost() {
        return 0;
    }

}