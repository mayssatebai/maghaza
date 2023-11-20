package Esprit.entite;

import java.util.Date;
public class Produit {
    private int identifiant;
    private String libelle , marque;
    private float prix;
    private Date date_exp;

    public Produit(){

    }
    public void getIdentifiant(int identifiant){
        this.identifiant=identifiant;
    }
    public int getIdentifiant(){
        return identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
public void setMarque(String marque){
        this.marque=marque;
}
public String getMarque(){
        return marque;
}

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if (prix>0){
            this.prix = prix;
        }
        else {
            System.out.println("le prix doit etre positif");
        }

    }

    public Date getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(Date date_exp) {
        this.date_exp = date_exp;
    }

    public Produit(int id, String li, String ma){
        this.identifiant=id;
        this.libelle=li;
        this.marque=ma;
    }
    public Produit(int id, String li, String ma, float p){
        this.identifiant=id;
        this.libelle=li;
        this.marque=ma;
        this.prix=p;
    }
    public Produit(int id, String li, String ma, float p,Date date_exp){
        this.identifiant=id;
        this.libelle=li;
        this.marque=ma;
        this.prix=p;
        this.date_exp=date_exp;
    }
    public void afficher(){
        System.out.println("id :" +this.identifiant);
        System.out.println("libelle :" +this.libelle);
        System.out.println("marque :" +this.marque);
        System.out.println("prix :" +this.prix);
    }
    public String toString(){
        return "id: " +identifiant+
                " libelle: " +libelle+
                " marque: " +marque+
                " prix: " +prix+
        " date: " +date_exp;
    }
    public boolean comparer(Produit p){
        if(this.identifiant==p.identifiant && this.libelle==p.libelle && this.prix==p.prix)
            return true;
            return false;

        }
    public static boolean comparer(Produit p1 , Produit p2){
        if(p1.identifiant==p2.identifiant &&p1.libelle==p2.libelle &&p1.prix==p2.prix)
            return true;
           return false;
    }

    }


