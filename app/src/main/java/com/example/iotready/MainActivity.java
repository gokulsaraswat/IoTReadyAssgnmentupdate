package com.example.iotready;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String Data[] = { "PLU" , "Chicken" , "Curry Cut Tare" , "MRP" , "Weight" ,"Price","PLU" , "Chicken" , "Curry Cut Tare" , "MRP" , "Weight" ,"Price"};
    String Values[] = {  "  1  " , "" , "  5g " ,  " 299.0" ,"  0g "  , "  0  ",   "  1  " , "", "  5g " ,  " 299.0" ,"  0g "  , "  0  "};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.dataList);
//        listView1 = (ListView) findViewById(R.id.dataList1);

        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter( getApplicationContext(), Data , Values);
        listView.setAdapter(customBaseAdapter);
    }
}