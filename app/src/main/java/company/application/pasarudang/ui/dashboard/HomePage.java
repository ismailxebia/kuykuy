package company.application.pasarudang.ui.dashboard;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import company.application.pasarudang.R;
import company.application.pasarudang.ui.pages.news.NewsActivity;
import company.application.pasarudang.ui.pages.store.StoreActivty;

public class HomePage extends AppCompatActivity {
    LinearLayout dynamicContent,bottonNavBar;
    RadioGroup radioGroup1;
    RadioButton deals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);


        radioGroup1=(RadioGroup)findViewById(R.id.radioGroup1);
        deals = (RadioButton)findViewById(R.id.deals);

        setDefault();

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                Intent in;
                Log.i("matching", "matching inside1 bro" + checkedId);
                switch (checkedId)
                {
                    case R.id.matching:
                        Log.i("matching", "matching inside1 matching" +  checkedId);
                        in=new Intent(getBaseContext(), StoreActivty.class);
                        startActivity(in);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case R.id.watchList:
                        Log.i("matching", "matching inside1 watchlistAdapter" + checkedId);
                        in=new Intent(getBaseContext(), NewsActivity.class);
                        startActivity(in);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case R.id.rates:
                        Log.i("matching", "matching inside1 rate" + checkedId);

                        //in = new Intent(getBaseContext(),RatesActivity.class);
                        //startActivity(in);
                        overridePendingTransition(0, 0);
                        break;
                    case R.id.listing:
                        Log.i("matching", "matching inside1 listing" + checkedId);
                        //in = new Intent(getBaseContext(), ListingActivity.class);
                        //startActivity(in);
                        overridePendingTransition(0, 0);
                        break;
                    case R.id.deals:
                        Log.i("matching", "matching inside1 deals" + checkedId);
                        //in = new Intent(getBaseContext(), DealsActivity.class);
                        //startActivity(in);
                        overridePendingTransition(0, 0);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    private void setDefault() {
        RadioGroup rg=(RadioGroup)findViewById(R.id.radioGroup1);
        RadioButton rb=(RadioButton)findViewById(R.id.matching);
        rb.setCompoundDrawablesWithIntrinsicBounds( 0,R.drawable.shop_fill, 0,0);
        rb.setTextColor(Color.parseColor("#000000"));
    }
}