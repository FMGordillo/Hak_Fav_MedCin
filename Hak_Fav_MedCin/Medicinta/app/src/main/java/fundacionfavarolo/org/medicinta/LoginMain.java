package fundacionfavarolo.org.medicinta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fundacionfavarolo.org.medicinta.paciente.PacienteLogin;

public class LoginMain extends AppCompatActivity {

    private Button pacienteButton;
    private Button favaroloButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pacienteButton = (Button) findViewById(R.id.paciente_button);
        favaroloButton = (Button) findViewById(R.id.fundacion_button);

        pacienteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginMain.this, PacienteLogin.class));
            }
        });
        favaroloButton.setOnClickListener(new View.OnClickListener() { //TODO Change
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginMain.this, PacienteLogin.class));
            }
        });
        }

    }

