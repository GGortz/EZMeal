package be.lsinf1225.ezmeal.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import be.lsinf1225.ezmeal.Model.Utilisateur;

/**
 * Created by User on 09-05-17.
 */

public class ListUtilisateurAdapter extends BaseAdapter {
    private Context mContext;
    private List<Utilisateur> mUtilisateurList;

    public ListUtilisateurAdapter(Context mContext, List<Utilisateur> mUtilisateurList) {
        this.mContext = mContext;
        this.mUtilisateurList = mUtilisateurList;
    }

    @Override
    public int getCount() {
        return mUtilisateurList.size();
    }

    @Override
    public Object getItem(int position) {
        return mUtilisateurList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
