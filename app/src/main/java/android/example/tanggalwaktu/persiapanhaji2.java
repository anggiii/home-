package android.example.tanggalwaktu;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class persiapanhaji2 extends AppCompatActivity implements View.OnClickListener{
    ImageView im1, im2, im3, im4, im5, im6, im7, im8, im9, im10, im11, im12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persiapanhaji2);

        im1 = findViewById(R.id.persiapan);
        im2 = findViewById(R.id.jamaah);
        im3 = findViewById(R.id.segera);
        im4 = findViewById(R.id.bersabarlah);
        im5 = findViewById(R.id.ikhlas);
        im6 = findViewById(R.id.nabi);
        im7 = findViewById(R.id.berdebat);
        im8 = findViewById(R.id.jgnmaksiat);
        im9 = findViewById(R.id.taubat);
        im10 = findViewById(R.id.harta);
        im11 = findViewById(R.id.teman);
        im12 = findViewById(R.id.talbiyah);

        im1.setOnClickListener(this);
        im2.setOnClickListener(this);
        im3.setOnClickListener(this);
        im4.setOnClickListener(this);
        im5.setOnClickListener(this);
        im6.setOnClickListener(this);
        im7.setOnClickListener(this);
        im8.setOnClickListener(this);
        im9.setOnClickListener(this);
        im10.setOnClickListener(this);
        im11.setOnClickListener(this);
        im12.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.persiapan) {
            startActivity(new Intent(this, keutamaan.class));
        }
        if (view.getId() == R.id.jamaah){
            startActivity(new Intent(this,jamaah.class));
        }
        if (view.getId() == R.id.segera){
            startActivity(new Intent(this, segeralah.class));
        }
        if (view.getId() == R.id.bersabarlah){
            startActivity(new Intent(this, bersabar.class));
        }
        if (view.getId() == R.id.ikhlas){
            startActivity(new Intent(this, ikhlas.class));
        }
        if (view.getId() == R.id.nabi){
            startActivity(new Intent(this, meneladani_nabi.class));
        }
        if (view.getId() == R.id.berdebat){
            startActivity(new Intent(this, berdebat.class));
        }
        if (view.getId() == R.id.jgnmaksiat){
            startActivity(new Intent(this, jgnmaksiat.class));
        }
        if (view.getId() == R.id.taubat){
            startActivity(new Intent(this, taubat.class));
        }
        if (view.getId() == R.id.harta){
            startActivity(new Intent(this, harta_halal.class));
        }
        if (view.getId() == R.id.teman){
            startActivity(new Intent(this, teman.class));
        }
        if (view.getId() == R.id.talbiyah){
            startActivity(new Intent(this, talbiyah.class));
        }
    }
}
