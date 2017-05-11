package views.ecpay.com.postabletecpay.view.DangNhap;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import views.ecpay.com.postabletecpay.R;
import views.ecpay.com.postabletecpay.util.commons.Common;
import views.ecpay.com.postabletecpay.util.dbs.SQLiteConnection;
import views.ecpay.com.postabletecpay.view.Main.MainActivity;

/**
 * Created by macbook on 4/28/17.
 */

public class DangNhapActivity extends ActionBarActivity implements View.OnClickListener {

    @Bind(R.id.etTaiKhoan) EditText etTaiKhoan;
    @Bind(R.id.etMatKhau) EditText etMatKhau;
    @Bind(R.id.cbNhoMatKhau) CheckBox cbNhoMatKhau;
    @Bind(R.id.btDangNhap) Button btDangNhap;

    private SQLiteConnection connection = null;

    private static final int REQUEST_EXTERNAL_STORAGE = 1;

    private static final String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
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
        } catch(Exception ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_LONG).show();
        }

        setContentView(R.layout.activity_dang_nhap);

        verifyStoragePermissions(this);
        Common.makeRootFolder(this);
        connection = SQLiteConnection.getInstance(this);

        ButterKnife.bind(this);

        btDangNhap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(DangNhapActivity.this, MainActivity.class));
        DangNhapActivity.this.finish();
    }

    private static void verifyStoragePermissions(Activity activity) {
        if(ContextCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

            } else {
                ActivityCompat.requestPermissions(activity, PERMISSIONS_STORAGE, REQUEST_EXTERNAL_STORAGE);
            }
        }
    }
}
