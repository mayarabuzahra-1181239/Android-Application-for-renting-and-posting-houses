package com.example.renthouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SearchResults extends AppCompatActivity {
    static String str="";
    LinearLayout l,l2;
    int size = 0;
    Button[] bbtn;
    static int index;
    int []kk;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        l=(LinearLayout) findViewById(R.id.linearlayout);
        AgencyToTenantDB req=new AgencyToTenantDB(this);
        l2=(LinearLayout) findViewById(R.id.content);

        TextView[] tv = new TextView[Search_tenant.c.getCount()];
        TextView temp,temp3,temp5;
        Button btn;
        bbtn = new Button[Search_tenant.c.getCount()];
        System.out.println("\n///////////\n"+Search_tenant.c.getCount());
        HouseDB home=new HouseDB(this);
        kk=new int[Search_tenant.c.getCount()];
        temp5=new TextView(this);
        temp5.setText("Search Results");
        temp5.setTextColor(Color.parseColor("#000000"));
        temp5.setTextSize(TypedValue.COMPLEX_UNIT_SP,26);
        temp5.setGravity(Gravity.CENTER);
        l.addView(temp5);
        if (Search_tenant.c.moveToFirst())
        {   do{
            str=("   City                      "+(Search_tenant.c.getString(2)));
            str+="\n\n   Rental price            "+Float.toString(Search_tenant.c.getFloat(7));

            tv[size] = new TextView(this);
            btn=new Button(this);
            btn.setBackgroundColor(Color.parseColor("#000000"));
            btn.setText("View More");
            btn.setLayoutParams(new LinearLayout.LayoutParams(2000, 160));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(280, 50, 3, 3);
            btn.setLayoutParams(params);

            btn.setTextColor(Color.parseColor("#F6EEEE"));
            tv[size].setText(str+"\n"); //arbitrary task
            tv[size].setTextColor(Color.parseColor("#000000"));
            tv[size].setTypeface(null, Typeface.BOLD);

            tv[size].setLayoutParams(new LinearLayout.LayoutParams
                    (800, 300, 0));


            tv[size].setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
            temp3=new TextView(this);
            //temp3.setText("\n☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐☐");
            LinearLayout l3=new LinearLayout(this);
            l3.setOrientation(LinearLayout.HORIZONTAL);
            l3.addView(tv[size]);
            l3.addView(btn);
            l3.setBackgroundColor(Color.parseColor("#FFEDEDED"));
            l.addView(l3);
            l.addView(temp3);


            bbtn[size]=new Button(this);
            bbtn[size]=btn;
            bbtn[size].setId(size+1);

            GradientDrawable shape = new GradientDrawable();
            shape.setShape(GradientDrawable.RECTANGLE);
            shape.setColor(Color.BLACK);
            shape.setCornerRadius(15);
            bbtn[size].setBackground(shape);
            kk[size]=Search_tenant.c.getInt(0);
            String lines[] = str.split("\\r?\\n");
            bbtn[size].setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    index=kk[view.getId()-1];
                    System.out.println(index+"/////////");
                    Intent intent = new Intent(SearchResults.this,SearchSpecificResult.class);
                    startActivity(intent);
                    finish();
                }
            });

            size++;
        }
        while (Search_tenant.c.moveToNext());
        }


        AnimationDrawable ad= (AnimationDrawable) l2.getBackground();
        ad.setEnterFadeDuration(2500);
        ad.setExitFadeDuration(5000);
        ad.start();

    }

}
