package najrulroconaandupponash.com.nazrulrachanabali;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    private AdRequest adRequest;

    private Context mContext;

    private ArrayList<String> titleText;

    private RecyclerView mRecyclerView;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-2606660907793468/5485595355");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        mContext = MainActivity.this;

        titleText = new ArrayList<String>();

        titleText.add(Constants.কুহেলিকা_০১);
        titleText.add(Constants.কুহেলিকা_০২);
        titleText.add(Constants.কুহেলিকা_০৩);
        titleText.add(Constants.কুহেলিকা_০৪);
        titleText.add(Constants.কুহেলিকা_০৫);
        titleText.add(Constants.কুহেলিকা_০৬);
        titleText.add(Constants.কুহেলিকা_০৭);
        titleText.add(Constants.কুহেলিকা_০৮);
        titleText.add(Constants.কুহেলিকা_০৪);
        titleText.add(Constants.কুহেলিকা_০৯);
        titleText.add(Constants.কুহেলিকা_১০);
        titleText.add(Constants.কুহেলিকা_১১);
        titleText.add(Constants.কুহেলিকা_১২);
        titleText.add(Constants.কুহেলিকা_১৩);
        titleText.add(Constants.কুহেলিকা_১৪);
        titleText.add(Constants.কুহেলিকা_১৫);
        titleText.add(Constants.কুহেলিকা_১৬);
        titleText.add(Constants.কুহেলিকা_১৭);
        titleText.add(Constants.কুহেলিকা_১৮);
        titleText.add(Constants.কুহেলিকা_১৯);
        titleText.add(Constants.কুহেলিকা_২০_শেষ);
        titleText.add(Constants.বাঁধনহারা_পরিচ্ছেদ_০১);
        titleText.add(Constants.বাঁধনহারা_পরিচ্ছেদ_০২);
        titleText.add(Constants.বাঁধনহারা_পরিচ্ছেদ_০৩);
        titleText.add(Constants.বাঁধনহারা_পরিচ্ছেদ_০৪);
        titleText.add(Constants.বাঁধনহারা_পরিচ্ছেদ_০৫);
        titleText.add(Constants.বাঁধনহারা_পরিচ্ছেদ_০৬);
        titleText.add(Constants.বাঁধনহারা_পরিচ্ছেদ_০৭);
        titleText.add(Constants.বাঁধনহারা_পরিচ্ছেদ_০৮_শেষ);
        titleText.add(Constants.মৃত্যুক্ষুধা_০১);
        titleText.add(Constants.মৃত্যুক্ষুধা_০২);
        titleText.add(Constants.মৃত্যুক্ষুধা_০৩);
        titleText.add(Constants.মৃত্যুক্ষুধা_০৪);
        titleText.add(Constants.মৃত্যুক্ষুধা_০৫);
        titleText.add(Constants.মৃত্যুক্ষুধা_০৬);
        titleText.add(Constants.মৃত্যুক্ষুধা_০৭);
        titleText.add(Constants.মৃত্যুক্ষুধা_০৮);
        titleText.add(Constants.মৃত্যুক্ষুধা_০৯);
        titleText.add(Constants.মৃত্যুক্ষুধা_১০);
        titleText.add(Constants.মৃত্যুক্ষুধা_১১);
        titleText.add(Constants.মৃত্যুক্ষুধা_১২);
        titleText.add(Constants.মৃত্যুক্ষুধা_১৩);
        titleText.add(Constants.মৃত্যুক্ষুধা_১৪);
        titleText.add(Constants.মৃত্যুক্ষুধা_১৫);
        titleText.add(Constants.মৃত্যুক্ষুধা_১৬);
        titleText.add(Constants.মৃত্যুক্ষুধা_১৯);
        titleText.add(Constants.মৃত্যুক্ষুধা_১৭);
        titleText.add(Constants.মৃত্যুক্ষুধা_১৮);
        titleText.add(Constants.মৃত্যুক্ষুধা_২০);
        titleText.add(Constants.মৃত্যুক্ষুধা_২১);
        titleText.add(Constants.মৃত্যুক্ষুধা_২২);
        titleText.add(Constants.মৃত্যুক্ষুধা_২৩);
        titleText.add(Constants.মৃত্যুক্ষুধা_২৪);
        titleText.add(Constants.মৃত্যুক্ষুধা_২৫);
        titleText.add(Constants.মৃত্যুক্ষুধা_২৬);
        titleText.add(Constants.মৃত্যুক্ষুধা_২৭);
        titleText.add(Constants.মৃত্যুক্ষুধা_২৮_শেষ);



        mRecyclerView = (RecyclerView) findViewById(R.id.title_layout_recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setHasFixedSize(true);


        TitleAdapter adapter = new TitleAdapter(mContext, titleText, new MyCustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

                Toast.makeText(mContext, "clicked - "+String.valueOf(titleText.get(position)), Toast.LENGTH_SHORT).show();

                Intent desIntent = new Intent(mContext,DescriptionActivity.class);

                desIntent.putExtra("titles",String.valueOf(titleText.get(position)));

                startActivity(desIntent);

            }
        });

        mRecyclerView.setAdapter(adapter);

    }
}