package model;

import java.util.ArrayList;

/**
 * Created by Geo on 1/1/2017.
 */

public class Department extends AbstractBeaconObservable {

    private String name;
    private String details;
    private ArrayList<Artefact> artefacts;

    public Department(){

    }

    public Department(String name, String details, ArrayList<Artefact> artefacts) {
        this.name = name;
        this.details = details;
        this.artefacts = artefacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ArrayList<Artefact> getArtefacts() {
        return artefacts;
    }

    public void setArtefacts(ArrayList<Artefact> artefacts) {
        this.artefacts = artefacts;
    }
}
