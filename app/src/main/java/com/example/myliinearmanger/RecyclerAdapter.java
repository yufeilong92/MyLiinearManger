package com.example.myliinearmanger;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyLiinearManger
 * @Package com.example.myliinearmanger
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018.11.08 上午 10:48
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private Context mContext;
    private List<?> mListDatas;
    private final LayoutInflater mInflater;

    public RecyclerAdapter(Context mContext, List<?> mListDatas) {
        this.mContext = mContext;
        this.mListDatas = mListDatas;
        mInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.item, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.mTvContent.setText((String) mListDatas.get(i));
    }

    @Override
    public int getItemCount() {
        return mListDatas.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTvContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.mTvContent = (TextView) itemView.findViewById(R.id.tv_content);

        }
    }


}
