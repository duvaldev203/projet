import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a5fc9296-bf84-472a-81ab-93907bbddf9a")
public class Commande {
    @mdl.prop
    @objid ("8ed01db0-d7c4-419b-b82c-dde9ebd02083")
    private String id;

    @mdl.prop
    @objid ("3d37f7e1-0f17-4fba-b843-1fe06731aeab")
    private int code;

    @mdl.propgetter
    private int getCode() {
        // Automatically generated method. Please do not modify this code.
        return this.code;
    }

    @mdl.propsetter
    private void setCode(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.code = value;
    }

    @mdl.prop
    @objid ("f71297eb-5594-4791-b89a-f70d0d6b76b8")
    private String typePlat;

    @mdl.propgetter
    private String getTypePlat() {
        // Automatically generated method. Please do not modify this code.
        return this.typePlat;
    }

    @mdl.propsetter
    private void setTypePlat(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.typePlat = value;
    }

    @mdl.prop
    @objid ("71863561-8672-4f69-8891-e4989fc5c4c0")
    private int nbrePlat;

    @mdl.propgetter
    private int getNbrePlat() {
        // Automatically generated method. Please do not modify this code.
        return this.nbrePlat;
    }

    @mdl.propsetter
    private void setNbrePlat(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbrePlat = value;
    }

    @objid ("6136821f-6d11-43b7-8092-03f52375ac96")
    public Commande(final String id, final int code, final String typePlat, final int nbrePlat) {
        this.id = id;
        this.code = code;
        this.nbrePlat = typePlat;
        this.nbrePlat = nbrePlat;
    }

    @objid ("9c52e9bc-8bab-4bc5-a741-3bdd650d257d")
    protected void finalize() {
        System.out.println("La commande a ete annule");
    }

    @objid ("03a2e885-cad4-41a7-ac35-685db70315c7")
    public void Modifier_Commande(final String type_plat, final String nbrePlat) {
    }

    @objid ("b1a1337c-0185-45cc-b496-c9eddc53f6ef")
    public void demande_paiement() {
    }

}
