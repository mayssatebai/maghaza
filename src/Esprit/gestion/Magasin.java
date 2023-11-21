package Esprit.gestion;

import Esprit.entite.Produit;
import Esprit.gestion_employee.Caisser;
import Esprit.gestion_employee.Employe;
import Esprit.gestion_employee.Responsable;
import Esprit.gestion_employee.Vendeur;

public class Magasin {
    int identifiant;
    String adresse, nom;
    final int CAPACITE = 50;
    int i;
    int k;
    private static int totalProduit;
    Produit[] tabp = new Produit[50];
    private final int CAPACITE_EMPLOYE=20;
    Employe[] tabem=new Employe[20];
    public Magasin() {
    }

    public Magasin(int i, String a) {
        this.identifiant = i;
        this.adresse = a;
    }
    public Magasin(int i, String nom,String a) {
        this.identifiant = i;
        this.adresse = a;
        this.nom=nom;
    }

    public void Ajouter(Produit p) {
        if (i < tabp.length) {
            if (!chercher(p)) {
                tabp[i] = p;
                i++;
                totalProduit++;
                System.out.println("produit ajouté merci");
            } else {
                System.out.println("le produit existe ");
            }
        }
    }

    public void AfficherMG() {
        System.out.println("id :" + identifiant);
        System.out.println("adresse :" + adresse);
        System.out.println("nomMg :" + nom);
        for (int i = 0; i < tabp.length; i++) {
            Produit p= tabp[i];
            if (p != null) {
                System.out.println("Nom de produit :" + p.getLibelle());
                System.out.println("prix de produit :" + p.getPrix());
            }
        }
        System.out.println("Employés dans le magasin :");
        for (int j = 0; j < tabem.length; j++) {
            Employe employe = tabem[j];
            if (employe != null) {
                System.out.println("  - Nom de l'employé : " + employe.getNom());
                System.out.println("    Adresse de l'employé : " + employe.getAdresse());
                System.out.println("    Nombre d'heures de l'employé : " + employe.getNbr_heures());
            }
        }
    }

    public static int getTotalproduit() {
        return totalProduit;
    }

    public boolean chercher(Produit p) {
        for (int j = 0; j < i; j++) {
            if (tabp[j] !=null && tabp[j].comparer(p))
                return true;
        }
        return false;
    }
    public int chercherP(Produit p){
        int indice=-1;
        for(int j=0; j<i; j++) {
            if (Produit.comparer(p, tabp[j]))
                return j;
        }
            return indice;
        }

    public boolean supprimer(Produit p)
    {
        boolean test=false;
        int indice=chercherP(p);

        if (indice==-1)
            test=false;
        else {

            for (int j=indice;j<i-1;j++)
            {
                tabp[j]=tabp[j+1];
                tabp[j]=null;
            }
            i--;
            totalProduit--;
            test=true;
        }
        return test;
    }
    public Magasin plusProduit(Magasin m)
    {
        if (this.i>m.i)
            return this;

        else if (this.i<m.i)
            return m;
        return null;
    }

    public String toString()
    {

        String str="L'ensemble des produits :\n";

        for (int j=0;j<i;j++)
            str+=tabp[i]+"\n";

        return "id ="+identifiant+"adresse :"+adresse+str;
    }

    public static Magasin plusProduit(Magasin m,Magasin m1)
    {
        if (m1.i>m.i)
            return m1;

        else if (m1.i<m.i)
            return m;
        return null;
    }
public void AjouterEmploye(Employe employe){
       if(k< tabem.length){
           tabem[k]=employe;
           k++;
           System.out.println("Ajout l'employe avec succes :"  +employe.getNom());

       }
}
public void AfficherSalaire(){
    System.out.println("salaired es employes dans le magasin");
    for(int j=0; j< tabem.length; j++){
        if(tabem[j]!=null){
            System.out.println("employe :" +tabem[j].getNom());
            System.out.println("salaire :" +tabem[j].calculerSalaire());
        }
    }
}
public void AffichePrimeResponsable(){
    System.out.println("afficher prime de responsable");
    for(int j=0; j<tabem.length; j++){
        if(tabem[j] instanceof Responsable){
            System.out.println("Responhsable :" +tabem[j].getNom());
            System.out.println("Prime de responsable :" +((Responsable) tabem[j]).getPrime());
        }
    }
}
public void AfficheNombreEmployeParType(){
        int nbrResopnsable=0;
        int nbrCaisser=0;
        int nbrVendeur=0;
        for(int j=0; j<tabem.length; j++){
            if(tabem[j] instanceof Responsable){
                nbrResopnsable++;
            }
            if(tabem[j] instanceof Caisser){
              nbrCaisser++;
            }
            if(tabem[j] instanceof Vendeur){
                nbrVendeur++;
            }
        }
    System.out.println(" nombre d'employe par type");
    System.out.println(" Responsbale :" +nbrResopnsable);
    System.out.println("Caisser  :" +nbrCaisser);
    System.out.println("Vendeur  :" +nbrVendeur);

    }


}
