import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("dd85c3fa-6dff-4fdc-a19f-413b4bd6d07b")
public class Menu {
    @mdl.prop
    @objid ("faad9215-1bb6-430c-a027-ff91b2c10dc1")
    private String id;

    @mdl.prop
    @objid ("dbbddba1-47cb-4ccb-823c-977e2cbf859b")
    private String intitule;

    @mdl.propgetter
    private String getIntitule() {
        // Automatically generated method. Please do not modify this code.
        return this.intitule;
    }

    @mdl.propsetter
    private void setIntitule(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.intitule = value;
    }

    @objid ("d4bc48ff-5eba-4f18-96eb-60d8585c9a1e")
    public List<Ticket> Contenir = new ArrayList<Ticket>();

    @objid ("1982985b-8b9e-4a4d-b60e-bff93070e691")
    public Menu(final String id, final String intitule) {
        this.id = id;
        this.intitule = intitule;
    }

    @objid ("2aaee719-1cd3-4112-b6b1-c2f08b81f8b5")
    protected void finalize() {
        System.out.println("Le menu est detruit");
    }

    @objid ("6ca3dd34-4eb8-4a2d-97d0-c1b96806cf86")
    public void modifier_menu(final String intitule) {
        this.intitule = intitule;
    }

}
