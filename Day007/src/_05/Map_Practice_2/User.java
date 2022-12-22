package _05.Map_Practice_2;

import java.util.Objects;

public class User {
    private String  name;
    private String address;

    @Override
    public String toString() {
        return name +", "+ address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(name, user.name)) return false;
        return Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
