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

import views.ecpay.com.postabletecpay.R;
import views.ecpay.com.postabletecpay.view.DoiMatKhau.DoiMatKhauActivity;

/**
 * Created by macbook on 4/28/17.
 */

public class TaiKhoanFragment extends Fragment implements View.OnClickListener {

    private ImageButton ibBack;
    private TextView tvTaiKhoan, tvNgayDangKy, tvTenTaiKhoan, tvCMND, tvDienThoai, tvEmail, tvDiaChi, tvSoTaiKhoan,
            tvSoDuKhaDung, tvLoaiTaiKhoan;
    private Button btDoiMatKhau, btDangXuat;

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
        ibBack = (ImageButton) view.findViewById(R.id.ibBack);
        tvTaiKhoan = (TextView) view.findViewById(R.id.tvTaiKhoan);
        tvNgayDangKy = (TextView) view.findViewById(R.id.tvNgayDangKy);
        tvTenTaiKhoan = (TextView) view.findViewById(R.id.tvTenTaiKhoan);
        tvCMND = (TextView) view.findViewById(R.id.tvCMND);
        tvDienThoai = (TextView) view.findViewById(R.id.tvDienThoai);
        tvEmail = (TextView) view.findViewById(R.id.tvEmail);
        tvDiaChi = (TextView) view.findViewById(R.id.tvDiaChi);
        tvSoTaiKhoan = (TextView) view.findViewById(R.id.tvSoTaiKhoan);
        tvSoDuKhaDung = (TextView) view.findViewById(R.id.tvSoDuKhaDung);
        tvLoaiTaiKhoan = (TextView) view.findViewById(R.id.tvLoaiTaiKhoan);
        btDoiMatKhau = (Button) view.findViewById(R.id.btDoiMatKhau);
        btDangXuat = (Button) view.findViewById(R.id.btDangXuat);

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
