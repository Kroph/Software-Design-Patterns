public class Main {
    public static void main(String[] args) {
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        System.out.println("Are both connections instance? " + (conn1 == conn2));
        conn1.connect();
        conn2.disconnect();
    }
}
