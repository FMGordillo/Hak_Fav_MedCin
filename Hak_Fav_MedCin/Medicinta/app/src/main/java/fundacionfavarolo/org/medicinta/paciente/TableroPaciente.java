package fundacionfavarolo.org.medicinta.paciente;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import fundacionfavarolo.org.medicinta.R;

public class TableroPaciente extends AppCompatActivity {

    private final long interval = 1 * 1000;
    MyCountDownTimer countDownTimer;
    private Button contactoButton;
    private Button mensajesButton;
    private long startTime = 1 * 30 * 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero_paciente);
        countDownTimer = new MyCountDownTimer(startTime, interval);

        contactoButton = (Button) findViewById(R.id.contacto_button);
        mensajesButton = (Button) findViewById(R.id.mensajes_button);
    }

    @Override
    public void onUserInteraction() {

        super.onUserInteraction();

        //Reset the timer on user interaction...
        countDownTimer.cancel();
        countDownTimer.start();
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
