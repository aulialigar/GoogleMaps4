package com.example.aulialigar.googlemaps4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    static final CameraPosition depok = CameraPosition.builder()
            .target(new LatLng(-6.402484, 106.794241))
            .zoom(10)
            .bearing(0)
            .tilt(45)
            .build();
    GoogleMap m_map;
    boolean mapReady = false;
    LatLng jaksel = new LatLng(-6.261493, 106.8106);
    LatLng bekasi = new LatLng(-6.238270, 106.975573);
    LatLng tanggerang = new LatLng(-6.202394, 106.65271);
    LatLng bogor = new LatLng(-6.597147, 106.806039);
    LatLng jakarta = new LatLng(-6.175110, 106.865039);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.moveCamera(CameraUpdateFactory.newCameraPosition(depok));
        //map.addPolyline(new PolylineOptions().geodesic(true).add(renton).add(kirkland).add(everett).add(lynnwood).add(montlake).add(kent).add(showare).add(renton));
        //map.addPolygon(new PolygonOptions().add(renton, kirkland, everett, lynnwood).fillColor(Color.GREEN));
        map.addCircle(new CircleOptions()
                .center(jaksel)
                .radius(5000)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(64, 0, 255, 0)));
        map.addCircle(new CircleOptions()
                .center(bekasi)
                .radius(5000)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(64, 0, 255, 0)));
        map.addCircle(new CircleOptions()
                .center(tanggerang)
                .radius(5000)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(64, 0, 255, 0)));
        map.addCircle(new CircleOptions()
                .center(jakarta)
                .radius(5000)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(64, 0, 255, 0)));
        map.addCircle(new CircleOptions()
                .center(bogor)
                .radius(5000)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(64, 0, 255, 0)));

    }
}
