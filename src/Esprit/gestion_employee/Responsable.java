package Esprit.gestion_employee;

public class Responsable extends Employe {
private float prime;
    public Responsable(int id, String nom, String adresse, int nbr_heures, float prime ) {
        super(id, nom, adresse, nbr_heures);
        this.prime=prime;
    }
    public void setPrime(float prime){
        this.prime=prime;
    }
    public float getPrime(){
        return prime;
    }
    public String toString(){
        return super.toString() + "prime :" +prime;
    }

}
