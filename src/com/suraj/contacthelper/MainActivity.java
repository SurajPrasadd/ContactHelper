package com.suraj.contacthelper;

import java.io.ObjectOutputStream.PutField;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	ListView contact;
	Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contact=(ListView) findViewById(R.id.listViewcontact);
        
       
        
        String[] name={"Rakesh Sharma","Mukesh Kumar","Eshwar Gowda","Deeman Gowda","Sonu Prasad"};
       String[] number={"9342614182","9845156895","8562356987","8569453698","8756953642"};
        final Bundle cont=new Bundle();
        
        cont.putStringArray("key", number);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, name);
        contact.setAdapter(adapter);
        
        contact.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				switch (position) {
				case 0:
					daill(position);
					//Toast.makeText(MainActivity.this, "selection 1", Toast.LENGTH_SHORT).show();
					
					break;
				case 1:
					daill(position);
					//Toast.makeText(MainActivity.this, "selection 2", Toast.LENGTH_SHORT).show();
					
					break;
				case 2:
					daill(position);
					//Toast.makeText(MainActivity.this, "selection 3", Toast.LENGTH_SHORT).show();
					
					break;
				case 3:
					daill(position);
					//Toast.makeText(MainActivity.this, "selection 4", Toast.LENGTH_SHORT).show();
					
					break;
				case 4:
					daill(position);
					//Toast.makeText(MainActivity.this, "selection 5", Toast.LENGTH_SHORT).show();
					
					break;

				}
				
			}

			private void daill(int position) {
				/*
				 * 
				 * Author=Suraj Prasad
				 * Argument=take position in a listview
				 * implimentation=according to position dail number
				 *doc=7/10/2015
				 * 
				 * 
				 */
				
				String[] l=cont.getStringArray("key");
				intent=new Intent(intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:"+l[position]));
				startActivity(intent);
				
			}
		});
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
