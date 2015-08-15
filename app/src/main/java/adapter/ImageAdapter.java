package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import br.com.fiap.demolayout.R;

/**
 * Created by gsviteri on 8/10/15.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    private Integer[] mImagens = {
            R.drawable.corinthians2,
            R.drawable.atl_mineiro,
            R.drawable.botafogo,
            R.drawable.coritiba,
            R.drawable.cruzeiro,
            R.drawable.fluminense,
            R.drawable.flamengo,
            R.drawable.goias,
            R.drawable.gremio,
            R.drawable.guarani,
            R.drawable.internacional,
            R.drawable.juventude,
            R.drawable.palmeiras,
            R.drawable.paysandu,
            R.drawable.ponte_preta,
            R.drawable.sao_caetano,
            R.drawable.vitoria
    };

    public ImageAdapter(Context context){
        this.mContext = context;
    }

    @Override
    public int getCount(){
        return mImagens.length;
    }

    @Override
    public Object getItem(int position) {
        return mImagens[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // converview - onde esta vindo nossa view

        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.imagem_grid, parent, false);
        }

        ImageView ivClube = (ImageView)convertView.findViewById(R.id.ivClube);
        ivClube.setImageResource(mImagens[position]);

        return convertView;

    }


}
