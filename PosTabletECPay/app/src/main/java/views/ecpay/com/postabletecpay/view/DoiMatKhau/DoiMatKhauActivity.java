package views.ecpay.com.postabletecpay.view.DoiMatKhau;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import views.ecpay.com.postabletecpay.R;

/**
 * Created by TungNV on 5/3/17.
 */

public class DoiMatKhauActivity extends ActionBarActivity implements View.OnClickListener{

    private ImageButton ibBack;
    private TextView tvUsername, tvSDT, tvLoi;
    private ImageView ivAvatar;
    private EditText etMatKhauCu, etMatKhauMoi, etNhapLaiMatKhauMoi;
    private Button btDoiMatKhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            getSupportActionBar().hide();
            if (Build.VERSION.SDK_INT < 16) {
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            } else {
                View decorView = getWindow().getDecorView();
                int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
                decorView.setSystemUiVisibility(uiOptions);
            }

            setContentView(R.layout.activity_doi_mat_khau);
            ibBack = (ImageButton) findViewById(R.id.ibBack);
            tvUsername = (TextView) findViewById(R.id.tvUsername);
            tvSDT = (TextView) findViewById(R.id.tvSDT);
            tvLoi = (TextView) findViewById(R.id.tvLoi);
            ivAvatar = (ImageView) findViewById(R.id.ivAvatar);
            etMatKhauCu = (EditText) findViewById(R.id.etMatKhau);
            etMatKhauMoi = (EditText) findViewById(R.id.etMatKhauMoi);
            etNhapLaiMatKhauMoi = (EditText) findViewById(R.id.etNhapLaiMatKhauMoi);
            btDoiMatKhau = (Button) findViewById(R.id.btDoiMatKhau);

            ibBack.setOnClickListener(this);
            btDoiMatKhau.setOnClickListener(this);
        } catch(Exception ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ibBack:
                DoiMatKhauActivity.this.finish();
                break;
            case R.id.btDoiMatKhau:
                break;
        }
    }
}
