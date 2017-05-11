package views.ecpay.com.postabletecpay.view.BaoCao;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import views.ecpay.com.postabletecpay.R;

/**
 * Created by macbook on 4/30/17.
 */

public class BaoCaoTongHopFragment extends Fragment implements View.OnClickListener {

    @Bind(R.id.tvNgayIn) TextView tvNgayIn;
    @Bind(R.id.tvThuNgan) TextView tvThuNgan;
    @Bind(R.id.tvSHDGiao) TextView tvSHDGiao;
    @Bind(R.id.tvSTGiao) TextView tvSTGiao;
    @Bind(R.id.tvSHDThu) TextView tvSHDThu;
    @Bind(R.id.tvSTThu) TextView tvSTThu;
    @Bind(R.id.tvSHDTon) TextView tvSHDTon;
    @Bind(R.id.tvSTTon) TextView tvSTTon;
    @Bind(R.id.tvSHDThuVangLai) TextView tvSHDThuVangLai;
    @Bind(R.id.tvSTThuVangLai) TextView tvSTThuVangLai;
    @Bind(R.id.tvSHDHoanTra) TextView tvSHDHoanTra;
    @Bind(R.id.tvSTHoanTra) TextView tvSTHoanTra;
    @Bind(R.id.btInBaoCao) Button btInBaoCao;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_baocao_tonghop, container, false);
        ButterKnife.bind(this, view);

        btInBaoCao.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
