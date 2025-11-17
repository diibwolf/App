
public class Test {
    public static void main (String[] agrs){
        int[] tab = new int[10];
        int i = 0;
        int somme = 0;

        while (i < tab.length){
            tab[i] = i+1;
            somme = somme + tab[i];
            System.out.print(tab[i] + " " );
            i++;
        }
        System.out.print("\n la somme totale : " + somme);
    }
}
