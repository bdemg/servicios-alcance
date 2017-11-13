package com.uady.jorge_cano.serviciosatualcance.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.uady.jorge_cano.serviciosatualcance.R;

/**
 * Created by jorge-cano on 13/11/17.
 */

public class ServiceListAdapter extends ArrayAdapter {

    private String[] services;

    public ServiceListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull String[] services) {

        super(context, R.layout.service_list_item, services);

        this.services = services;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View serviceRow;

        if(convertView != null){
            serviceRow = convertView;
        } else{
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            serviceRow = vi.inflate(R.layout.service_list_item, null);
        }

        TextView service = (TextView) serviceRow.findViewById(R.id.service_name);
        service.setText(this.services[position]);

        return convertView;
    }
}
