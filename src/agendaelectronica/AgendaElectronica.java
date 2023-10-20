
package agendaelectronica;
// Estamos respetando el modelo de capas

import agendaelectronica.gui.Principal;

public class AgendaElectronica {

    public static void main(String[] args) {
        Principal princ = new Principal();
        princ.setVisible(true);
        // posicionar interfaz grafica: (en el centro)
        princ.setLocationRelativeTo(null);
    }
    
}
