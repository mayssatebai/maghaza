package Esprit.Test;

import Esprit.entite.Produit;
import Esprit.gestion.Magasin;
import Esprit.gestion_employee.Caisser;
import Esprit.gestion_employee.Employe;
import Esprit.gestion_employee.Responsable;
import Esprit.gestion_employee.Vendeur;

import java.util.Date;

public class Test {
    public static void main (String[] arg){
        Produit p1=new Produit();
        System.out.println(p1.getIdentifiant());
        System.out.println(p1.getLibelle());
        System.out.println(p1.getMarque());
        System.out.println(p1.getPrix());
        Produit p2=new Produit(1200, "Lait","Delice");
        System.out.println(p2.getIdentifiant());
        System.out.println(p2.getLibelle());
        System.out.println(p2.getMarque());
        Produit p3=new Produit(2510, "Yaourt","Vitalait");
        System.out.println(p3.getIdentifiant());
        System.out.println(p3.getLibelle());
        System.out.println(p3.getMarque());
        Produit p4=new Produit(3250, "Tomate","Sicam",1.200f);
        System.out.println(p4.getIdentifiant());
        System.out.println(p4.getLibelle());
        System.out.println(p4.getMarque());
        System.out.println(p4.getPrix());
        Produit p5=new Produit(3274, "rihab","mayssa",1.300f);
        System.out.println(p4.getIdentifiant());
        System.out.println(p4.getLibelle());
        System.out.println(p4.getMarque());
        System.out.println(p4.getPrix());

        p1.afficher();
        p2.afficher();
        p3.afficher();

        p3.setPrix(0.7f);
        p3.setPrix(0.1f);
        p3.setPrix(0.5f);
        p2.afficher();
        p3.afficher();
        p4.afficher();
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        Date d1=new Date();
        p2.setDate_exp(d1);
        p3.setDate_exp(d1);
        p4.setDate_exp(d1);
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        Magasin m1=new Magasin(1,"Ariana");
        m1.Ajouter(p3);
        m1.Ajouter(p2);
        m1.Ajouter(p4);
        m1.Ajouter(p5);
        m1.AfficherMG();
        System.out.println(m1.supprimer(p5));
         m1.AfficherMG();
        System.out.println(m1.supprimer(p4));
        m1.AfficherMG();

        Magasin magasin1=new Magasin(1,"carrefour","centre ville ");
        Magasin magasin2=new Magasin(2,"monprix","manzah 6");

        Caisser cassaier1=new Caisser(1, "riri","3abla",24,124);
        Caisser cassaier2=new Caisser(2, "sousou","laouina",1,125);
        Vendeur vendeur1=new Vendeur(2, "mary","marsa",7,12500);
        Responsable responsable1=new Responsable(1,"jhon","3abdou",12,140);
        magasin1.AjouterEmploye(cassaier1);
        magasin1.AjouterEmploye(cassaier2);
        magasin1.AjouterEmploye(vendeur1);
        magasin1.AjouterEmploye(responsable1);
        Caisser cassaier3=new Caisser(3, "chouchou","tborsek",2,126);
        Vendeur vendeur2=new Vendeur(3, "mahmoud","haytadha",7,12500);
        Vendeur vendeur3=new Vendeur(4, "chifa","sidibou",7,1285200);
        Vendeur vendeur4=new Vendeur(5, "ayoub","bendaha",7,125854210);
        Responsable responsable2=new Responsable(25,"ryhab","lagoulette",10,1500);
        magasin2.AjouterEmploye(cassaier3);
        magasin2.AjouterEmploye(vendeur2);
        magasin2.AjouterEmploye(vendeur3);
        magasin2.AjouterEmploye(vendeur4);
        magasin2.AjouterEmploye(responsable2);

        System.out.println(cassaier1.toString());
        System.out.println(responsable1.toString());

        Produit produit1=new Produit(1400,"eau","safiya",8.50f);
        Produit produit2=new Produit(1500,"huile","nejma",1220);
         magasin1.Ajouter(produit1);
        magasin2.Ajouter(produit2);
        magasin1.AfficherMG();
        magasin2.AfficherMG();















    }
}
