package br.com.suaempresa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Botão de limpar
    public void limparNumero(View v){
        Intent it = new Intent();
    }

    //Botão de Ligar
    public void ligacao(View v){
        Uri uri = Uri.parse("tel:83999453081");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    //Adicionar Numeros
    @SuppressLint("NonConstantResourceId")
    public void adicionarNumero(View v) {

        EditText etdNumeroTelefone = findViewById(R.id.edtNumeroTelefone);

        switch (v.getId()) {
            case R.id.btnUm:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() + "1");
                break;
            case R.id.btnDois:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"2");
                break;
            case R.id.btnTres:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"3");
                break;
            case R.id.btnQuatro:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"4");
                break;
            case R.id.btnCinco:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"5");
                break;
            case R.id.btnSeis:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"6");
                break;
            case R.id.btnSete:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"7");
                break;
            case R.id.btnOito:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"8");
                break;
            case R.id.btnNove:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"9");
                break;
            case R.id.btnZero:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"0");
                break;
            case R.id.btnVelha:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"#");
                break;
            case R.id.btnAsterisco:
                etdNumeroTelefone.setText(etdNumeroTelefone.getText().toString() +"*");
                break;
        }
    }
}