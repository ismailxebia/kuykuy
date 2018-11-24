package company.application.pasarudang.ui.pages.news;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import company.application.pasarudang.R;
import company.application.pasarudang.ui.dashboard.HomePage;

//extends our custom BaseActivity
public class NewsActivity extends HomePage {
    LinearLayout dynamicContent,bottonNavBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_matching);


        //dynamically include the  current activity      layout into  baseActivity layout.now all the view of baseactivity is   accessible in current activity.
        dynamicContent = (LinearLayout)  findViewById(R.id.dynamicContent);
        bottonNavBar= (LinearLayout) findViewById(R.id.bottonNavBar);
        View wizard = getLayoutInflater().inflate(R.layout.fragment_news, null);
        dynamicContent.addView(wizard);


        //get the reference of RadioGroup.

        RadioGroup rg=(RadioGroup)findViewById(R.id.radioGroup1);
        RadioButton rb=(RadioButton)findViewById(R.id.watchList);
        RadioButton rb_home=(RadioButton)findViewById(R.id.matching);

        // Change the corresponding icon and text color on nav button click.
        rb.setCompoundDrawablesWithIntrinsicBounds( 0,R.drawable.news_fill, 0,0);
        rb_home.setCompoundDrawablesWithIntrinsicBounds( 0,R.drawable.shop_outline, 0,0);
        rb.setTextColor(Color.parseColor("#000000"));

    }

}
