package Esprit.gestion_employee;

public class Employe {
    private int identifiant;
    private String nom;
    private String adresse;
    private int nbr_heures;
    public Employe(){

    }

public Employe(int id , String nom , String adresse, int nbr_heures){
    this.identifiant=id;
    this.nom=nom;
    this.adresse=adresse;
    this.nbr_heures=nbr_heures;
}

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse(){
    return adresse;
    }
    public void setAdresse(String adresse){
    this.adresse=adresse;
    }

    public int getNbr_heures(){
    return nbr_heures;
    }
    public void setNbr_heures(int nbr_heures){
    this.nbr_heures=nbr_heures;
    }
public String toString(){
        return "id : " +identifiant+  "nom : " +nom+ "adresse : " +adresse+ "nbr_heures : " +nbr_heures;
}
}
