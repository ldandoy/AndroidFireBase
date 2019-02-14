package com.example.loicdandoy.firebase;

/**
 * Created by loicdandoy on 23/11/2018.
 */

public class Tache {

    public Integer id;
    public String label;
    public Boolean status;

    public Tache() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Tache(Integer id, String label, Boolean status) {
        this.id = id;
        this.label = label;
        this.status = status;
    }

}
