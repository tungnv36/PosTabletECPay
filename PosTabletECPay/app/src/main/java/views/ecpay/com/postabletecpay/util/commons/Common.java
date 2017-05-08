package views.ecpay.com.postabletecpay.util.commons;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;

/**
 * Created by macbook on 5/5/17.
 */

public class Common {

    public static void makeRootFolder(Context context) {
        try {
            File fileRoot = new File(Environment.getExternalStorageDirectory() + File.separator + "PosTablet");
            if (!fileRoot.exists()) {
                fileRoot.mkdir();
            }
            File fileDB = new File(Environment.getExternalStorageDirectory() + File.separator + "PosTablet" + File.separator + "DB");
            if (!fileDB.exists()) {
                fileDB.mkdir();
            }
        } catch(Exception ex) {
            Toast.makeText(context, ex.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

}
