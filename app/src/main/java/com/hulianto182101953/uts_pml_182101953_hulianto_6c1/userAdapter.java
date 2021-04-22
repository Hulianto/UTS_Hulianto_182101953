package com.hulianto182101953.uts_pml_182101953_hulianto_6c1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hulianto182101953.uts_pml_182101953_hulianto_6c1.model.User;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.CustomViewHolder> {
    private final List<User> dataList;
    private LayoutInflater _inflater;

    public userAdapter (Context context, List<User> dataList) {
        _inflater = LayoutInflater.from(context);
        this.dataList = dataList;
    }

    class CustomViewHolder extends  RecyclerView.ViewHolder{
        public final TextView idText;
        public final TextView usernameText;
        public final TextView nameText;
        public final TextView emailText;
        final userAdapter _adapter;

        public CustomViewHolder(View itemView, userAdapter adapter){
        super(itemView);
        idText = (TextView) itemView.findViewById(R.id.view_id);
        usernameText = (TextView) itemView.findViewById(R.id.view_username);
        nameText = (TextView) itemView.findViewById(R.id.view_name);
        emailText = (TextView) itemView.findViewById(R.id.view_email);
        this._adapter =  adapter;
        }
    }

    @NonNull
    @Override
    public userAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View _ItemView = _inflater.inflate(R.layout.custom_row, parent, false);
        return new CustomViewHolder(_ItemView, this);
    }

    @Override
    public void  onBindViewHolder(@NonNull userAdapter.CustomViewHolder holder, int position){
        String _id = String.valueOf(dataList.get(position).getId());
        holder.idText.setText(_id);

        String _username = dataList.get(position).getUsername();
        holder.usernameText.setText(_username);

        String _name = dataList.get(position).getName();
        holder.nameText.setText(_name);

        String _email = dataList.get(position).getEmail();
        holder.emailText.setText(_email);
    }

    @Override
    public int getItemCount(){return dataList.size();}
}
