package dicj.info.ageecj.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import dicj.info.ageecj.R;
import dicj.info.ageecj.model.ItemSliderMenu;

/**
 * Created by utilisateur on 2017-02-06.
 */
public class SlidingMenuAdapter extends BaseAdapter {

    private Context context;
    private List<ItemSliderMenu> lstItem;

    public SlidingMenuAdapter(List<ItemSliderMenu> lstItem, Context context) {
        this.lstItem = lstItem;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lstItem.size();
    }

    @Override
    public Object getItem(int position) {
        return lstItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.item_sliding_menu, null);
        ImageView img = (ImageView)v.findViewById(R.id.item_img);
        TextView tv = (TextView)v.findViewById(R.id.item_title);

        ItemSliderMenu item = lstItem.get(position);
        img.setImageResource(item.getImgId());
        tv.setText(item.getTitle());

        return v;
    }
}
