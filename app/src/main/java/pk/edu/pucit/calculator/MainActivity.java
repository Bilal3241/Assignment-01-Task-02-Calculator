package pk.edu.pucit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView zero,double_zero,one,two,three,four,five,six,seven,eight,nine,point,equals,add,subtract,divide,mod,multiply,ac,del,equation,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        equation=findViewById(R.id.tv_equation);
        zero=findViewById(R.id.zero);
        double_zero=findViewById(R.id.double_zero);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        point=findViewById(R.id.point);
        equals=findViewById(R.id.equals);
        add=findViewById(R.id.add);
        subtract=findViewById(R.id.subtract);
        divide=findViewById(R.id.divide);
        mod=findViewById(R.id.mod);
        multiply=findViewById(R.id.multiply);
        ac=findViewById(R.id.ac);
        del=findViewById(R.id.del);
        result=findViewById(R.id.tv_result);

    }

    public void clear(View view) {
        equation.setText("");

    }

    public void concat(View view) {
        equation.setText((equation.getText()) + ((TextView)view).getText().toString());
    }

    public void delete_char(View view) {
        String str= String.valueOf(equation.getText());
        if (str.length() > 0) {
            equation.setText(str.substring(0, str.length() - 1));
        }
    }
}
