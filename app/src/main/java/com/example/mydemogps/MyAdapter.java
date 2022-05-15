package com.example.mydemogps;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {



    private Context context;
    private ArrayList<MyListData> listdata;


    public MyAdapter(ArrayList<MyListData> listdata/*, RecyclerViewClickListener listener*/) {
        this.listdata = listdata;
        //this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.single_bus_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        /*viewHolder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
listener.onitemClick(view,viewHolder.getAdapterPosition());
            }
        });

*/

        return viewHolder;

    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position)  {

        //final MyListData myListData = listdata.get(position);
        holder.route_number.setText(listdata.get(position).getRoute_number());
        holder.from_address.setText(listdata.get(position).getFrom_address());
        holder.to_address.setText(listdata.get(position).getTo_address());
        holder.via_location.setText(listdata.get(position).getVia_location());




    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder /*implements  View.OnClickListener*/{

        public TextView route_number;
        public TextView from_address;
        public TextView to_address;
        public TextView via_location;
        public Button btn_Route;
        public View container;
        public RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            container=itemView;
            route_number=(TextView) itemView.findViewById(R.id.routenumber);
            from_address=(TextView)itemView.findViewById(R.id.from);
            to_address=(TextView)itemView.findViewById(R.id.to);
            via_location=(TextView)itemView.findViewById(R.id.via);
           //itemView.setOnClickListener(this);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context.getApplicationContext(), "vamsi",Toast.LENGTH_SHORT).show();
                }
            });

        }



       /* @Override
        public void onClick(View view) {
        listener.onClick(view,1);
        }*/
    }


  /*  public interface  RecyclerViewClickListener{
        void onitemClick(View v,int position);

    }*/
}
