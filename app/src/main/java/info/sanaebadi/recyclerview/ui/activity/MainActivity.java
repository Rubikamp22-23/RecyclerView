package info.sanaebadi.recyclerview.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import info.sanaebadi.recyclerview.OnItemClickListener;
import info.sanaebadi.recyclerview.R;
import info.sanaebadi.recyclerview.model.CountryModel;
import info.sanaebadi.recyclerview.ui.adapter.CountryAdapter;
import info.sanaebadi.recyclerview.utilitis.Const;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    private RecyclerView recyclerView;
    private CountryAdapter countryAdapter;
    private List<CountryModel> countryModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview_country_list);

        countryModelList = new ArrayList<>();
        countryModelList.add(new CountryModel(Const.AUSTRALIA_FLAG_IMAGE_URL, "AUSTRALIA",
                "English", "25.9 million",
                "Australian Dollar"));
        countryModelList.add(new CountryModel(Const.EGYPT_FLAG_IMAGE_URL, "EGYPT", "Arabic",
                "109.3 million", "Pond"));
        countryModelList.add(new CountryModel(Const.SPAIN_FLAG_IMAGE_URL, "SPAIN",
                "Spanish", "22 million", "Euro"));
        countryModelList.add(new CountryModel(Const.ITALY_FLAG_IMAGE_URL, "ITALY",
                "Italian", "39.5 million", "Euro"));
        countryModelList.add(new CountryModel(Const.FRANC_FLAG_IMAGE_URL, "FRANC",
                "French", "67.75 million", "Euro"));
        countryModelList.add(new CountryModel(Const.CHINA_FLAG_IMAGE_URL, "CHINA",
                "Mandarin", "1.412 billion", "Yowan"));
        countryModelList.add(new CountryModel(Const.CYPRUS_FLAG_IMAGE_URL, "CYPRUS",
                "Greek", "1.1 million", "Euro"));
        countryModelList.add(new CountryModel(Const.BRAZIL_FLAG_IMAGE_URL, "BRAZIL",
                "Spanish", "214.3 million", "rial"
        ));

        countryAdapter = new CountryAdapter(countryModelList, this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext(), RecyclerView.VERTICAL, false));
//        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext(), RecyclerView.HORIZONTAL, false));
//        recyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(), 2));
//        recyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(), 3));
        recyclerView.setAdapter(countryAdapter);


    }

    @Override
    public void onItemClick(CountryModel countryModel) {
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra(Const.COUNTRY_IMAGE_KEY, countryModel.getImageUrl());
        intent.putExtra(Const.COUNTRY_NAME_KEY, countryModel.getCountryName());
        intent.putExtra(Const.COUNTRY_LANGUAGE_KEY, countryModel.getCountryLanguage());
        intent.putExtra(Const.COUNTRY_POPULATION_KEY, countryModel.getCountryPopulation());
        intent.putExtra(Const.COUNTRY_CURRENCY_KEY, countryModel.getCountryCurrency());
        startActivity(intent);
    }
}