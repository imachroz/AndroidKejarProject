package id.ac.aik.studio.androidkejar1.mainview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import id.ac.aik.studio.androidkejar1.R;
import id.ac.aik.studio.androidkejar1.adapter.HomeAdapter;
import id.ac.aik.studio.androidkejar1.mainhome.HomePresenter;
import id.ac.aik.studio.androidkejar1.interactor.Homeinterface;
import id.ac.aik.studio.androidkejar1.model.HomeModel;

public class HomeActivity extends AppCompatActivity {

    private TextView mTextUsername;
    private RecyclerView mRecycleView;
    private HomeAdapter mHomeAdapter;
    private Homeinterface mHomeInterface;
    private ArrayList<HomeModel> mHomeModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTextUsername = (TextView) findViewById(R.id.txt_username);

        Intent mIntent = getIntent();
        String username = mIntent.getStringExtra("username");
        mTextUsername.setText(username);

        mHomeInterface = new HomePresenter(this);
        mHomeModel = new ArrayList<>();
        mHomeInterface.showList(mHomeModel);
        initView();

    }

    private void initView(){

        mRecycleView = (RecyclerView) findViewById(R.id.List_item);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomeActivity.this);
        mRecycleView.setLayoutManager(layoutManager);
        mRecycleView.setHasFixedSize(true);
        mHomeAdapter = new HomeAdapter(mHomeModel, this);
        mRecycleView.setAdapter(mHomeAdapter);

        }
}
