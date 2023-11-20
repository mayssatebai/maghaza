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


}
