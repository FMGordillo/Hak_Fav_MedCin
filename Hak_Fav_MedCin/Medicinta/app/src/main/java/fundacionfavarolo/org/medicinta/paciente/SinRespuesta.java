package fundacionfavarolo.org.medicinta.paciente;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import fundacionfavarolo.org.medicinta.R;

public class SinRespuesta extends AppCompatActivity {

    private SeekBar barraOk;
    private TextView barraOkTexto;
    private SeekBar barraCancer;
    private TextView barraCancerTexto;

    private TextView preguntaUno;
    private TextView preguntaDos;
    private TextView preguntaTres;
    private TextView preguntaCuatro;
    private TextView preguntaCinco;

    private Button listoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_respuesta);
        initializeVariables(); //TODO Hacer lo mismo con todas las clases!!

        barraOkTexto.setText(barraOk.getProgress() + " de " + barraOk.getMax());
        barraCancerTexto.setText(barraCancer.getProgress() + " de " + barraCancer.getMax());

        // BARRA 1
        // DEL 0 AL 10
        barraOk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress = progressValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                barraOkTexto.setText(barraOk.getProgress() + " de " + barraOk.getMax());
            }
        });
        // BARRA 2
        // DEL 0 AL 10
        barraCancer.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress = progressValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                barraCancerTexto.setText(barraCancer.getProgress() + " de " + barraCancer.getMax());
            }
        });

        listoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SinRespuesta.this, SinRespuestaAgradecimiento.class));
            }
        });
    }

    private void initializeVariables() {
        barraOk = (SeekBar) findViewById(R.id.barraOk);
        barraOkTexto = (TextView) findViewById(R.id.barraOkTexto);
        barraCancer = (SeekBar) findViewById(R.id.barraOk2);
        barraCancerTexto = (TextView) findViewById(R.id.barraOkTexto2);

        preguntaUno = (TextView) findViewById(R.id.cuestionario_1);
        preguntaDos = (TextView) findViewById(R.id.cuestionario_2);
        preguntaTres = (TextView) findViewById(R.id.cuestionario_3);
        preguntaCuatro = (TextView) findViewById(R.id.cuestionario_4);
        preguntaCinco = (TextView) findViewById(R.id.cuestionario_5);

        listoButton = (Button) findViewById(R.id.sinRespuesta_listo);
    }
}
