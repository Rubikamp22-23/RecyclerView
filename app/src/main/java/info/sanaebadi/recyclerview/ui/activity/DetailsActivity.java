package info.sanaebadi.recyclerview.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import info.sanaebadi.recyclerview.R;
import info.sanaebadi.recyclerview.databinding.ActivityDetailsBinding;
import info.sanaebadi.recyclerview.utilitis.Const;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;
    private String countryImageUrl, countryName, countryLanguage, countryPopulation, countryCurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        countryImageUrl = getIntent().getStringExtra(Const.COUNTRY_IMAGE_KEY);
        countryName = getIntent().getStringExtra(Const.COUNTRY_NAME_KEY);
        countryLanguage = getIntent().getStringExtra(Const.COUNTRY_LANGUAGE_KEY);
        countryPopulation = getIntent().getStringExtra(Const.COUNTRY_POPULATION_KEY);
        countryCurrency = getIntent().getStringExtra(Const.COUNTRY_CURRENCY_KEY);


        Glide.with(this)
                .load(countryImageUrl)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imageviewFlag);


        binding.textviewCountryName.setText(getString(R.string.country_name_title)+ countryName);
        binding.textviewCountryPupulation.setText("Country Population: " + countryPopulation);
        binding.textviewCountryLanguage.setText("Country Language: " + countryLanguage);
        binding.textviewCountryCurrency.setText("Country Currency: "+ countryCurrency);

    }
}