package views.ecpay.com.postabletecpay.view.BaoCao;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import views.ecpay.com.postabletecpay.R;

/**
 * Created by macbook on 4/30/17.
 */

public class BaoCaoLichSuFragment extends Fragment implements View.OnClickListener {

    private RadioButton rbMaKH, rbTenKH;
    private EditText etSearch;
    private Button btTimKiem;
    private RecyclerView rvDanhSach;
    private TextView tvUsername, tvMaKH;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_baocao_lichsu, container, false);
        rbMaKH = (RadioButton) view.findViewById(R.id.rbMaKH);
        rbTenKH = (RadioButton) view.findViewById(R.id.rbTenKH);
        etSearch = (EditText) view.findViewById(R.id.etSearch);
        btTimKiem = (Button) view.findViewById(R.id.btTimKiem);
        rvDanhSach = (RecyclerView) view.findViewById(R.id.rvDanhSach);
        tvUsername = (TextView) view.findViewById(R.id.tvUsername);
        tvMaKH = (TextView) view.findViewById(R.id.tvMaKH);

        btTimKiem.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
