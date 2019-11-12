package com.boardinfinity.newsline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.boardinfinity.newsline.Adapters.ListAdapterDemo;


public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private String newsname[] = {"Zee News","Aaj Tak","BBC News","CNN News","ABP News","Aljazeera News"};
    private String newsrating[] = {"4.2","4.3","4.5","4.6","4.8","4.0"};
    private Integer newsImage[] = {R.drawable.zeenews,R.drawable.aajtaknews,R.drawable.bbcnews,R.drawable.cnnnews,R.drawable.abpnews,R.drawable.aljazeeranews};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.listview);



        ListAdapterDemo adapter = new ListAdapterDemo(getApplicationContext(),R.layout.news_row ,newsname,newsrating,newsImage);
        mListView.setAdapter(adapter);

    }
}
