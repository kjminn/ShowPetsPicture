package kr.ac.hywoman.minn.showpetspicture;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox checkStart;
    TextView textQ2;
    RadioGroup rg;
    RadioButton rbPuppy, rbCat, rbRabbit;
    Button butDone;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkStart=(CheckBox)findViewById(R.id.check_start);
        textQ2=(TextView) findViewById(R.id.text_q2);
        rg=(RadioGroup) findViewById(R.id.rg);
        rbPuppy=(RadioButton) findViewById(R.id.rb_puppy);
        rbCat=(RadioButton) findViewById(R.id.rb_cat);
        rbRabbit=(RadioButton) findViewById(R.id.rb_rabbit);
        butDone=(Button) findViewById(R.id.but_done);
        imgPet=(ImageView) findViewById(R.id.img_pet);

        checkStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    //안보이던 뷰들이 보이게 설정
                    textQ2.setVisibility(View.VISIBLE);
                    rbPuppy.setVisibility(View.VISIBLE);
                    rbCat.setVisibility(View.VISIBLE);
                    rbRabbit.setVisibility(View.VISIBLE);
                    butDone.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }else{
                    //보이는 뷰들을 안보이게 설정
                    textQ2.setVisibility(View.INVISIBLE);
                    rbPuppy.setVisibility(View.INVISIBLE);
                    rbCat.setVisibility(View.INVISIBLE);
                    rbRabbit.setVisibility(View.INVISIBLE);
                    butDone.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);                    
                }
            }
        });

        butDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rg.getCheckedRadioButtonId()){
                    case R.id.rb_puppy:
                        imgPet.setImageResource(R.drawable.puppy);
                        break;
                    case R.id.rb_cat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rb_rabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                }
            }
        });
    }
}
