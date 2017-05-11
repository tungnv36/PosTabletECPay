package views.ecpay.com.postabletecpay.view.TaiKhoan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import views.ecpay.com.postabletecpay.R;
import views.ecpay.com.postabletecpay.view.DoiMatKhau.DoiMatKhauActivity;

/**
 * Created by macbook on 4/28/17.
 */

public class TaiKhoanFragment extends Fragment implements View.OnClickListener {

    @Bind(R.id.ibBack) ImageButton ibBack;
    @Bind(R.id.tvTaiKhoan) TextView tvTaiKhoan;
    @Bind(R.id.tvNgayDangKy) TextView tvNgayDangKy;
    @Bind(R.id.tvTenTaiKhoan) TextView tvTenTaiKhoan;
    @Bind(R.id.tvCMND) TextView tvCMND;
    @Bind(R.id.tvDienThoai) TextView tvDienThoai;
    @Bind(R.id.tvEmail) TextView tvEmail;
    @Bind(R.id.tvDiaChi) TextView tvDiaChi;
    @Bind(R.id.tvSoTaiKhoan) TextView tvSoTaiKhoan;
    @Bind(R.id.tvSoDuKhaDung) TextView tvSoDuKhaDung;
    @Bind(R.id.tvLoaiTaiKhoan) TextView tvLoaiTaiKhoan;
    @Bind(R.id.btDoiMatKhau) Button btDoiMatKhau;
    @Bind(R.id.btDangXuat) Button btDangXuat;

    private OnFragmentInteractionListener listener;

    public static TaiKhoanFragment newInstance() {
        return new TaiKhoanFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tai_khoan, container, false);
        ButterKnife.bind(this, view);

        btDoiMatKhau.setOnClickListener(this);
        btDangXuat.setOnClickListener(this);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            listener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btDoiMatKhau:
                startActivity(new Intent(TaiKhoanFragment.this.getActivity(), DoiMatKhauActivity.class));
                break;
            case  R.id.btDangXuat:
                break;
        }
    }

    public interface OnFragmentInteractionListener {
    }

}
