package design.patterns;


class Config {
    private static Config instance = null;
    
    private int status;
    
    private Config() {
    }
    
    public static synchronized Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}

public class SingletonPattern {
    public static void main(String[] args) {
        Config config = Config.getInstance();
        config.setStatus(3);
        System.out.println(config.getStatus());
        
        Config config2 = Config.getInstance();
        System.out.println(config2.getStatus());
        
        
    }
}
