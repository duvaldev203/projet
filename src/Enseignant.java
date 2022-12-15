import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("eda5e2ad-2c63-4192-98ef-132b1c6df5f8")
public class Enseignant extends Utilisateur {
    @objid ("9627b316-906f-420a-878f-95d58ef2508b")
    public List<Reservation> Effectuer = new ArrayList<Reservation>();

    @objid ("e989b149-cc51-46c6-a639-c85b77b1d7db")
    public Enseignant(final String id, final String nom, final String email, final int tel) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.tel = tel;
    }

    @objid ("d6937383-1688-44fd-8938-1a9db099dc44")
    protected void finalize() {
        System.out.println("L'enseignant a ete detruit");
    }

    @objid ("2e2d3b07-560a-4ad6-9e4c-9f0dba4a8c6a")
    public void demande_reservation() {
    }

}
