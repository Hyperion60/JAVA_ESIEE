package feuille2.exo.sept;

import java.util.ArrayList;

public class Individu {
    private String nom;
    private String adresse;
    private String numero_telephone;
    private int _id;
    private static int id;
    private static ArrayList<Individu> instance_list;

    public Individu(String nom, String adresse, String numero) {
        this.nom = nom;
        this.adresse = adresse;
        this.numero_telephone = numero;
        this._id = id;
        if (instance_list == null)
            instance_list = new ArrayList<Individu>();
        instance_list.add(this);
    }

    // Getter
    public String getNom() {
        return this.nom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public String getNumero() {
        return this.numero_telephone;
    }

    public int getmyid() {
        return this._id;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Individu> getInstance_list() {
        return instance_list;
    }

    public String toString() {
        return super.toString() + " Nom : " + this.nom + ", Adresse : " + this.adresse + ", Numéro de télephone : " + this.numero_telephone;
    }

    // Setter
    public void setNom(String name) {
        this.nom = name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumero(String numero_telephone) {
        this.numero_telephone = numero_telephone;
    }

    public void setInstance(int num) {
        instance_list.set(num, this);
    }
}
