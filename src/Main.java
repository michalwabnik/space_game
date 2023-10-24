import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        Simulation ble = new Simulation();
        //ble.loadU1(ble.loadItems());
        ArrayList tescik1 = ble.loadItems();
        ArrayList jakis = ble.loadU1(tescik1);
        ble.runSimultaion(jakis);
    }
}