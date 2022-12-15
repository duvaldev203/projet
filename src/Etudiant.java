import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a862a04d-02db-4c41-8aaf-7e32ffecefae")
public class Etudiant extends Utilisateur {
    @objid ("dee4ab8a-0146-4f40-90bc-e936885165bb")
    public List<Ticket> Acheter = new ArrayList<Ticket>();

    @objid ("37602491-b253-4566-a55c-1941c93ff190")
    public Etudiant(final String id, final String nom, final String email, final int tel) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.email = email;
    }

    @objid ("d298078a-bee3-4f01-b66c-e4fc55df9899")
    protected void finalize() {
        System.out.println("L'etudiant est detruit !!!");
    }

    @objid ("58644fc5-c7e1-4a92-ae34-890674793eef")
    public void demande_achat() {
    }

}
