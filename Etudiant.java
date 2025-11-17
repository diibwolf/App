public class Etudiant{
    String nom;
    double note1;
    double note2;

    public Etudiant (String nom, double note1, double note2){
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
    }

    public double moyenne() {
        return (note1 + note2 )/2;
    }

    public static void main (String[] args){
        Etudiant e1 = new Etudiant("zakaria", 14.01 , 13.00);
        Etudiant e2 = new Etudiant("khalid", 19.15 , 12);
        Etudiant e3 = new Etudiant("saad", 9.4 , 10);

        System.out.println("la note et 1 : " + e1.moyenne());
        System.out.println("la note et 2 : " + e2.moyenne());
        System.out.println("la note et 3 : " + e3.moyenne());
    }
}
