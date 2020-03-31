package android.example.tanggalwaktu;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends Fragment implements View.OnClickListener {
    Button button;
    ImageView im1, im2, im3;
    CardView crd1, crd2, crd3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(calendar.getTime());
        TextView textViewDate = view.findViewById(R.id.textdate);
        textViewDate.setText(currentDate);

        Calendar calendar1 = Calendar.getInstance();
        String jamskrg = DateFormat.getTimeInstance(DateFormat.SHORT).format(calendar1.getTime());
        TextView textView = view.findViewById(R.id.jam);
        textView.setText(jamskrg);

        crd1 = view.findViewById(R.id.crdpersiapan);
        crd2 = view.findViewById(R.id.crddoa);
        crd3 = view.findViewById(R.id.crdfiqihumroh);

        crd1.setOnClickListener(this);
        crd2.setOnClickListener(this);
        crd3.setOnClickListener(this);


        button = view.findViewById(R.id.buton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), Maps.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.optionmenu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()== R.id.daftar){
            startActivity(new Intent(getActivity(), DaftarIsi.class));
        } else if (item.getItemId() == R.id.rate){
            startActivity(new Intent(getActivity(), Rate.class));
        }else if (item.getItemId() == R.id.tentang){
            startActivity(new Intent(getActivity(),Tentang.class));
        }else if (item.getItemId() == R.id.search) {
            startActivity(new Intent(getActivity(), search.class));
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.crdpersiapan:
                startActivity(new Intent(getActivity(), persiapanhaji.class));
                break;
            case R.id.crdfiqihumroh:
                startActivity(new Intent(getActivity(), FiqihUmrah.class));
                break;
            case R.id.crddoa:
                startActivity(new Intent(getActivity(), DzikirDoa.class));
                break;
            default:
               break;
        }
    }
}
