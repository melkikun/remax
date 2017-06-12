package com.example.it01.paicong.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.it01.paicong.R;
import com.example.it01.paicong.entities.customer.Datum;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by IT01 on 6/9/2017.
 */

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder>{
    private Context context;
    private List<Datum> list;
    private List<String> url;

    public CustomerAdapter(Context context, List<Datum> list, List<String> url) {
        this.context = context;
        this.list = list;
        this.url = url;
    }

    @Override
    public CustomerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CustomerAdapter.ViewHolder holder, final int position) {
        holder.textView.setText(list.get(position).getCustName().toUpperCase());
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(context.getApplicationContext(), DetailCustomerActivity.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
//                intent.putExtra("nama", holder.textView.getText()+"--");
//                context.startActivity(intent);
            }
        });
        Glide.with(this.context)
                .load(this.url.get(position))
                .error(R.drawable.chrysanthemum)
                .override(600,200)
                .fitCenter()
                .into(holder.circleImageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.nama_customer)
        TextView textView;
        @BindView(R.id.foto_customer)
        CircleImageView circleImageView;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
