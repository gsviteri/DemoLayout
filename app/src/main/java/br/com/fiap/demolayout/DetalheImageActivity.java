package br.com.fiap.demolayout;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import adapter.ImageAdapter;

public class DetalheImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_image);

        int position = getIntent().getExtras().getInt("id");

        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView ivImagem = (ImageView) findViewById(R.id.ivImagem);
        ivImagem.setImageResource((Integer)imageAdapter.getItem(position));



    }


}
