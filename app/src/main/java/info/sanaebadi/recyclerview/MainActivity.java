package info.sanaebadi.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import info.sanaebadi.recyclerview.adapter.CountryAdapter;
import info.sanaebadi.recyclerview.model.CountryModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CountryAdapter countryAdapter;
    private List<CountryModel> countryModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview_country_list);

        countryModelList = new ArrayList<>();
        countryModelList.add(new CountryModel(Const.AUSTRALIA_FLAG_IMAGE_URL, "AUSTRALIA"));
        countryModelList.add(new CountryModel(Const.EGYPT_FLAG_IMAGE_URL, "EGYPT"));
        countryModelList.add(new CountryModel(Const.SPAIN_FLAG_IMAGE_URL, "SPAIN"));
        countryModelList.add(new CountryModel(Const.ITALY_FLAG_IMAGE_URL, "ITALY"));
        countryModelList.add(new CountryModel(Const.FRANC_FLAG_IMAGE_URL, "FRANC"));
        countryModelList.add(new CountryModel(Const.CHINA_FLAG_IMAGE_URL, "CHINA"));
        countryModelList.add(new CountryModel(Const.CYPRUS_FLAG_IMAGE_URL, "CYPRUS"));
        countryModelList.add(new CountryModel(Const.BRAZIL_FLAG_IMAGE_URL, "BRAZIL"));

        countryAdapter = new CountryAdapter(countryModelList);

        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext(), RecyclerView.VERTICAL, false));
        recyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(), 2));
        recyclerView.setAdapter(countryAdapter);


    }
}