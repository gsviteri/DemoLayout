package br.com.fiap.demolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import adapter.ImageAdapter;

public class GaleriaTimesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria_times);

        GridView gridView = (GridView)findViewById(R.id.gvClubes);
        gridView.setAdapter(new ImageAdapter(this));


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetalheImageActivity.class);
                intent.putExtra("id", position);
                startActivity(intent);

            }
        });
    }


}
