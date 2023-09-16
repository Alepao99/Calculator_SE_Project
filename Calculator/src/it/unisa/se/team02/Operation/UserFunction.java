package it.unisa.se.team02.Operation;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Team02
 */
public class UserFunction implements Serializable {

    private String name;
    private List<Azione> codice;
    private String funzione;

    public UserFunction(String name, String funzione) {
        this.name = name;
        this.codice = new LinkedList<>();
        this.funzione = funzione;
    }

    public UserFunction() {
       
    }

    public void setActions(Menu menu) {
        menu.getList().forEach(a -> {
            codice.add(a);
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Azione> getCodice() {
        return codice;
    }

    public void setCodice(List<Azione> codice) {
        this.codice = codice;
    }

    public String getFunzione() {
        return funzione;
    }

    public void setFunzione(String funzione) {
        this.funzione = funzione;
    }

}
