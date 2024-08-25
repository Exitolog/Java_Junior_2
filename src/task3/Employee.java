package task3;

import java.util.UUID;




@Entity
@Table(name = "users")
public class Employee {

    public Employee(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    @Column(name = "id", primaryKey = true)
    private UUID id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "email")
    private  String email;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
