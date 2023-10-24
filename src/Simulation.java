import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Simulation {
    public ArrayList<Item> loadItems(String pathname) throws Exception {
        ArrayList<Item> loadedItems = new ArrayList<Item>();
        String[] row;
        try {
            File file = new File(pathname);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                Item item = new Item();
                row = scanner.nextLine().split("=");
                item.name = row[0];
                item.weight = Integer.parseInt(row[1]);
                loadedItems.add(item);
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
        return loadedItems;
    }
    public ArrayList<Rocket> loadU1(ArrayList<Item> loadedItems) {
        ArrayList<Rocket> u1Rockets = new ArrayList<>();
        Rocket u1Rocket = new U1();
        u1Rockets.add(u1Rocket);
        for(Item item: loadedItems) {
            if(u1Rocket.canCarry(item)) {
                u1Rocket.carry(item);

            } else {
                u1Rocket = new U1();
                u1Rocket.carry(item);
                u1Rockets.add(u1Rocket);
            }
        }
        return u1Rockets;
    }
    public ArrayList<Rocket> loadU2(ArrayList<Item> loadedItems) {
        ArrayList<Rocket> u2Rockets = new ArrayList<>();
        Rocket u2Rocket = new U2();
        u2Rockets.add(u2Rocket);
        for(Item item: loadedItems) {
            if(u2Rocket.canCarry(item)) {
                u2Rocket.carry(item);

            } else {
                u2Rocket = new U1();
                u2Rocket.carry(item);
                u2Rockets.add(u2Rocket);
            }
        }
        return u2Rockets;
    }
    public int runSimultaion(ArrayList<Rocket> rockets) {
        //Simulation ble = new Simulation();
        int budget =0;
        for(int i = 0; i < rockets.size(); i += 0) {
            budget += rockets.get(i).cost;
            if (rockets.get(i).land() && rockets.get(i).launch()) {
                i++;
            }
        }
        return budget;
    }
}
