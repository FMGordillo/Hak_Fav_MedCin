package fundacionfavarolo.org.medicinta.medico;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import fundacionfavarolo.org.medicinta.R;

public class TableroMedico extends AppCompatActivity {

    /*
    private Button contacto;
    private Button mensajes;
    private Button consultar_medico;
    private Button calendario;
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero_medico);
        initComponents();

    }

    private void initComponents() {
        /*
        contacto = (Button) findViewById(R.id.contacto_button);
        mensajes = (Button) findViewById(R.id.mensajes_button);
        consultar_medico = (Button) findViewById(R.id.consultar_button);
        calendario = (Button) findViewById(R.id.calendario_button);
        */

    }
}
