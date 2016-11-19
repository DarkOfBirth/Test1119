package lanou.text1119;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by wym on 16/11/19.
 * 
 */

public class WangYiMing extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fun();
    }

    public void fun(){
        Toast.makeText(this, "王一鸣", Toast.LENGTH_SHORT).show();
    }
}
