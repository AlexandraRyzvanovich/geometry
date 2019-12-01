package registrator;

import entity.TriangleParams;
import observable.TriangleObservable;
import utils.TriangleCalculator;

import java.util.HashMap;
import java.util.Map;

public class Registrator implements Observer<TriangleObservable> {
    public final Map<Long, TriangleParams> triangleParamsMap = new HashMap<>();
    private final TriangleCalculator calculator;

    private static Registrator instance;

    public Registrator(TriangleCalculator calculator) {
        this.calculator = calculator;
    }

    public static Registrator getInstance() {
        if(instance == null) {
            instance = new Registrator(new TriangleCalculator());
        }
        return instance;
    }

    @Override
    public void update(TriangleObservable triangle) {
        double perimeter = calculator.calculatePerimeter(triangle);
        double square = calculator.calculateSquare(triangle);
        TriangleParams params = new TriangleParams(perimeter, square);

        triangleParamsMap.replace(triangle.getId(), params);
    }
}
