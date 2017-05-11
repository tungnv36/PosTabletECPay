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

import butterknife.Bind;
import butterknife.ButterKnife;
import views.ecpay.com.postabletecpay.R;

/**
 * Created by macbook on 4/30/17.
 */

public class BaoCaoChiTietFragment extends Fragment implements View.OnClickListener {

    @Bind(R.id.rbMaKH) RadioButton rbMaKH;
    @Bind(R.id.rbTenKH) RadioButton rbTenKH;
    @Bind(R.id.etSearch) EditText etSearch;
    @Bind(R.id.etTuNgay) EditText etTuNgay;
    @Bind(R.id.etDenNgay) EditText etDenNgay;
    @Bind(R.id.btTimKiem) Button btTimKiem;
    @Bind(R.id.rvDanhSach) RecyclerView rvDanhSach;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_baocao_chitiet, container, false);
        ButterKnife.bind(this, view);

        btTimKiem.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
