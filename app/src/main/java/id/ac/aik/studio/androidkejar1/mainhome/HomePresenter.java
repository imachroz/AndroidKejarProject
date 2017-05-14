package id.ac.aik.studio.androidkejar1.mainhome;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

import id.ac.aik.studio.androidkejar1.interactor.Homeinterface;
import id.ac.aik.studio.androidkejar1.model.HomeModel;

/**
 * Created by Imam on 5/14/2017.
 */

public class HomePresenter  implements Homeinterface{

    private Context mContext;
    private ArrayList<HomeModel> mHomeModel;

    public HomePresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void showList(ArrayList<HomeModel> homeModels) {
        mHomeModel = homeModels;
        mHomeModel.add(new HomeModel("Imam","cc","cc@yahoo.com","asa"));
        mHomeModel.add(new HomeModel("Imam","cc","cc@yahoo.com","asa"));
        mHomeModel.add(new HomeModel("Imam","cc","cc@yahoo.com","asa"));
        mHomeModel.add(new HomeModel("Imam","cc","cc@yahoo.com","asa"));

    }
}
