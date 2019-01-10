package org.fasttrackit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author ttritean
 * @since 1/8/2019
 */
@Entity
public class Student {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String username;


//    private List<Sectie> sectii = new ArrayList();

//    public List<Sectie> getSectii() {
//        return sectii;
//    }
//
//    public void setSectii(List<Sectie> sectii) {
//        this.sectii = sectii;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username == null) {
            throw new IllegalArgumentException("username can not be null.");
        }
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
