package fundacionfavarolo.org.medicinta.paciente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fundacionfavarolo.org.medicinta.R;

public class PacienteLogin extends AppCompatActivity {

    private Button debugDashboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente_login);

        debugDashboard = (Button) findViewById(R.id.debug_dashboard);

        debugDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PacienteLogin.this,TableroPaciente.class));
            }
        });
    }
}
