package fundacionfavarolo.org.medicinta.paciente;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import fundacionfavarolo.org.medicinta.R;

public class CalendarioPaciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_paciente);
        initComponents();
    }

    private void initComponents() {
    }
}
