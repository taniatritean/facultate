package org.fasttrackit.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ttritean
 * @since 1/8/2019
 */
@Entity
@Table(name = "sectii")
public class Sectie {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private int maxStudentsAllowed;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "sectie_studenti", joinColumns =
        @JoinColumn(name = "sectie_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Curs> curses = new ArrayList<>();


    public List<Curs> getCurses() {
        return curses;
    }

    public void setCurses(List<Curs> curses) {
        this.curses = curses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        if (students == null) {
            throw new IllegalArgumentException("Invalid list null");
        }
        this.students = students;
    }

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

    public int getMaxStudentsAllowed() {
        return maxStudentsAllowed;
    }

    public void setMaxStudentsAllowed(int maxStudentsAllowed) {
        this.maxStudentsAllowed = maxStudentsAllowed;
    }
}
