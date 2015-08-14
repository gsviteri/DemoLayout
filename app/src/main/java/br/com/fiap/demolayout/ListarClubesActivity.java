package br.com.fiap.demolayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import adapter.ListarCluberAdapter;
import br.com.fiap.demolayout.pojo.Clube;

public class ListarClubesActivity extends AppCompatActivity {

    private ListView lvClubes;

    Context context = ListarClubesActivity.this;
    List<Clube> myList = new ArrayList<Clube>();

    String[] clubes = new String[]{
            "Corinthians", "Corinthians", "Corinthians","Corinthians","Corinthians","Corinthians",
            "Corinthians","Corinthians","Corinthians","Corinthians","Corinthians","Corinthians",
            "Corinthians","Corinthians","Corinthians",
    };

    int[] imgs = new int[]{
            R.drawable.corinthians, R.drawable.corinthians,R.drawable.corinthians,R.drawable.corinthians,R.drawable.corinthians,
            R.drawable.corinthians,R.drawable.corinthians,R.drawable.corinthians,R.drawable.corinthians,R.drawable.corinthians,
            R.drawable.corinthians,R.drawable.corinthians,R.drawable.corinthians,R.drawable.corinthians,R.drawable.corinthians,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_clubes);


        lvClubes = (ListView) findViewById(R.id.listClubes);

        getDataInList();

        lvClubes.setAdapter(new ListarCluberAdapter(context, myList));
    }

    private void getDataInList() {
        for (int i = 0; i < 15; i++) {
            Clube clube = new Clube();
            clube.setClube("Corinthians");
            clube.setImgResId(R.drawable.corinthians2);

            // Add this object into the ArrayList myList
            myList.add(clube);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listar_clubes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
