package com.example.todotasks;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> todoList;
    ArrayAdapter<String>arrayAdapter;
    ListView listView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoList=new ArrayList<>();
        arrayAdapter=new ArrayAdapter<>( this, R.layout.list_view_layout,todoList);
        View listview = findViewById(R.menu);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        });

        editText=findViewById(R.id.id_edit_text);
    }
    public void addItemToList(View view){
        todoList.add(editText.getText().toString());
        arrayAdapter.notifyDataSetChanged();

        editText.setText();
    }

}