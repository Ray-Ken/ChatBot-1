package com.example.viswa.chatbot.Adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.viswa.chatbot.Models.ChatModel;
import com.example.viswa.chatbot.R;
import com.github.library.bubbleview.BubbleTextView;

import java.util.List;

/**
 * Created by viswa on 22-02-2018.
 */

public class CustomAdapter extends BaseAdapter
{

    private List<ChatModel> list_chat_Models;
    private Context context;
    private LayoutInflater layoutInflater;

    public CustomAdapter(List<ChatModel> list_chat_Models, Context context) {
        this.list_chat_Models = list_chat_Models;
        this.context = context;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list_chat_Models.size();
    }

    @Override
    public Object getItem(int position) {
        return list_chat_Models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        if(view==null)
        {
            if(list_chat_Models.get(position).isSend)
                view=layoutInflater.inflate(R.layout.list_item_message_send,null);
            else
                view=layoutInflater.inflate(R.layout.list_item_message_recieve,null);
        }
        BubbleTextView text_message=(BubbleTextView)view.findViewById(R.id.text_message);
        text_message.setText(list_chat_Models.get(position).message);
        return view;
    }
}
