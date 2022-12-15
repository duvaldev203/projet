import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8403a606-9dcd-416c-bb39-976c000fbcf1")
public class Reservation {
    @mdl.prop
    @objid ("c511d4b6-c69f-4c75-8fda-801da6545921")
    private String id;

    @mdl.prop
    @objid ("b2a08270-896c-40a5-832b-eb91bc7cc5ee")
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
    @objid ("2d7794e4-4ea7-416e-887a-cd8a4fa599c0")
    private String date;

    @mdl.propgetter
    private String getDate() {
        // Automatically generated method. Please do not modify this code.
        return this.date;
    }

    @mdl.propsetter
    private void setDate(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.date = value;
    }

    @objid ("d3adaa88-90c4-4e5a-aa8e-fc35920a7ff2")
    public List<Commande> Concerner = new ArrayList<Commande>();

    @objid ("5ca5de14-8912-41df-a9f7-5e2fe070dfbf")
    public Reservation(final Date date, final int code) {
        this.date = date;
        this.code = code;
    }

    @objid ("3f089574-f26d-418d-ad5f-c3b2854e245c")
    protected void finalize() {
        System.out.println("La reservation a ete detruit");
    }

    @objid ("934fbac6-2aa9-4b79-957d-cc6747f27235")
    public void demande_information() {
    }

    @objid ("f1f1c44e-6dc1-45be-bb24-8d635b14e6cb")
    public void demande_paiement() {
    }

    @objid ("7653ece3-b725-4b8a-8cd9-e06bc0cbd2dd")
    public String envoie_reservation() {
        // TODO Auto-generated return
        return this.code;
    }

}
