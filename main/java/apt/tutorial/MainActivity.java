package apt.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bước 2: Tạo đối tượng nghe
        // ButtonSaveListener btSaveListener = new ButtonSaveListener();
        // Bước 3: tìm đối tượng nguồn button save
        Button btSave =  (Button)findViewById(R.id.save);
        // Bước 4: Đăng ký đối tượng nghe với đt nguồn
        // btSave.setOnClickListener(btSaveListener);

        // PP 1: Ẩn tên đối tượng nghe
        // btSave.setOnClickListener(new ButtonSaveListener());

        // PP 2: Ẩn tên lớp đối tượng nghe
//        View.OnClickListener btSaveListener = new View.OnClickListener(){
//            public void onClickView(View v){
//                Toast.makeText(MainActivity.this,
//                        "Button save \n onClick Event",
//                        Toast.LENGTH_LONG).show();
//            }
//            Log.d("MyLog","Button Save onClick");
//        };
//        btSave.setOnClickListener(btSaveListener);
        // PP 3: Ẩn cả tên đối tượng nghe và vtên lớp
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "abcxyz", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Bước 1: Tạo đối tượng nghe
   /* class ButtonSaveListener implements  View.OnClickListener{
        @Override
        public void onClickView(View v){
            Toast.makeText(MainActivity.this,
                    "Button save \n onClick Event",
                    Toast.LENGTH_LONG).show();
        }
        Log.d("MyLog","Button Save onClick");

    }*/
}
