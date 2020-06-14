package pt.ipg.calculoidadeanimais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editIdade;
    private TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editIdade = findViewById(R.id.editIdade);
        Resultado = findViewById(R.id.Resultado);
    }

    public void calcularIdade (View view){

        int idade = Integer.parseInt(editIdade.getText().toString());

        int resultado = idade*7;

        Resultado.setText("O seu animal tem: " + resultado + " anos");



    }
}
