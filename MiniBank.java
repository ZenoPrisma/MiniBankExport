import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class MiniBank {
    private Connection conn;
    public static void main(String[] args) throws Exception {
        final String url = "jdbc:oracle:thin:@//localhost:1521/MF19";
        final String user = "mf_manager";
        final String password = "mf_manager";

         try {
            MiniBank miniBankAdministration = new MiniBank(url, user, password);
            miniBankAdministration.startMiniBankAdministration();
         } catch (Exception e) {
            System.out.println("Connection couldnt be established: " + e.getMessage());
            return;
         }
    }

    public MiniBank(String url, String user, String password) throws SQLException {
        this.conn = DriverManager.getConnection(url, user, password);
        new MiniBankController(conn);
        System.out.println("Connected!");
        System.out.println("Welcome to the MiniBank!");
    }

    /*
     * Erstes switch case zum anmelden
     * case1: Admin
     * case2: vorhandener Nutzer
     * case3: neuer nutzer
     */

    public void startMiniBankAdministration() {
        Scanner sc = new Scanner(System.in);
        MiniBankController bankController;

        try {
            boolean running = true;
            bankController = new MiniBankController(conn);
            while (running) {
                System.out.println("");
                System.out.println("Welcome to the miniBank");
                System.out.println("1. Insert new Customer");
                System.out.println("2. Pay out of Account");
                System.out.println("3. Pay in to Account");
                System.out.println("4. Show specific Customer data");
                System.out.println("5. Show all Customer data");
                System.out.println("6. Change Customer data");
                System.out.println("7. Stop programm");

                int option = sc.nextInt();
                sc.nextLine(); 

                switch (option) {
                    case 1:
                        //TODO MiniBankController.addCustomer();
                        break;
                    case 2:
                        //TODO MiniBankController.doPayOut(sc); //Registered Customers only
                        break;
                    case 3:
                        //TODO MiniBankController.doPayIn(sc); //Registered Customers only
                        break;
                    case 4:
                        //TODO MiniBankController.showCustomerData(); //Registered Customers only
                        break;
                    case 5:
                        //TODO MiniBankController.showCustomerData(); //All Customer Data (ADMIN ONLY)
                        break;
                    case 6:
                        //TODO MiniBankController.changeCustomerData(); //ADMIN ONLY
                        break;
                    case 7:
                        System.out.println("Stopping the Programm...");
                        running = false;
                        return;
                    default:
                        System.out.println("Invalid Input, please try again!");
                }            
            }
        } catch (Exception e) {
            System.out.println("An Database error occured!: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
