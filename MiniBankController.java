import java.sql.*;
import java.util.*;

public class MiniBankController {
    Scanner sc = new Scanner(System.in);
    private Connection conn;

    public MiniBankController(Connection conn) {
        this.conn = conn;
    }

    public static void addCustomer() {
        //TODO
    }

    public static void changeCustomerData() {
        //TODO
    }

    public List<IPerson> getAllCustomerData() throws SQLException {
        List<IPerson> customerList = new ArrayList<>();
        String sql = "SELECT * FROM YA_Customer ORDER BY ID";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    IPerson customer = new Customer();
                    customer.setID(rs.getInt("ID"));
                    customer.setSurname(rs.getString("Surname"));
                    customer.setName(rs.getString("Name"));
                    customer.setGender(rs.getString("Gender"));
                    customer.setBirthday(rs.getDate("Birthday"));

                    customerList.add(customer);
                }
            }

        return customerList;
    }

    public List<Account> getAccountData() throws SQLException {
        List<Account> accountList = new Arraylist<>();
        String sql = "SELECT * FROM YA_Account ORDER BY ID";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    Account account = new Account();
                    account.setID(rs.getInt("ID"));
                    account.setAccountNumber(rs.getInt("AccountNumber"));
                    account.setBalance(rs.getInt("Balance"));
                    account.setAccountType(rs.getString("AccountType"));

                    accountList.add(account);
                }
            }
        return accountList;
    }

    public List<Account> getAllAccountData() throws SQLException {
        List<Account> accountList = new Arraylist<>();
        String sql = "SELECT customer_id FROM YA_Account ORDER BY ID";
    }
}

/* 
    public static void doPayIn(Scanner sc) {
        if (norbertAccount == null) {
            System.out.println("Customer not created yet!");
            return;
        }

        System.out.println("Please put in the Amount you want to pay in: ");
        double amount = sc.nextDouble();
        
        norbertAccount.payIn(amount);
        System.out.println(amount + "$ were payed in. New balance: " + norbertAccount.getBalance() + "$");
    }
    
    public static void doPayOut(Scanner sc) {
        if (norbertAccount == null) {
            System.out.println("Customer not created yet!");
            return;
        }

        System.out.println("Available amount: " + norbertAccount.getBalance());
        System.out.println("Please put in the Amount you want to pay out: ");
        double amount = sc.nextDouble();
        
        boolean succes = norbertAccount.payOut(amount);
        if (succes) {
            System.out.println(amount + "$ were taken out. New balance: " + norbertAccount.getBalance() + "$");
        } else {
            System.out.println("Not enough amount in bank account!");
        }
    } 
*/


    //TODO

    /* Klassen ansich wurden erstellt -> müssen fertig gestellt werden
     * Implementation von Interface, Vererbung etc in Controller
     * Controller implementation in MiniBank
     * Komplette implementation von MiniBank
Siehe:
Funktionen:
1. Hinzufügen neuer Customer
-> Name
-> Vorname
-> Geschlecht
-> Geburtsdatum
-Account
-> Accountnummer
-> Accounttyp
-> Startgehalt

2. PayIn zum Konto
-> Eingabe des Names sowie die Kontonummer
-> Eingabe des einzuzahlenden Betrags

3. PayOut aus dem Konto
-> Eingabe des Names sowie die Kontonummer
-> Ausgabe des eingegebenen Betrags

4. Ändern von CustomerDaten
-> Neues Konto zum Beispiel
-> Oder namen

5. Auslesen von CustomerDaten
-> Auslesen einzelner Customer
-> Methode die den gesamten Kundenstamm als List<IPerson> Objekt liefert

Speichern der Daten über SQLDeveloper
     * For more infos look into -> or https://ds-vm-csovcs01.nexus.int/NxCollection/EDUCATION.DEV/_git/YearOneFinalAssessment3
     * UML & ERM Diagramm nicht vergessen!
     */