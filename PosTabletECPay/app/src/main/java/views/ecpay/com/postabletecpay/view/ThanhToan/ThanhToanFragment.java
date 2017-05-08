package views.ecpay.com.postabletecpay.view.ThanhToan;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import views.ecpay.com.postabletecpay.R;

/**
 * Created by macbook on 4/28/17.
 */

public class ThanhToanFragment extends Fragment implements View.OnClickListener {

    private ImageButton ibBack, ibScaner, ibAdd;
    private EditText etSearch;
    private TextView tvHoaDon, tvTongTien;
    private Button btThanhToan;
    private RecyclerView rvHoaDon;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private OnFragmentInteractionListener listener;

    public static ThanhToanFragment newInstance() {
        return new ThanhToanFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_thanh_toan, container, false);

        ibBack = (ImageButton)view.findViewById(R.id.ibBack);
        ibScaner = (ImageButton)view.findViewById(R.id.ibScaner);
        ibAdd = (ImageButton)view.findViewById(R.id.ibAdd);
        etSearch = (EditText) view.findViewById(R.id.etSearch);
        tvHoaDon = (TextView) view.findViewById(R.id.tvHoaDon);
        tvTongTien = (TextView) view.findViewById(R.id.tvTongTien);
        btThanhToan = (Button) view.findViewById(R.id.btThanhToan);
        rvHoaDon = (RecyclerView) view.findViewById(R.id.rvHoaDon);
        tabLayout = (TabLayout)view.findViewById(R.id.tabs);
        viewPager = (ViewPager)view.findViewById(R.id.view_pager);

        ibBack.setOnClickListener(this);
        ibScaner.setOnClickListener(this);
        ibAdd.setOnClickListener(this);
        btThanhToan.setOnClickListener(this);

        viewPager.setAdapter(new TimKiemAdapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        etSearch.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus) {
                    tabLayout.setVisibility(View.VISIBLE);
                } else {
                    tabLayout.setVisibility(View.GONE);
                }
            }
        });

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
            case R.id.ibBack:
                break;
            case R.id.ibScaner:
                break;
            case R.id.ibAdd:
                break;
            case R.id.btThanhToan:
                showDialogThanhToan();
                break;
        }
    }

    private void showDialogThanhToan() {
        final Dialog dialog = new Dialog(this.getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_thanhtoan);
        dialog.getWindow().setLayout(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        TextView tvSoHoaDon = (TextView) dialog.findViewById(R.id.tvSoHoaDon);
        TextView tvTongTien = (TextView) dialog.findViewById(R.id.tvTongTien);
        RecyclerView rvDanhSach = (RecyclerView) dialog.findViewById(R.id.rvDanhSach);
        Button btHuy = (Button) dialog.findViewById(R.id.btHuy);
        Button btThanhToan = (Button) dialog.findViewById(R.id.btThanhToan);

        btHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btThanhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        dialog.show();
    }

    public interface OnFragmentInteractionListener {
    }
}
