package registrator;

import entity.TriangleParams;
import observable.TriangleObservable;
import observer.Observer;
import utils.TriangleCalculator;

import java.util.HashMap;
import java.util.Map;

public class Registrator implements Observer<TriangleObservable> {
    Map<Long, TriangleParams> triangleParamsMap;
    TriangleCalculator calculator;

    public Registrator() {
        this.triangleParamsMap = new HashMap<>();
        this.calculator = new TriangleCalculator();
    }

    @Override
    public void update(TriangleObservable triangle) {
        double perimeter = calculator.calculatePerimeter(triangle);
        double square = calculator.calculateSquare(triangle);
        TriangleParams params = new TriangleParams(perimeter, square);

        triangleParamsMap.replace(triangle.getId(), params);
    }
}
