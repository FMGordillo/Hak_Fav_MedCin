package fundacionfavarolo.org.medicinta.paciente;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import fundacionfavarolo.org.medicinta.R;

public class SinRespuestaAgradecimiento extends AppCompatActivity {

    private Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_respuesta_agradecimiento);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SinRespuestaAgradecimiento.this, TableroPaciente.class));
            }
        });
    }

    private void initComponents() {
        volver = (Button) findViewById(R.id.volverAgradecimiento);
    }
}
