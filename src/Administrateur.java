import java.util.*;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e550ecb4-72cc-4ebe-a467-16c9970b0c8d")
public class Administrateur {
    @mdl.prop
    @objid ("55317ebc-e10d-4f68-8722-8b52f08d1109")
    private String id;

    @mdl.prop
    @objid ("3f34f472-9a89-4d6a-8986-b681b1f53cd3")
    private String nom;

    @mdl.propgetter
    private String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.nom;
    }

    @mdl.propsetter
    private void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nom = value;
    }

    @objid ("8ba6bf38-3941-44de-a6ca-721d945f1e22")
    public List<Ticket> Valider = new ArrayList<Ticket>();

    @objid ("8b9377d5-ad0c-41eb-ae95-25f1c2235ea1")
    public List<Reservation> valider = new ArrayList<Reservation>();

    @objid ("6fa0f352-ecf0-4e72-bd26-e76e5b8fe6d3")
    public List<Commande> valider = new ArrayList<Commande>();

    @objid ("632d0459-bdf8-401f-b77f-cd1a2a976ac1")
    public void demande_validation() {
    }

}
