package com.xs.xschat.chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.xs.xschat.R;


public class ChatActivity extends AppCompatActivity {

    public final static int LOOPS = 1000;
    public CarouselPagerAdapter adapter;
    public ViewPager pager;
    public static int count = 10; // ViewPager items size
    /**
     * You shouldn't define first page = 0.
     * Lets define firstpage = 'number viewpager size' to make endless carousel
     */
    public static int FIRST_PAGE = 10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chat);

        pager = (ViewPager) findViewById(R.id.vp_chat_carousel);

        //set page margin between pages for viewpager
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int pageMargin = ((metrics.widthPixels / 4) * 2);
        pager.setPageMargin(-pageMargin);

        adapter = new CarouselPagerAdapter(this, getSupportFragmentManager());
        pager.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        pager.addOnPageChangeListener(adapter);

        // set current item to the middle page so we can fling to both
        // directions left and right
        pager.setCurrentItem(FIRST_PAGE);
        pager.setOffscreenPageLimit(3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.chat_settings, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.quick_reply_option:

                Toast.makeText(this, "Quick Reply Activity Here", Toast.LENGTH_SHORT).show();
                break;

            case R.id.schedule_sending_option:

                Toast.makeText(this, "Schedule Sending Activity Here", Toast.LENGTH_SHORT).show();
                break;

            case R.id.add_subject_option:

                Toast.makeText(this, "Add Subject Activity Here", Toast.LENGTH_SHORT).show();
                break;

            case R.id.smiley_option:

                Toast.makeText(this, "Insert Smiley Activity Here", Toast.LENGTH_SHORT).show();
                break;

            case R.id.edit_recipients_option:

                Toast.makeText(this, "Edit Recipients Activity Here", Toast.LENGTH_SHORT).show();
                break;

            case R.id.recipients_menu_option:

                Toast.makeText(this, "Recipients Menu Activity Here", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
