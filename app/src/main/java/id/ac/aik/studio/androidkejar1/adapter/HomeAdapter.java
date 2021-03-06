package id.ac.aik.studio.androidkejar1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.ac.aik.studio.androidkejar1.R;
import id.ac.aik.studio.androidkejar1.mainview.HomeActivity;
import id.ac.aik.studio.androidkejar1.model.HomeModel;

/**
 * Created by Imam on 5/14/2017.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private ArrayList<HomeModel> mHomeModels;
    private Context mContext;

    public HomeAdapter(ArrayList<HomeModel> mHomeModels, Context mContext) {
        this.mHomeModels = mHomeModels;
        this.mContext = mContext;
    }

    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_home_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeAdapter.ViewHolder holder, int position) {
        HomeModel homeModel = mHomeModels.get(position);
        holder.textView1.setText(homeModel.getNama());
        holder.textView4.setText(homeModel.getAlamat());
        holder.textView3.setText(homeModel.getEmail());
        holder.textView4.setText(homeModel.getNoTelp());
    }

    @Override
    public int getItemCount() {
        return mHomeModels.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView1,textView2, textView3,textView4;

        public ViewHolder(View itemView) {
            super(itemView);

            textView1 = (TextView)itemView.findViewById(R.id.nama);
            textView2 = (TextView)itemView.findViewById(R.id.alamat);
            textView3 = (TextView)itemView.findViewById(R.id.email);
            textView4 = (TextView)itemView.findViewById(R.id.noTelp);
        }
    }
}
