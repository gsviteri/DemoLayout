package adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.demolayout.R;
import br.com.fiap.demolayout.pojo.Clube;

/**
 * Created by gsviteri on 8/12/15.
 */
public class ListarCluberAdapter extends BaseAdapter {
    List<Clube> myList = new ArrayList<Clube>();
    LayoutInflater inflater;
    Context context;


    public ListarCluberAdapter(Context context, List<Clube> myList) {
        this.myList = myList;
        this.context = context;
        inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Clube getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ClubeViewHolder clubeViewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_clubes, parent, false);
            clubeViewHolder = new ClubeViewHolder(convertView);
            convertView.setTag(clubeViewHolder);
        } else {
            clubeViewHolder = (ClubeViewHolder) convertView.getTag();
        }

        Clube currentListData = getItem(position);

        clubeViewHolder.tvNomeClube.setText(currentListData.getClube());
        clubeViewHolder.ivIcone.setImageResource(currentListData.getImgResId());

        return convertView;
    }

    private class ClubeViewHolder {
        TextView tvNomeClube;
        ImageView ivIcone;

        public ClubeViewHolder(View item) {
            tvNomeClube = (TextView) item.findViewById(R.id.tvNomeClube);
            ivIcone = (ImageView) item.findViewById(R.id.ivClube);
        }
    }
}
