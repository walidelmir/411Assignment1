package com.example.gridlayout;

import android.app.Activity;
import android.os.Bundle;

import android.graphics.Color;
import android.graphics.Typeface;

import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import android.widget.GridLayout.LayoutParams;

public class Ass1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HorizontalScrollView horizontalScrollView1 = new HorizontalScrollView(this);
        //horizontalScrollView1.setId(R.id.horizontalScrollView1);
        LayoutParams layout_81 = new LayoutParams();
        layout_81.width = LayoutParams.WRAP_CONTENT;
        layout_81.height = LayoutParams.WRAP_CONTENT;
        horizontalScrollView1.setLayoutParams(layout_81);

        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(5);
        gridLayout.setOrientation(GridLayout.HORIZONTAL);
        //gridLayout.setBackgroundColor(Color.parseColor("#000000"));
        gridLayout.setRowCount(11);
        LayoutParams layout = new LayoutParams();
        layout.width = LayoutParams.WRAP_CONTENT;
        layout.height = LayoutParams.WRAP_CONTENT;
        gridLayout.setLayoutParams(layout);

        TextView textView1 = new TextView(this);
        textView1.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView1.setText("1");
        textView1.setGravity(Gravity.CENTER);
        textView1.setTextSize(14);
        LayoutParams layout1 = new LayoutParams(GridLayout.spec(0), GridLayout.spec(0));
        layout1.width = 50;
        //layout1.bottomMargin = 2;
        textView1.setLayoutParams(layout1);
        gridLayout.addView(textView1);

        TextView textView2 = new TextView(this);
        textView2.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView2.setText("2");
        textView2.setGravity(Gravity.CENTER);
        textView2.setTextSize(14);
        LayoutParams layout2 = new LayoutParams(GridLayout.spec(1), GridLayout.spec(0));
        layout2.width = 50;
        textView2.setLayoutParams(layout2);
        gridLayout.addView(textView2);

        TextView textView3 = new TextView(this);
        textView3.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView3.setText("3");
        textView3.setGravity(Gravity.CENTER);
        textView3.setTextSize(14);
        LayoutParams layout3 = new LayoutParams(GridLayout.spec(2), GridLayout.spec(0));
        layout3.width = 50;
        textView3.setLayoutParams(layout3);
        gridLayout.addView(textView3);

        TextView textView4 = new TextView(this);
        textView4.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView4.setText("4");
        textView4.setGravity(Gravity.CENTER);
        textView4.setTextSize(14);
        LayoutParams layout4 = new LayoutParams(GridLayout.spec(3), GridLayout.spec(0));
        layout4.width = 50;
        textView4.setLayoutParams(layout4);
        gridLayout.addView(textView4);

        TextView textView5 = new TextView(this);
        textView5.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView5.setText("5");
        textView5.setGravity(Gravity.CENTER);
        textView5.setTextSize(14);
        LayoutParams layout5 = new LayoutParams(GridLayout.spec(4), GridLayout.spec(0));
        layout5.width = 50;
        textView5.setLayoutParams(layout5);
        gridLayout.addView(textView5);

        TextView textView6 = new TextView(this);
        textView6.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView6.setText("6");
        textView6.setGravity(Gravity.CENTER);
        textView6.setTextSize(14);
        LayoutParams layout6 = new LayoutParams(GridLayout.spec(5), GridLayout.spec(0));
        layout6.width = 50;
        textView6.setLayoutParams(layout6);
        gridLayout.addView(textView6);

        TextView textView7 = new TextView(this);
        textView7.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView7.setText("7");
        textView7.setGravity(Gravity.CENTER);
        textView7.setTextSize(14);
        LayoutParams layout7 = new LayoutParams(GridLayout.spec(6), GridLayout.spec(0));
        layout7.width = 50;
        textView7.setLayoutParams(layout7);
        gridLayout.addView(textView7);

        TextView textView8 = new TextView(this);
        textView8.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView8.setText("8");
        textView8.setGravity(Gravity.CENTER);
        textView8.setTextSize(14);
        LayoutParams layout8 = new LayoutParams(GridLayout.spec(7), GridLayout.spec(0));
        layout8.width = 50;
        textView8.setLayoutParams(layout8);
        gridLayout.addView(textView8);

        TextView textView9 = new TextView(this);
        textView9.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView9.setText("9");
        textView9.setGravity(Gravity.CENTER);
        textView9.setTextSize(14);
        LayoutParams layout9 = new LayoutParams(GridLayout.spec(8), GridLayout.spec(0));
        layout9.width = 50;
        textView9.setLayoutParams(layout9);
        gridLayout.addView(textView9);

        TextView textView10 = new TextView(this);
        textView10.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView10.setText("10");
        textView10.setGravity(Gravity.CENTER);
        textView10.setTextSize(14);
        LayoutParams layout10 = new LayoutParams(GridLayout.spec(9), GridLayout.spec(0));
        layout10.width = 50;
        textView10.setLayoutParams(layout10);
        gridLayout.addView(textView10);

        TextView textView11 = new TextView(this);
        textView11.setBackgroundColor(Color.parseColor("#A89F9F"));
        textView11.setText("11");
        textView11.setGravity(Gravity.CENTER);
        textView11.setTextSize(14);
        LayoutParams layout11 = new LayoutParams(GridLayout.spec(10), GridLayout.spec(0));
        layout11.width = 50;
        textView11.setLayoutParams(layout11);
        gridLayout.addView(textView11);


        TextView textView12 = new TextView(this);
        textView12.setBackgroundColor(Color.parseColor("#0E0D0D"));
        textView12.setGravity(Gravity.CENTER);
        textView12.setText("Rules void hello1(int hours)");
        textView12.setTextColor(Color.parseColor("#EDF2F3"));
        textView12.setTextSize(12);
        LayoutParams layout12 = new LayoutParams(GridLayout.spec(0), GridLayout.spec(1,4));
        layout12.width = 1500;
        layout12.height = 48;
        textView12.setLayoutParams(layout12);
        gridLayout.addView(textView12);



        TextView textView13 = new TextView(this);
        textView13.setBackgroundColor(Color.parseColor("#E5E6E7"));
        textView13.setGravity(Gravity.CENTER);
        textView13.setText("properties");
        textView13.setTextSize(12);
        LayoutParams layout13 = new LayoutParams(GridLayout.spec(1,2), GridLayout.spec(1));
        layout13.width = 300;
        layout13.height = 104;
        textView13.setLayoutParams(layout13);
        gridLayout.addView(textView13);


        TextView textView14 = new TextView(this);
        textView14.setBackgroundColor(Color.parseColor("#E5E6E7"));
        textView14.setGravity(Gravity.CENTER);
        textView14.setText("name");
        textView14.setTextSize(12);
        LayoutParams layout14 = new LayoutParams(GridLayout.spec(1), GridLayout.spec(2,2));
        layout14.width = 400;
        layout14.height = 48;
        textView14.setLayoutParams(layout14);
        gridLayout.addView(textView14);

        TextView textView15 = new TextView(this);
        textView15.setBackgroundColor(Color.parseColor("#E5E6E7"));
        textView15.setGravity(Gravity.CENTER);
        textView15.setText("category");
        textView15.setTextSize(12);
        LayoutParams layout15 = new LayoutParams(GridLayout.spec(2), GridLayout.spec(2,2));
        layout15.width = 400;
        layout15.height = 48;
        textView15.setLayoutParams(layout15);
        gridLayout.addView(textView15);

        TextView textView16 = new TextView(this);
        textView16.setBackgroundColor(Color.parseColor("#E5E6E7"));
        textView16.setGravity(Gravity.LEFT);
        textView16.setText("Day hour classification");
        textView16.setTextSize(12);
        LayoutParams layout16 = new LayoutParams(GridLayout.spec(1), GridLayout.spec(4));
        layout16.width = 500;
        layout16.height = 48;
        textView16.setLayoutParams(layout16);
        gridLayout.addView(textView16);

        TextView textView17 = new TextView(this);
        textView17.setBackgroundColor(Color.parseColor("#E5E6E7"));
        textView17.setGravity(Gravity.LEFT);
        textView17.setText("Day and time");
        textView17.setTextSize(12);
        LayoutParams layout17 = new LayoutParams(GridLayout.spec(2), GridLayout.spec(4));
        layout17.width = 500;
        layout17.height = 48;
        textView17.setLayoutParams(layout17);
        gridLayout.addView(textView17);


        TextView textView18 = new TextView(this);
        textView18.setBackgroundColor(Color.parseColor("#009688"));
        textView18.setGravity(Gravity.CENTER);
        textView18.setText("Rule");
        textView18.setTextSize(12);
        textView18.setTypeface(null,Typeface.BOLD);
        LayoutParams layout18 = new LayoutParams(GridLayout.spec(3), GridLayout.spec(1));
        layout18.width = 300;
        layout18.height = 48;
        textView18.setLayoutParams(layout18);
        gridLayout.addView(textView18);

        TextView textView19 = new TextView(this);
        textView19.setBackgroundColor(Color.parseColor("#009688"));
        textView19.setGravity(Gravity.CENTER);
        textView19.setText("C1");
        textView19.setTextSize(12);
        textView19.setTypeface(null,Typeface.BOLD);
        LayoutParams layout19 = new LayoutParams(GridLayout.spec(3), GridLayout.spec(2,2));
        layout19.width = 400;
        layout19.height = 48;
        layout19.rightMargin = 2;
        textView19.setLayoutParams(layout19);
        gridLayout.addView(textView19);

        TextView textView20 = new TextView(this);
        textView20.setBackgroundColor(Color.parseColor("#009688"));
        textView20.setGravity(Gravity.CENTER);
        textView20.setText("A1");
        textView20.setTextSize(12);
        LayoutParams layout20 = new LayoutParams(GridLayout.spec(3), GridLayout.spec(4));
        layout20.width = 500;
        layout20.height = 48;
        textView20.setLayoutParams(layout20);
        gridLayout.addView(textView20);


        TextView textView21 = new TextView(this);
        textView21.setBackgroundColor(Color.parseColor("#009688"));
        textView21.setGravity(Gravity.CENTER);
        textView21.setText("");
        textView21.setTextSize(12);
        LayoutParams layout21 = new LayoutParams(GridLayout.spec(4), GridLayout.spec(1));
        layout21.width = 300;
        layout21.height = 48;
        textView21.setLayoutParams(layout21);
        gridLayout.addView(textView21);

        TextView textView22 = new TextView(this);
        textView22.setBackgroundColor(Color.parseColor("#009688"));
        textView22.setGravity(Gravity.CENTER);
        textView22.setText("min<=hour && hour<=max");
        textView22.setTextSize(12);
        textView22.setTypeface(null,Typeface.BOLD);
        LayoutParams layout22 = new LayoutParams(GridLayout.spec(4), GridLayout.spec(2,2));
        layout22.width = 400;
        layout22.height = 48;
        textView22.setLayoutParams(layout22);
        gridLayout.addView(textView22);

        TextView textView23 = new TextView(this);
        textView23.setBackgroundColor(Color.parseColor("#009688"));
        textView23.setGravity(Gravity.CENTER);
        textView23.setText("System.out.println(greeting +\"  , World!");
        textView23.setTextSize(12);
        LayoutParams layout23 = new LayoutParams(GridLayout.spec(4), GridLayout.spec(4));
        layout23.width = 500;
        layout23.height = 46;
        textView23.setLayoutParams(layout23);
        gridLayout.addView(textView23);


        TextView textView24 = new TextView(this);
        textView24.setBackgroundColor(Color.parseColor("#009688"));
        textView24.setGravity(Gravity.CENTER);
        textView24.setText("");
        textView24.setTextSize(12);
        textView24.setTypeface(null,Typeface.BOLD);
        LayoutParams layout24 = new LayoutParams(GridLayout.spec(5), GridLayout.spec(1));
        layout24.width = 300;
        layout24.height = 48;
        layout24.rightMargin = 2;
        textView24.setLayoutParams(layout24);
        gridLayout.addView(textView24);

        TextView textView25 = new TextView(this);
        textView25.setBackgroundColor(Color.parseColor("#009688"));
        textView25.setGravity(Gravity.CENTER);
        textView25.setText("int min");
        textView25.setTextSize(12);
        textView25.setTypeface(null,Typeface.BOLD);
        LayoutParams layout25 = new LayoutParams(GridLayout.spec(5), GridLayout.spec(2));
        layout25.width = 199;
        layout25.height = 48;
        layout25.rightMargin = 2;
        textView25.setLayoutParams(layout25);
        gridLayout.addView(textView25);


        TextView textView26 = new TextView(this);
        textView26.setBackgroundColor(Color.parseColor("#009688"));
        textView26.setGravity(Gravity.CENTER);
        textView26.setText("int max");
        textView26.setTextSize(12);
        textView26.setTypeface(null,Typeface.BOLD);
        LayoutParams layout26 = new LayoutParams(GridLayout.spec(5), GridLayout.spec(3));
        layout26.width = 199;
        layout26.height = 48;
        textView26.setLayoutParams(layout26);
        gridLayout.addView(textView26);


        TextView textView27 = new TextView(this);
        textView27.setBackgroundColor(Color.parseColor("#009688"));
        textView27.setGravity(Gravity.CENTER);
        textView27.setText("String greeting");
        textView27.setTextSize(12);
        LayoutParams layout27 = new LayoutParams(GridLayout.spec(5), GridLayout.spec(4));
        layout27.width = 500;
        layout27.height = 48;
        textView27.setLayoutParams(layout27);
        gridLayout.addView(textView27);

        TextView textView28 = new TextView(this);
        textView28.setBackgroundColor(Color.parseColor("#E5E6E7"));
        textView28.setGravity(Gravity.LEFT);
        textView28.setText("Rule");
        textView28.setTextSize(12);
        textView28.setTypeface(null,Typeface.BOLD);
        LayoutParams layout28 = new LayoutParams(GridLayout.spec(6), GridLayout.spec(1));
        layout28.width = 300;
        layout28.height = 48;
        textView28.setLayoutParams(layout28);
        gridLayout.addView(textView28);

        TextView textView29 = new TextView(this);
        textView29.setBackgroundColor(Color.parseColor("#E5E6E7"));
        textView29.setGravity(Gravity.LEFT);
        textView29.setText("R10");
        textView29.setTextSize(12);
        LayoutParams layout29 = new LayoutParams(GridLayout.spec(7), GridLayout.spec(1));
        layout29.width = 300;
        layout29.height = 48;
        textView29.setLayoutParams(layout29);
        gridLayout.addView(textView29);

        TextView textView30 = new TextView(this);
        textView30.setBackgroundColor(Color.parseColor("#E5E6E7"));
        textView30.setGravity(Gravity.LEFT);
        textView30.setText("R20");
        textView30.setTextSize(12);
        LayoutParams layout30 = new LayoutParams(GridLayout.spec(8), GridLayout.spec(1));
        layout30.width = 300;
        layout30.height = 48;
        textView30.setLayoutParams(layout30);
        gridLayout.addView(textView30);

        TextView textView31 = new TextView(this);
        textView31.setBackgroundColor(Color.parseColor("#E5E6E7"));
        textView31.setGravity(Gravity.LEFT);
        textView31.setText("R30");
        textView31.setTextSize(12);
        LayoutParams layout31 = new LayoutParams(GridLayout.spec(9), GridLayout.spec(1));
        layout31.width = 300;
        layout31.height = 48;
        textView31.setLayoutParams(layout31);
        gridLayout.addView(textView31);

        TextView textView32 = new TextView(this);
        textView32.setBackgroundColor(Color.parseColor("#E5E6E7"));
        textView32.setGravity(Gravity.LEFT);
        textView32.setText("R40");
        textView32.setTextSize(12);
        LayoutParams layout32 = new LayoutParams(GridLayout.spec(10), GridLayout.spec(1));
        layout32.width = 300;
        layout32.height = 48;
        textView32.setLayoutParams(layout32);
        gridLayout.addView(textView32);

        TextView textView33 = new TextView(this);
        textView33.setBackgroundColor(Color.parseColor("#8BFFEB3B"));
        textView33.setGravity(Gravity.LEFT);
        textView33.setText("From");
        textView33.setTextSize(12);
        textView33.setTypeface(null,Typeface.BOLD);
        LayoutParams layout33 = new LayoutParams(GridLayout.spec(6), GridLayout.spec(2));
        layout33.width = 199;
        layout33.height = 48;
        layout33.rightMargin = 2;
        textView33.setLayoutParams(layout33);
        gridLayout.addView(textView33);


        TextView textView34 = new TextView(this);
        textView34.setBackgroundColor(Color.parseColor("#8BFFEB3B"));
        textView34.setGravity(Gravity.RIGHT);
        textView34.setText("0");
        textView34.setTextSize(12);
        LayoutParams layout34 = new LayoutParams(GridLayout.spec(7), GridLayout.spec(2));
        layout34.width = 199;
        layout34.height = 48;
        layout34.rightMargin = 2;
        textView34.setLayoutParams(layout34);
        gridLayout.addView(textView34);

        TextView textView35 = new TextView(this);
        textView35.setBackgroundColor(Color.parseColor("#8BFFEB3B"));
        textView35.setGravity(Gravity.RIGHT);
        textView35.setText("12");
        textView35.setTextSize(12);
        LayoutParams layout35 = new LayoutParams(GridLayout.spec(8), GridLayout.spec(2));
        layout35.width = 199;
        layout35.height = 48;
        layout35.rightMargin = 2;
        textView35.setLayoutParams(layout35);
        gridLayout.addView(textView35);

        TextView textView36 = new TextView(this);
        textView36.setBackgroundColor(Color.parseColor("#8BFFEB3B"));
        textView36.setGravity(Gravity.RIGHT);
        textView36.setText("18");
        textView36.setTextSize(12);
        LayoutParams layout36 = new LayoutParams(GridLayout.spec(9), GridLayout.spec(2));
        layout36.width = 199;
        layout36.height = 48;
        layout36.rightMargin = 2;
        textView36.setLayoutParams(layout36);
        gridLayout.addView(textView36);

        TextView textView37 = new TextView(this);
        textView37.setBackgroundColor(Color.parseColor("#8BFFEB3B"));
        textView37.setGravity(Gravity.RIGHT);
        textView37.setText("22");
        textView37.setTextSize(12);
        LayoutParams layout37 = new LayoutParams(GridLayout.spec(10), GridLayout.spec(2));
        layout37.width = 199;
        layout37.height = 48;
        layout37.rightMargin = 2;
        textView37.setLayoutParams(layout37);
        gridLayout.addView(textView37);


        TextView textView38 = new TextView(this);
        textView38.setBackgroundColor(Color.parseColor("#8BFFEB3B"));
        textView38.setGravity(Gravity.LEFT);
        textView38.setText("To");
        textView38.setTextSize(12);
        LayoutParams layout38 = new LayoutParams(GridLayout.spec(6), GridLayout.spec(3));
        layout38.width = 199;
        layout38.height = 48;
        textView38.setLayoutParams(layout38);
        gridLayout.addView(textView38);

        TextView textView39 = new TextView(this);
        textView39.setBackgroundColor(Color.parseColor("#8BFFEB3B"));
        textView39.setGravity(Gravity.RIGHT);
        textView39.setText("11");
        textView39.setTextSize(12);
        LayoutParams layout39 = new LayoutParams(GridLayout.spec(7), GridLayout.spec(3));
        layout39.width = 199;
        layout39.height = 48;
        textView39.setLayoutParams(layout39);
        gridLayout.addView(textView39);

        TextView textView40 = new TextView(this);
        textView40.setBackgroundColor(Color.parseColor("#8BFFEB3B"));
        textView40.setGravity(Gravity.RIGHT);
        textView40.setText("17");
        textView40.setTextSize(12);
        LayoutParams layout40 = new LayoutParams(GridLayout.spec(8), GridLayout.spec(3));
        layout40.width = 199;
        layout40.height = 48;
        textView40.setLayoutParams(layout40);
        gridLayout.addView(textView40);

        TextView textView41 = new TextView(this);
        textView41.setBackgroundColor(Color.parseColor("#8BFFEB3B"));
        textView41.setGravity(Gravity.RIGHT);
        textView41.setText("21");
        textView41.setTextSize(12);
        LayoutParams layout41 = new LayoutParams(GridLayout.spec(9), GridLayout.spec(3));
        layout41.width = 199;
        layout41.height = 48;
        textView41.setLayoutParams(layout41);
        gridLayout.addView(textView41);

        TextView textView42 = new TextView(this);
        textView42.setBackgroundColor(Color.parseColor("#8BFFEB3B"));
        textView42.setGravity(Gravity.RIGHT);
        textView42.setText("23");
        textView42.setTextSize(12);
        LayoutParams layout42 = new LayoutParams(GridLayout.spec(10), GridLayout.spec(3));
        layout42.width = 199;
        layout42.height = 48;
        textView42.setLayoutParams(layout42);
        gridLayout.addView(textView42);

        TextView textView43 = new TextView(this);
        textView43.setBackgroundColor(Color.parseColor("#9FFF9800"));
        textView43.setGravity(Gravity.LEFT);
        textView43.setText("Greeting");
        textView43.setTextSize(12);
        LayoutParams layout43 = new LayoutParams(GridLayout.spec(6), GridLayout.spec(4));
        layout43.width = 500;
        layout43.height = 48;
        textView43.setTypeface(null,Typeface.BOLD);
        textView43.setLayoutParams(layout43);
        gridLayout.addView(textView43);

        TextView textView44 = new TextView(this);
        textView44.setBackgroundColor(Color.parseColor("#9FFF9800"));
        textView44.setGravity(Gravity.LEFT);
        textView44.setText("Good Morning");
        textView44.setTextSize(12);
        LayoutParams layout44 = new LayoutParams(GridLayout.spec(7), GridLayout.spec(4));
        layout44.width = 500;
        layout44.height = 48;
        textView44.setLayoutParams(layout44);
        gridLayout.addView(textView44);

        TextView textView45 = new TextView(this);
        textView45.setBackgroundColor(Color.parseColor("#9FFF9800"));
        textView45.setGravity(Gravity.LEFT);
        textView45.setText("Good Afternoon");
        textView45.setTextSize(12);
        LayoutParams layout45 = new LayoutParams(GridLayout.spec(8), GridLayout.spec(4));
        layout45.width = 500;
        layout45.height = 48;
        textView45.setLayoutParams(layout45);
        gridLayout.addView(textView45);

        TextView textView46 = new TextView(this);
        textView46.setBackgroundColor(Color.parseColor("#9FFF9800"));
        textView46.setGravity(Gravity.LEFT);
        textView46.setText("Good Evening");
        textView46.setTextSize(12);
        LayoutParams layout46 = new LayoutParams(GridLayout.spec(9), GridLayout.spec(4));
        layout46.width = 500;
        layout46.height = 48;
        textView46.setLayoutParams(layout46);
        gridLayout.addView(textView46);

        TextView textView47 = new TextView(this);
        textView47.setBackgroundColor(Color.parseColor("#9FFF9800"));
        textView47.setGravity(Gravity.LEFT);
        textView47.setText("Good Night");
        textView47.setTextSize(12);
        LayoutParams layout47 = new LayoutParams(GridLayout.spec(10), GridLayout.spec(4));
        layout47.width = 500;
        layout47.height = 48;
        textView47.setLayoutParams(layout47);
        gridLayout.addView(textView47);


        //horizontalScrollView1.addView(gridLayout);
        setContentView(gridLayout);

    }
}