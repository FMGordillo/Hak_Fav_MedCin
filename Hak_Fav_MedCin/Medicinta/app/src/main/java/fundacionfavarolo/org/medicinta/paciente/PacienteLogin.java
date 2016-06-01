package fundacionfavarolo.org.medicinta.paciente;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import fundacionfavarolo.org.medicinta.R;

public class PacienteLogin extends AppCompatActivity {

    private Button debugDashboard;
    private Button iniciarSesion;
    private String usernamePosta = "herman";
    private String passwordPosta = "123";

    private EditText usernameIngresado;
    private EditText passwordIngresado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente_login);

        usernameIngresado = (EditText) findViewById(R.id.paciente_login_usuario);
        passwordIngresado = (EditText) findViewById(R.id.paciente_login_password);
        debugDashboard = (Button) findViewById(R.id.debug_dashboard);
        iniciarSesion = (Button) findViewById(R.id.login_button);

        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernameIngresado.getText().toString().equals(usernamePosta) && passwordIngresado.getText().toString().equals(passwordPosta)) {
                    Toast.makeText(getApplicationContext(), "Redireccionando...", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(PacienteLogin.this, TableroPaciente.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Datos erróneos. Por favor, vuelva a ingresar sus datos.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        debugDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PacienteLogin.this, SinRespuesta.class));
            }
        });
    }
}
