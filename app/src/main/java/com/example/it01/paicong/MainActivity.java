package com.example.it01.paicong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.example.it01.paicong.activity.CustomerActivity;
import com.example.it01.paicong.activity.PropertyActivity;
import com.example.it01.paicong.entities.customer.Example;
import com.example.it01.paicong.presenter.CustomerPresenter;
import com.example.it01.paicong.service.Impl.TestingServiceImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_customer)
    public void goToCustomer(){
        Intent intent = new Intent(getApplicationContext(), CustomerActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_property)
    public void goToPoperty(){
        Intent intent = new Intent(getApplicationContext(), PropertyActivity.class);
        startActivity(intent);
    }
}
