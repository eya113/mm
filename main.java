package tp33;
class Personne {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private int telephone;

    public Personne(int id, String nom, String prenom, String email, String adresse, int telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public void afficher() {
        System.out.println("id : " + id);
        System.out.println("nom : " + nom);
        System.out.println("prenom : " + prenom);
        System.out.println("email : " + email);
        System.out.println("adresse : " + adresse);
        System.out.println("telephone : " + telephone);
    }
}

class Etudiant extends Personne {
    private double moyenne;

    public Etudiant(int id, String nom, String prenom, String email, String adresse, int telephone, double moyenne) {
        super(id, nom, prenom, email, adresse, telephone);
        this.moyenne = moyenne;
    }

    public void afficher() {
        super.afficher();
        System.out.println("moyenne : " + moyenne);
    }
}

class Employe extends Personne {
    private double salaire;

    public Employe(int id, String nom, String prenom, String email, String adresse, int telephone, double salaire) {
        super(id, nom, prenom, email, adresse, telephone);
        this.salaire = salaire;
    }

    public void afficher() {
        super.afficher();
        System.out.println("salaire : " + salaire);
    }
}

public class main  {

    public static void Main(String[] args) {
        Employe z = new Employe(2, "eya", "rmedi", "eya@gmail", "rue", 55, 1500.00);
        Etudiant x = new Etudiant(5, "yasmin", "medi", "yasmin@gmail", "ruee", 56, 15.00);

        System.out.println("Employé :");
        z.afficher();
        System.out.println("\nEtudiant :");
        x.afficher();
    }
}
