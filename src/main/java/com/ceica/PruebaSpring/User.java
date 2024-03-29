package com.ceica.PruebaSpring;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iduser;
    private String username;
    private String password;
    private Integer idrol;

    public User() {
    }
/*@OneToMany(mappedBy = "iduser",fetch = FetchType.EAGER)
private List<Task>taskList;*/
    @OneToMany(mappedBy = "idrol",fetch = FetchType.EAGER)
    private List<Task>taskList;

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    @Override
    public String toString() {
        return "User{" +
                "iduser=" + iduser +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", idrol=" + idrol +
                ", taskList=" + taskList +
                '}';
    }
}
