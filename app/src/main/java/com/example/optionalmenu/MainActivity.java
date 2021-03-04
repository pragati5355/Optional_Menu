package com.example.optionalmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   @Override
   public boolean onCreateOptionsMenu (Menu menu) {

       MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.optionalmenu, menu);
       return true;
   }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

          switch (item.getItemId()){

              case R.id.item1:
                  Toast.makeText(this,"Item1 is Selected",Toast.LENGTH_LONG).show();
                  return true;

              case R.id.item2:
                  Toast.makeText(this,"Item2 is Selected",Toast.LENGTH_LONG).show();
                  return true;

              case R.id.item3:
                  Toast.makeText(this,"Item3 is Selected",Toast.LENGTH_LONG).show();
                  return true;

              case R.id.subitem13:
                  Toast.makeText(this,"SubItem1 of item3 Selected",Toast.LENGTH_LONG).show();
                  return true;

              case R.id.subitem23:
                  Toast.makeText(this,"SubItem2 of Item3 Selected",Toast.LENGTH_LONG).show();
                  return true;

              case R.id.item4:
                  Toast.makeText(this,"Item4 is Selected",Toast.LENGTH_LONG).show();
                  return true;

              case R.id.subitem14:
                  Toast.makeText(this,"SubItem1 of Item4 Selected",Toast.LENGTH_LONG).show();
                  return true;

              case R.id.subitem24:
                  Toast.makeText(this,"SubItem2 of Item4 Selected",Toast.LENGTH_LONG).show();
                  return true;

              case R.id.subitem34:
                  Toast.makeText(this,"SubItem3 of Item4 Selected",Toast.LENGTH_LONG).show();
                  return true;

              case R.id.subitem44:
                  Toast.makeText(this,"SubItem4 of Item4 Selected",Toast.LENGTH_LONG).show();

              default:
          }

          return super.onOptionsItemSelected(item);
    }
}