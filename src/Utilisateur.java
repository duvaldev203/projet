import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("09cb393a-cf76-4d6f-a188-c705632ed452")
public class Utilisateur {
    @mdl.prop
    @objid("335b8b86-05df-4841-9cd3-47df1d010df5")
    private String id;

    @mdl.prop
    @objid("053399d5-7d0c-408c-876d-d77a61376af5")
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
    @objid("9ee9d3e2-a69e-4238-959f-182124f30a05")
    private String email;

    @mdl.propgetter
    private String getEmail() {
        // Automatically generated method. Please do not modify this code.
        return this.email;
    }

    @mdl.propsetter
    private void setEmail(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.email = value;
    }

    @mdl.prop
    @objid("fa28c5f7-684c-4300-8503-d3154bcba2df")
    private int tel;

    @mdl.propgetter
    private int getTel() {
        // Automatically generated method. Please do not modify this code.
        return this.tel;
    }

    @mdl.propsetter
    private void setTel(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.tel = value;
    }

    @objid("cbbdf6ce-c3c8-4e3b-8321-69ba472d2d01")
    public Utilisateur(final String id, final String nom, final String email, final int tel) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.tel = tel;
    }

    @objid("2dd2c479-7b28-4039-8c14-8d2bf5aed6db")
    protected void finalize() {
        System.out.println("L'utilisateur est detruit !!!");
    }

    @objid("bf868e7f-c42a-4a55-a46a-6e6c3dbfe263")
    public void effectue_paiement() {
    }

    @objid("bad00041-d8fd-4d87-9782-8067a4cad9f3")
    public void modifier_utilisateur(final String nom, final String email, final int tel) {
        this.nom = nom;
        this.email = email;
        this.tel = tel;
    }

}
