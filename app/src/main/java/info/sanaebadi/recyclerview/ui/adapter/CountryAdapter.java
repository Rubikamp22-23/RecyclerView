package info.sanaebadi.recyclerview.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import info.sanaebadi.recyclerview.OnItemClickListener;
import info.sanaebadi.recyclerview.R;
import info.sanaebadi.recyclerview.model.CountryModel;
import info.sanaebadi.recyclerview.ui.activity.DetailsActivity;
import info.sanaebadi.recyclerview.utilitis.Const;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {

    private List<CountryModel> countryModelList;
    private OnItemClickListener onItemClickListener;

    public CountryAdapter(List<CountryModel> countryModelList, OnItemClickListener onItemClickListener) {
        this.countryModelList = countryModelList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_row_layout, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        CountryModel countryModel = countryModelList.get(position);

        Glide.with(holder.itemView.getContext())
                .load(countryModel.getImageUrl())
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.imageViewCountryFlag);

        holder.textviewCountryName.setText(countryModel.getCountryName());

        holder.itemView.setOnClickListener(view -> {
            Context context = view.getContext();
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra(Const.COUNTRY_IMAGE_KEY, countryModel.getImageUrl());
            intent.putExtra(Const.COUNTRY_NAME_KEY, countryModel.getCountryName());
            intent.putExtra(Const.COUNTRY_LANGUAGE_KEY, countryModel.getCountryLanguage());
            intent.putExtra(Const.COUNTRY_POPULATION_KEY, countryModel.getCountryPopulation());
            intent.putExtra(Const.COUNTRY_CURRENCY_KEY, countryModel.getCountryCurrency());
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return countryModelList.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {
        private AppCompatImageView imageViewCountryFlag;
        private AppCompatTextView textviewCountryName;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewCountryFlag = itemView.findViewById(R.id.imageview_country_flag);
            textviewCountryName = itemView.findViewById(R.id.textview_country_name);


        }
    }
}
