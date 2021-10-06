package model;

public class Car {

    private String model;
    private String body;
    private double engine;

//    public Car() {
//    }

    public Car(String model, String body, double engine) {
        this.model = model;
        this.body = body;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getBody() {
        return body;
    }

    public double getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", body='" + body + '\'' +
                ", engine=" + engine +
                '}';
    }
}
