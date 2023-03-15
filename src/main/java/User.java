import java.time.LocalDate;
import java.util.Objects;


class User {

    String name;
    LocalDate birthDay;

    public User(String name) {
        this.name = name;
        this.birthDay = null;
    }

    public User(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
