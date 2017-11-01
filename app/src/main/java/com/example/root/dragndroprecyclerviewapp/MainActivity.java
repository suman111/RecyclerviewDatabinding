package com.example.root.dragndroprecyclerviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list;

    private UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.binding_list_activity);

        list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        User user1 = new User("suman", 23, "file:///android_asset/tux1.png");
        User user2 = new User("Milan", 25, "file:///android_asset/lion.png");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        adapter = new UserAdapter(userList);
        list.setAdapter(adapter);
    }
}