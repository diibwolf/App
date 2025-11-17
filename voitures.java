public class voitures {
    String marque;
    String modele;
    String matricule;

    public voitures (String marque, String modele, String matricule){
        this.marque = marque;
        this.modele = modele;
        this.matricule = matricule;
    }


    public void affichez(){
        System.out.println("marque : " + marque);
        System.out.println("modele : " + modele);
        System.out.println("matricule : " + matricule);
    }

}
