package android.example.tanggalwaktu;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView textViewDate = view.findViewById(R.id.text_date);
        textViewDate.setText(currentDate);

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
        }else if (item.getItemId() == R.id.search){
            startActivity(new Intent(getActivity(), search.class));
        }
        return true;
    }
}
