package fundacionfavarolo.org.medicinta.medico;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import fundacionfavarolo.org.medicinta.R;

public class TableroMedico extends AppCompatActivity {


    private Button mensajes;
    private Button pacientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero_medico);
        initComponents();

        mensajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableroMedico.this, MensajesMedico.class));
            }
        });

    }

    private void initComponents() {
        mensajes = (Button) findViewById(R.id.mensajes_button);
        pacientes = (Button) findViewById(R.id.consultar_button);

    }
}
