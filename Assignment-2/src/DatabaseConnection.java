public class DatabaseConnection {
    
    private static DatabaseConnection instance;
    
    private DatabaseConnection() {
    }
    
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
    
    public void connect() {
        System.out.println("Connected");
    }
    
    public void disconnect() {
        System.out.println("Disconnected");
    }
}