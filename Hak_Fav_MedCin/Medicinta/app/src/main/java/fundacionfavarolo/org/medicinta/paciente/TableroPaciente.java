package fundacionfavarolo.org.medicinta.paciente;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import fundacionfavarolo.org.medicinta.R;

public class TableroPaciente extends AppCompatActivity {

    private final long interval = 1 * 1000;
    MyCountDownTimer countDownTimer;
    private long startTime = 1 * 60 * 1000;

    private Button contactoButton;
    private Button mensajesButton;
    private Button consultarMedicoButton;
    private Button calendarioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero_paciente);

        initComponents();

        // Timer DEBUG
        contactoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableroPaciente.this, ContactoPaciente.class));
            }
        });
        mensajesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableroPaciente.this, MensajesPaciente.class));
            }
        });
        consultarMedicoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableroPaciente.this, ConsultarMedicoPaciente.class));
            }
        });
        calendarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableroPaciente.this, CalendarioPaciente.class));
            }
        });

    }
    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        //Reset the timer on user interaction...
        countDownTimer.cancel();
        countDownTimer.start();
    }

    private void initComponents() {
        countDownTimer = new MyCountDownTimer(startTime, interval);
        contactoButton = (Button) findViewById(R.id.contacto_button);
        mensajesButton = (Button) findViewById(R.id.mensajes_button);
        consultarMedicoButton = (Button) findViewById(R.id.consultar_button);
        calendarioButton = (Button) findViewById(R.id.calendario_button);

    }

    public class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }
        @Override
        public void onFinish() {
            startActivity(new Intent(TableroPaciente.this, SinRespuesta.class));
        }
        @Override
        public void onTick(long millisUntilFinished) {
        }
    }
}
