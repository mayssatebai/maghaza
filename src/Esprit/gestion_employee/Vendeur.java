package Esprit.gestion_employee;

public class Vendeur extends Employe{
    private float tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbr_heures, float tauxDeVente ) {
        super(id, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }
        public void setTauxDeVente(float tauxDeVente){
            this.tauxDeVente=tauxDeVente;
        }
        public float getTauxDeVente(){
            return tauxDeVente;
        }
        public double calculerSalaire(){
        double salaire;
        salaire=450*(getTauxDeVente()/100);
        return salaire;
    }

    }

