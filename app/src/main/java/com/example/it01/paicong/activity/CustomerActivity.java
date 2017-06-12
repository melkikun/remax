package com.example.it01.paicong.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.example.it01.paicong.R;
import com.example.it01.paicong.adapter.CustomerAdapter;
import com.example.it01.paicong.custom.DividerItem;
import com.example.it01.paicong.entities.customer.Datum;
import com.example.it01.paicong.entities.customer.Example;
import com.example.it01.paicong.presenter.CustomerPresenter;
import com.example.it01.paicong.service.Impl.TestingServiceImpl;
import com.example.it01.paicong.service.TestingService;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomerActivity extends AppCompatActivity implements CustomerPresenter {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TestingService testingService = new TestingServiceImpl(this);
        testingService.print();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void print(Example hasil) {
        List<String> url = new ArrayList<>();
        for (int i = 0; i < hasil.getData().size(); i++) {
            if(hasil.getData().get(i).getLinks().getCustMmbsId()!=null)
                url.add("https://cdn2.iconfinder.com/data/icons/shopping-online-e-commerce-store/512/client_customer_buyer_account_seller-512.png");
            else
                url.add("");
        }
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        CustomerAdapter adapter = new CustomerAdapter(getApplicationContext(), hasil.getData(), url);
        recyclerView.addItemDecoration(new DividerItem(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
}
