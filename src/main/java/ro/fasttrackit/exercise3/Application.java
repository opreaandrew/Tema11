package ro.fasttrackit.exercise3;

import java.util.Map;

public class Application {
    private final Double size;
    private final Map<String, String> users;
    private final Boolean isInstalledInDocker;

    public Application(Double size, Map<String, String> users, Boolean isInstalledInDocker) {
        this.size = size;
        this.users = users;
        this.isInstalledInDocker = isInstalledInDocker;
    }

    public Double getSize() {
        return size;
    }

    public Map<String, String> getUsers() {
        return users;
    }

    public Boolean getInstalledInDocker() {
        return isInstalledInDocker;
    }
}
