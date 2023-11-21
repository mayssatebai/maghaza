package Esprit.gestion_employee;

public class Caisser extends  Employe{
 private int numeroDeCaisse;
    public Caisser(int id, String nom, String adresse, int nbr_heures, int numeroDeCaisse ) {
        super(id, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }
    public void setNumeroDecaisse(int numeroDeCaisse){
        this.numeroDeCaisse=numeroDeCaisse;
    }
    public float getNumeroDecaisse(){
        return numeroDeCaisse;
    }
    public String toString(){
        return super.toString() + "numDecaisse" +numeroDeCaisse;
    }


    public double calculerSalaire() {
        double salaire;
        if(getNbr_heures()<180){
            salaire=getNbr_heures()*5;
        }
        else{
            salaire=(getNbr_heures()*5)+(getNbr_heures()*0.5*10);
        }
return salaire;
    }
}
