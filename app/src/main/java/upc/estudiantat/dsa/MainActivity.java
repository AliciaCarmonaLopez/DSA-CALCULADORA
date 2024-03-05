package upc.estudiantat.dsa;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private String operacion;
    private String numActual;
    private String numAnterior;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSumaBtn(View v){
        this.operacion = "+";
        if(this.numAnterior == null){
            this.numAnterior = this.numActual;
            this.numActual= null;
        }
        else{
            double res = Double.parseDouble(numAnterior)+Double.parseDouble(numActual);
            this.numAnterior = String.valueOf(res);
            this.numActual = null;
            TextView tv1 = (TextView)findViewById(R.id.textBox);
            tv1.setText(numAnterior);
        }

    }
    public void onClickRestaBtn(View v){
        this.operacion = "-";
        if(this.numAnterior == null){
            this.numAnterior = this.numActual;
            this.numActual= null;
        }
        else{
            double res = Double.parseDouble(numAnterior)-Double.parseDouble(numActual);
            this.numAnterior = String.valueOf(res);
            this.numActual = null;
            TextView tv1 = (TextView)findViewById(R.id.textBox);
            tv1.setText(numAnterior);
        }
    }
    public void onClickMultiplicacionBtn(View v){
        this.operacion = "x";
        if(this.numAnterior == null){
            this.numAnterior = this.numActual;
            this.numActual= null;
        }
        else{
            double res = Double.parseDouble(numAnterior)*Double.parseDouble(numActual);
            this.numAnterior = String.valueOf(res);
            this.numActual = null;
            TextView tv1 = (TextView)findViewById(R.id.textBox);
            tv1.setText(numAnterior);
        }
    }
    public void onClickDivisionBtn(View v){
        this.operacion = "/";
        if(this.numAnterior == null){
            this.numAnterior = this.numActual;
            this.numActual= null;
        }
        else{
            double res = Double.parseDouble(numAnterior)/Double.parseDouble(numActual);
            this.numAnterior = String.valueOf(res);
            this.numActual = null;
            TextView tv1 = (TextView)findViewById(R.id.textBox);
            tv1.setText(numAnterior);
        }
    }
    public void onClickSinBtn(View v){
        this.operacion = "sin";
        double res = Math.sin(Double.parseDouble(numActual));
        this.numAnterior = String.valueOf(res);
        this.numActual = null;
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numAnterior);
    }
    public void onClickCosBtn(View v){
        this.operacion = "cos";
        double res = Math.cos(Double.parseDouble(numActual));
        this.numAnterior = String.valueOf(res);
        this.numActual = null;
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numAnterior);
    }
    public void onClickTanBtn(View v){
        this.operacion = "tan";
        double res = Math.tan(Double.parseDouble(numActual));
        this.numAnterior = String.valueOf(res);
        this.numActual = null;
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numAnterior);
    }
    public void onClickClearBtn(View v){
        numActual = null;
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(" ");
    }

    public void onClickIgualBtn(View v){
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(this.numAnterior);
        this.numAnterior=null;
        this.numActual=null;
    }

    public void onClick7Btn(View v){
        if(numActual == null){
            numActual = "7";
        }
        else
            numActual = numActual + "7";
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numActual);
    }
    public void onClick8Btn(View v){
        if(numActual == null){
            numActual = "8";
        }
        else
            numActual = numActual + "8";
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numActual);
    }
    public void onClick9Btn(View v){
        if(numActual == null){
            numActual = "9";
        }
        else
            numActual = numActual + "9";
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numActual);
    }
    public void onClick6Btn(View v){
        if(numActual == null){
            numActual = "6";
        }
        else
            numActual = numActual + "6";
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numActual);
    }
    public void onClick5Btn(View v){
        if(numActual == null){
            numActual = "5";
        }
        else
            numActual = numActual + "5";
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numActual);
    }
    public void onClick4Btn(View v){
        if(numActual == null){
            numActual = "4";
        }
        else
            numActual = numActual + "4";
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numActual);
    }
    public void onClick3Btn(View v){
        if(numActual == null){
            numActual = "3";
        }
        else
            numActual = numActual + "3";
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numActual);
    }
    public void onClick2Btn(View v){
        if(numActual == null){
            numActual = "2";
        }
        else
            numActual = numActual + "2";
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numActual);
    }
    public void onClick1Btn(View v){
        if(numActual == null){
            numActual = "1";
        }
        else
            numActual = numActual + "1";
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numActual);
    }
    public void onClick0Btn(View v){
        if(numActual == null){
            numActual = "0";
        }
        else
            numActual = numActual + "0";
        TextView tv1 = (TextView)findViewById(R.id.textBox);
        tv1.setText(numActual);
    }
}