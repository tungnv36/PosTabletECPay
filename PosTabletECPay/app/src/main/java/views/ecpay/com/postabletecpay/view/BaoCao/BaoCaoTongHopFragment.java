package views.ecpay.com.postabletecpay.view.BaoCao;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import views.ecpay.com.postabletecpay.R;

/**
 * Created by macbook on 4/30/17.
 */

public class BaoCaoTongHopFragment extends Fragment implements View.OnClickListener {

    private TextView tvNgayIn, tvThuNgan, tvSHDGiao, tvSTGiao, tvSHDThu, tvSTThu, tvSHDTon, tvSTTon, tvSHDThuVangLai, tvSTThuVangLai, tvSHDHoanTra,
            tvSTHoanTra;
    private Button btInBaoCao;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_baocao_tonghop, container, false);
        tvNgayIn = (TextView) view.findViewById(R.id.tvNgayIn);
        tvThuNgan = (TextView) view.findViewById(R.id.tvThuNgan);
        tvSHDGiao = (TextView) view.findViewById(R.id.tvSHDGiao);
        tvSTGiao = (TextView) view.findViewById(R.id.tvSTGiao);
        tvSHDThu = (TextView) view.findViewById(R.id.tvSHDThu);
        tvSTThu = (TextView) view.findViewById(R.id.tvSTThu);
        tvSHDTon = (TextView) view.findViewById(R.id.tvSHDTon);
        tvSTTon = (TextView) view.findViewById(R.id.tvSTTon);
        tvSHDThuVangLai = (TextView) view.findViewById(R.id.tvSHDThuVangLai);
        tvSTThuVangLai = (TextView) view.findViewById(R.id.tvSTThuVangLai);
        tvSHDHoanTra = (TextView) view.findViewById(R.id.tvSHDHoanTra);
        tvSTHoanTra = (TextView) view.findViewById(R.id.tvSTHoanTra);
        btInBaoCao = (Button) view.findViewById(R.id.btInBaoCao);

        btInBaoCao.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
