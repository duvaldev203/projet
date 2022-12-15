import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bd566d0d-0b6e-468f-af53-f75eb6a26a09")
public class Serveur {
    @mdl.prop
    @objid ("39dbd51b-fe30-4079-ab67-3a9578cb062e")
    private String id;

    @mdl.propgetter
    public String getId() {
        // Automatically generated method. Please do not modify this code.
        return this.id;
    }

    @mdl.propsetter
    public void setId(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.id = value;
    }

    @mdl.prop
    @objid ("eea67335-3ad6-4eac-9cd2-0fab4cadb1c1")
    private String nom;

    @mdl.propgetter
    public String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.nom;
    }

    @mdl.propsetter
    public void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nom = value;
    }

    @mdl.prop
    @objid ("dee12735-cbb6-4aff-853c-533138730621")
    private int tel;

    @mdl.propgetter
    public int getTel() {
        // Automatically generated method. Please do not modify this code.
        return this.tel;
    }

    @mdl.propsetter
    public void setTel(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.tel = value;
    }

    @objid ("e511c189-935a-43f6-a389-d575cc6101ad")
    public List<Ticket> servir = new ArrayList<Ticket>();

    @objid ("59216f3a-5f71-4d64-8579-fb06a3d51e69")
    public Serveur(final String id, final String nom, final int tel) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
    }

    @objid ("c9018e1e-03f7-4877-be2e-8ad96ab237b7")
    protected void finalize() {
        System.out.println("Le serveur est detruit !!!");
    }

    @objid ("0b63e2c3-d587-40e4-afe9-1abb54edf435")
    public void modifie_serveur(final String id, final String nom, final int tel) {
        this.nom = nom;
        this.tel = tel;
    }

}
