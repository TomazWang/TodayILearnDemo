package me.tomaz.todayilearndemo;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final int MAIN_FRAME_ID = R.id.fram_container;
    private String[] mListStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListData();

        MainListFragment  mainListFragment = MainListFragment.newInstance();

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(MAIN_FRAME_ID, mainListFragment).commit();

    }

    private void initListData() {
        mListStrings = getResources().getStringArray(R.array.main_list);
    }

}
