package com.nyansapo.client_service.models;

//importing necessary libraries
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "\"Client\"")
public class Client {

    //user class attributes
    private @Id @GeneratedValue Long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Portfolio> portfolioList;

    @OneToOne(targetEntity = Order.class, cascade = CascadeType.ALL)
    private Order order;


    //user constructor
    public Client() {
    }


    //user constructor which takes user name, email and password.
    public Client(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //user constructor which takes user email and password.
    public Client(String email, String password) {
        this.email = email;
        this.password = password;
    }


    /***
     * Getters and Setters
     * @return
     */


    public Long getId(){
        return  this.id;
    }

    public void setId(Long id){ this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Methods
     * @return
     */
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                "\nname=" + name +
                "\nemail=" + email +
                '}';
    }

}
