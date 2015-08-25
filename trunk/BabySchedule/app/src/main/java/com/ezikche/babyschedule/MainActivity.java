package com.ezikche.babyschedule;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity
        implements ItemFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Display display = getWindowManager().getDefaultDisplay();
//        Point size = new Point();
//        display.getSize(size);

        //            rightFragment fragment2 = new rightFragment();
//            getFragmentManager().beginTransaction().replace(R.id.large_layout, fragment2).commit();
//        if ( size.x < size.y) {
//            setContentView(R.layout.layout);
//            ItemFragment fragment1 = new ItemFragment();
//            getFragmentManager().beginTransaction().replace(R.id.simple_layout, fragment1).commit();
//        }
//        else
            setContentView(R.layout.layout_large);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(String id, int position)
    {
        Toast.makeText(this, id, Toast.LENGTH_LONG).show();

        View view = getFragmentManager().findFragmentById(R.id.right_fragment).getView();

        switch (position)
        {
            case 0: {
                EatFragment eatFragment = new EatFragment();
            getFragmentManager().beginTransaction().replace(R.id.right_fragment, eatFragment).commit();
//                view.setBackgroundColor(Color.CYAN);
                break;
            }
            case 1: {
                view.setBackgroundColor(Color.RED);
                break;
            }
            case 2: {
                view.setBackgroundColor(Color.YELLOW);
                break;
            }
            default:
                view.setBackgroundColor(Color.BLACK);
                break;
        }
    }
}
