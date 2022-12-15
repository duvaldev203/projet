import java.io.*;
import java.util.Date;
import javax.sound.sampled.SourceDataLine;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("178cda5e-98bd-4929-a7a6-f21c02959dc7")
public class Ticket {
    @mdl.prop
    @objid ("21ef22db-63bb-4289-bb4b-adeafd555ed0")
    private String id;

    @mdl.prop
    @objid ("a9dac44e-f09e-4bd3-98d3-76170ccccca3")
    private int code;

    @mdl.propgetter
    public int getCode() {
        // Automatically generated method. Please do not modify this code.
        return this.code;
    }

    @mdl.propsetter
    public void setCode(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.code = value;
    }

    @mdl.prop
    @objid ("c9486a0b-668e-4a02-96bb-9dd56d68211c")
    private String intitule;

    @mdl.propgetter
    public String getIntitule() {
        // Automatically generated method. Please do not modify this code.
        return this.intitule;
    }

    @mdl.propsetter
    public void setIntitule(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.intitule = value;
    }

    @mdl.prop
    @objid ("54e39514-01f7-4786-8ade-4a00fc762d8a")
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

    @mdl.prop
    @objid ("084055c7-34ef-480f-8a2f-2199ab74103e")
    private boolean etat;

    @mdl.propgetter
    private boolean isEtat() {
        // Automatically generated method. Please do not modify this code.
        return this.etat;
    }

    @mdl.propsetter
    private void setEtat(final boolean value) {
        // Automatically generated method. Please do not modify this code.
        this.etat = value;
    }

    @objid ("3740383f-ca62-4774-9dae-3258942b36c6")
    private int cd = 0;

    @objid ("0f7bba38-551c-468a-b623-80d94907fd4c")
    public Ticket(final String id, final int code, final boolean intitule, final int nbrePlat, final boolean etat) {
        this.id = id;
        this.code = code;
        this.intitule = intitule;
        this.nbrePlat = nbrePlat;
        this.etat = etat;
    }

    @objid ("285df55d-99a5-4727-9d64-b619dc037a1c")
    protected void finalize() {
        System.out.println("Le ticket est detuit !!!");
    }

    @objid ("f12e7ff5-75ea-4e99-a8b4-790984bcf077")
    public void entrer_informtion() {
    }

    @objid ("c0f3a462-284c-4e14-97a5-c4cbce92057e")
    public String envoyer_ticket() {
        // TODO Auto-generated return
        return this.code;
    }

    @objid ("98c9f0e9-9783-4e59-9d48-266ea99a158b")
    public int generer_code() {
        Date day = new Date();
        long milli = day.getTime();
        int code = (int) milli;
        return code;
    }

}
