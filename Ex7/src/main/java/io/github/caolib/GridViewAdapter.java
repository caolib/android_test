package io.github.caolib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {
    private final List<Product> list;
    private final Context context;

    public GridViewAdapter(Context context, List<Product> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.grid_view_item, null);
            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.gd_iv);
            viewHolder.title = view.findViewById(R.id.gd_tv);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.imageView.setImageResource(list.get(i).getImg());
        viewHolder.title.setText(list.get(i).getTitle());

        return view;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView title;
    }
}
