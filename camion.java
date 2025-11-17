public class camion extends voitures{
    String couleur ;
    public camion (String marque , String modele, String matricule, String couleur){
        super (modele, matricule, couleur);
        this.couleur = couleur;
    }
    public void couleur() {
        System.out.println("couleur : " + couleur);
    }

    public static void main(String[] agrs){
        camion c1 = new camion("mrs", "2006", "jhs2js", "red");
        camion c2 = new camion("mrs", "2025", "hwu23k", "black");
        camion c3 = new camion("mrs", "2000", "finbw1b", "white");
        camion c4 = new camion("mrs", "2025", "ubnxy2", "black");
        System.out.println("camine 1 : ");
        c1.affichez();
        c1.couleur();
        System.out.println("");
        System.out.println("camine 2 : ");
        c2.affichez();
        c2.couleur();
        System.out.println("");
        System.out.println("camine 3 : ");
        c3.affichez();
        c3.couleur();
        System.out.println("");
        System.out.println("camine 4 : ");
        c4.affichez();
        c4.couleur();
    }
}
