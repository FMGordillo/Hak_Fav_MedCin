package fundacionfavarolo.org.medicinta.medico;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import fundacionfavarolo.org.medicinta.R;

public class MedicoLogin extends AppCompatActivity {

    private Button iniciarSesionMedico;
    private EditText usernameIngresado;
    private EditText passwordIngresado;
    private String usernamePosta = "doc";
    private String passwordPosta = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medico_login);
        initComponents();

        iniciarSesionMedico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (usernameIngresado.getText().toString().equals(usernamePosta) && passwordIngresado.getText().toString().equals(passwordPosta)) {
                    Toast.makeText(getApplicationContext(), "Redireccionando...", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MedicoLogin.this, TableroMedico.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Datos erróneos. Por favor, vuelva a ingresar sus datos.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initComponents() {
        usernameIngresado = (EditText) findViewById(R.id.doctor_login_usuario);
        passwordIngresado = (EditText) findViewById(R.id.doctor_login_password);
        iniciarSesionMedico = (Button) findViewById(R.id.login_button_medico);
    }
}
