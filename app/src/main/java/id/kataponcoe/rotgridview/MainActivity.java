package id.kataponcoe.rotgridview;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    final String Email = "poncoe4mac@gmail.com";

    GridView grid; //Grid
    GridAdapter adapter; //grid
    String[] Judul; // grid
    int[] image; // grid
    private TextView messageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        // GridView Awal

        Judul = new String[]{"Situs Resmi", "Letak Lokasi", "Official Kaskus", "Official Twitter", "Telesandi News", "Situs Tomcat",
                "Tels Radio", "Telesandi Art", "Telesandi Services", "English Club",
                "Osis Telesandi", "Official Telesandi", "Telesandi Futsal", "Angklung Tels", "Ultras Telkom74",
                "Ultras Telkom74", "Tomcat Telesandi", "Osis Telesandi", "Paskibra Telesandi",
                "Brigatels", "Traditels", "Rohis Telesandi", "Pramuka Telesandi", "Seni Media"};

        image = new int[]{R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

        grid = (GridView) findViewById(R.id.gridview);
        adapter = new GridAdapter(getApplicationContext(), Judul, image);
        grid.setAdapter(adapter);

        // kasih fungsi jika diklik
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                
                /* KETERANGAN!!
                
                kalo di gridview mau dikasih activity / intent pake kodingan ini :
                
                    myIntent = new Intent(view.getContext(), SitusSekolah.class);
                    
                cuma kalo mau main ACTION_VIEW silahkan pake ini : 
                
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/official_Tels"));
                    
                    sesuain kebutuhan aja..
                    
                   --> image & judul bisa kalian ubah, intinya 1 gridview itu 1 judul & image.
                   
                 */

                Intent myIntent = null;
                if (position == 0) {
                    //myIntent = new Intent(view.getContext(), SitusSekolah.class); <!-- contoh Kalo Mau Kasih Intent -->
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/official_Tels"));
                }
                if (position == 1) {
                    //myIntent = new Intent(view.getContext(), LetakSekolah.class); <!-- contoh Kalo Mau Kasih Intent -->
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/official_Tels"));
                }
                if (position == 2) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.kaskus.co.id/thread/56a6e4cc529a45cc398b4568/official-smk-telekomunikasi-telesandi-bekasi-tempat-ngobrolsharing--berkumpul"));
                }
                if (position == 3) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/official_Tels"));
                }
                if (position == 4) {
                   // myIntent = new Intent(view.getContext(), TelsNews.class); <!-- contoh Kalo Mau Kasih Intent -->
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/official_Tels"));
                }
                if (position == 5) {
                    //myIntent = new Intent(view.getContext(), SitusTomcat.class); <!-- contoh Kalo Mau Kasih Intent -->
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/official_Tels"));
                }


                if (position == 6) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/telsradio/"));
                }
                if (position == 7) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/tels_art/"));
                }
                if (position == 8) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/telservices/"));
                }
                if (position == 9) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ec.tels/"));
                }


                if (position == 10) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/osistels/"));
                }
                if (position == 11) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/officialtels/"));
                }
                if (position == 12) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/futsaltels2008/"));
                }
                if (position == 13) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/angklungtels/"));
                }
                if (position == 14) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ultrastelkom74/"));
                }


                if (position == 15) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/ultrastelkom74"));
                }
                if (position == 16) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/TomcatSquad_"));
                }
                if (position == 17) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Osis_Tels"));
                }
                if (position == 18) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Brigastels_CGE"));
                }


                if (position == 19) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/brigastels/"));
                }
                if (position == 20) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/traditels/"));
                }
                if (position == 21) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/rohistels89/"));
                }
                if (position == 22) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/aljawira/"));
                }
                if (position == 23) {
                    myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/senimedia_/"));
                }

                startActivity(myIntent);

            }

        });
    }

    //GridView Akhir

    public void onBackPressed() {
        finish();//Pergi ke method exit
    }
}