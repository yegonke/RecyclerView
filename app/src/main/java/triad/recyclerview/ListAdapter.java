package triad.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListModel> listModel;
    private Context context;

    public ListAdapter(List<ListModel> listModel, Context context) {
        this.listModel = listModel;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       ListModel listMode = listModel.get(position);
       holder.head.setText(listMode.getHead());
       holder.subhead.setText(listMode.getSubhead());
    }

    @Override
    public int getItemCount() {
        return listModel.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        public TextView head;
        public  TextView subhead;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            head = itemView.findViewById(R.id.head);
            subhead=itemView.findViewById(R.id.subhead);
        }
    }

}
