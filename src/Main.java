import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        Simulation simulation = new Simulation();
        ArrayList phase1Load = simulation.loadItems("phase1");
        ArrayList loadU1Phase1 = simulation.loadU1(phase1Load);
        int budgetU1 = simulation.runSimultaion(loadU1Phase1);

        ArrayList phase2Load = simulation.loadItems("phase2");
        ArrayList loadU1Phase2 = simulation.loadU1(phase2Load);
        budgetU1 = simulation.runSimultaion(loadU1Phase2);

        ArrayList phase1LoadU2 = simulation.loadItems("phase1");
        ArrayList loadU2Phase1 = simulation.loadU1(phase1LoadU2);
        int budgetU2 = simulation.runSimultaion(loadU2Phase1);

        ArrayList phase2LoadU2 = simulation.loadItems("phase2");
        ArrayList loadU2Phase2 = simulation.loadU1(phase2LoadU2);
        budgetU1 = simulation.runSimultaion(loadU2Phase2);
        System.out.println("Simulation budget for rocket U1 is: " + budgetU1 + "$");
        System.out.println("Simulation budget for rocket U1 is: " +budgetU2 + "$");
        if(budgetU2 > budgetU1){
            System.out.println("Rocket U1 is cheaper to start");
        } else {
            System.out.println("Rocket U2 is cheaper to start");
        }
    }
}