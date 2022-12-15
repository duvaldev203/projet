import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.SourceDataLine;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c7a63ccb-e647-473c-9a3e-38f70bd18f9d")
public class Chef_Restaurant {
    @mdl.prop
    @objid ("1607c30a-1368-4c43-9b2e-e8ab96bbf11e")
    private String id;

    @mdl.prop
    @objid ("95a7804f-1336-4837-8e7d-231395c9ef1e")
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

    @mdl.prop
    @objid ("c185464b-fde6-4745-9181-936162ee7678")
    private int Tel;

    @mdl.propgetter
    public int getTel() {
        // Automatically generated method. Please do not modify this code.
        return this.Tel;
    }

    @mdl.propsetter
    public void setTel(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.Tel = value;
    }

    @objid ("a9768f27-fbca-41ab-9f7d-cb74dddbc6c9")
    public List<Menu> Modifier = new ArrayList<Menu>();

    @objid ("fb7ad9c2-dda8-47b9-81e3-22a0e4c0e502")
    public List<Commande> Livrer = new ArrayList<Commande>();

    @objid ("44d92d6d-3ad0-4ef4-a555-c1ac320d230d")
    public Chef_Restaurant(final String id, final String nom, final int Tel) {
        this.id = id;
        this.nom = nom;
        this.Tel = Tel;
    }

    @objid ("92f9884b-123b-480a-b285-fa821cdc47fe")
    protected void finalize() {
        System.out.println("Le chef a ete detuit !!!");
    }

    @objid ("b8964753-bec9-47ef-97fc-baf79df95495")
    public void modifie_chef(final String nom, final int tel) {
        this.nom = nom;
        this.tel = tel;
    }

}
