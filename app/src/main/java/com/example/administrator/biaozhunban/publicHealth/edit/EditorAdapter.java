package com.example.administrator.biaozhunban.publicHealth.edit;

import android.content.Context;
import android.graphics.Color;

import com.example.administrator.biaozhunban.R;
import com.zhy.adapter.abslistview.CommonAdapter;
import com.zhy.adapter.abslistview.ViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2018/2/25.
 */

public class EditorAdapter extends CommonAdapter<String> {

    private int selected=0;
    private Context context;

    public EditorAdapter(Context context, List<String> datas) {
        super(context, R.layout.public_health_editor_item_layout, datas);
        this.context=context;
    }

    @Override
    protected void convert(ViewHolder viewHolder, String item, int position) {
        viewHolder.setText(R.id.title,item);
        if(position==selected){
            viewHolder.setBackgroundColor(R.id.root,context.getResources().getColor(R.color.blue2));
            viewHolder.setTextColor(R.id.title,Color.WHITE);
        }else{
            viewHolder.setBackgroundColor(R.id.root,Color.WHITE);
            viewHolder.setTextColor(R.id.title,context.getResources().getColor(R.color.gray2));
        }

    }

    public boolean changeSelectedPosi(int posi){//暴露出的刷新接口
        if(selected!=posi){
            selected=posi;
            notifyDataSetChanged();
            return true;
        }
        return false;
    }


}
