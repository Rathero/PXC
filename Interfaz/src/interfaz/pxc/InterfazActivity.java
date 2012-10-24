package interfaz.pxc;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public abstract class InterfazActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    private Button boton;
    private EditText et_song;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.boton = (Button)findViewById(R.id.button1);
        this.et_song = (EditText)findViewById(R.id.editText1);
        this.boton.setOnClickListener((android.view.View.OnClickListener) this);
    }
    
    public void onClick(View v){
    	
    }

}