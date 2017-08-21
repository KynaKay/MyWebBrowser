package sg.edu.rp.c346.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Step 1a define the variable for the 3 UI elements
    EditText etURL;
    Button btnLoadURL;
    WebView wvMyPage;

    String[][] sites = {
            {"http://www.rp.edu.sg", "https://www.rp.edu.sg "//www.view pass}
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 2 Bind the 3 UI elements to the 3 variables
        etURL = (EditText)findViewById(R.id.editTextUrl);
        btnLoadURL = (Button)findViewById(R.id.buttonLoad);
        wvMyPage = (WebView)findViewById(R.id.webViewMyPage);

        wvMyPage.setWebViewClient(new WebViewClient());

        // Dynamic ListView add item
        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  [0][0], [0][1]
                // [1][0] [1][1]

                // String url = sites [spinMenu.getSelectedItemPosition()]
                // String url = sites[spinMenu.getSelectedItemPosition()] [0];

                // String url = sites[spinMenu.getSelectedItemPosition()] [1];
                String url = etURL.getText().toString();
                wvMyPage.loadUrl(url);
            }

        });
    }
}
