package agh.ics.oop;
import agh.ics.oop.model.Animal;
import agh.ics.oop.model.MapDirection;
import agh.ics.oop.model.MoveDirection;
import agh.ics.oop.model.Vector2d;
import java.util.List;

public class World {

    public static void main (String[] args) {
        Animal test = new Animal(new Vector2d(1,2));
        System.out.println(test.getPosition());
        List<MoveDirection> directions = OptionsParser.Parse(args);
        List<Vector2d> positions = List.of(new Vector2d(2,2), new Vector2d(3,4));
        Simulation simulation = new Simulation(positions, directions);
        simulation.run();
    }
}
