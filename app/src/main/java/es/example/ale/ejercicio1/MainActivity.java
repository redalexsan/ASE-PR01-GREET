package es.example.ale.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtName;
    private EditText txtSecondName;
    private TextView messageText;
    private CheckBox cbPolite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button btnHello = findViewById(R.id.btnHello);
        Button btnReset = findViewById(R.id.btnReset);
        txtName = findViewById(R.id.txtName);
        txtSecondName = findViewById(R.id.txtSecondName);
        messageText = findViewById(R.id.messageText);
        cbPolite = findViewById(R.id.cbPolite);

       btnHello.setOnClickListener(this);
       btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnHello)
            if(cbPolite.isChecked()==true)
                messageText.setText(getString(R.string.startText, getString(R.string.politeMessage), txtName.getText(), txtSecondName.getText()));
            else
                messageText.setText(getString(R.string.startText,getString(R.string.main_message),txtName.getText(), txtSecondName.getText()));
         else
        {
            messageText.setText(getString(R.string.main_message));
            txtName.setText(getString(R.string.main_message));
            txtSecondName.setText(getString(R.string.main_message));
            cbPolite.setChecked(false);
        }

    }

}
