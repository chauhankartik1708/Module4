package com.dzone.module4.NDRF;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dzone.module4.NSG.NsgRankAdapter;
import com.dzone.module4.NSG.NsgRankRecyclerItems;
import com.dzone.module4.R;

import java.util.ArrayList;
import java.util.List;

public class NdrfDisResActivity extends AppCompatActivity {
    private RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4,recyclerView5,recyclerView6;
    private NdrfDisResAdapter adapter1,adapter2,adapter3,adapter4,adapter5,adapter6;
    private List<NdrfDisResRecyclerItems> listItems1,listItems2,listItems3,listItems4,listItems5,listItems6;

    private String str1[] = {"Flood in Bhavnagar, Gujarat – 3–5 July 2007 – Rescued 291 people; distributed 3,750 food packets",
    "Flood in Rajkot, Gujarat – 3–5 July 2007 – Rescued 291 people; distributed 3,750 food packets"};

    private String str2[] = {"Building collapse (Hotel Shakunt) in Ahmedabad, Gujarat – 3–5 Feb 2008 – Saved 10 people and recovered 6 dead bodies",
    "Flood in Lakhimpur, Assam – 14 June – 20 July 2008 – Rescued 2500 civilians",
    "Flood in Dhemaji, Assam – 16 June – 31 July 2008 – Rescued 600 people",
    "Flood in Lakhimpur, Assam – 21 July – 4 Aug 2008 – Evacuated 2000 people",
    "Rescue and relief operations during the Kosi breach in Bihar",
            "Kosi breach in Bihar – 20 Aug 2008 – Saved over 105,000 people including women, children and the elderly; distributed medicines and water bottles",
            "Flood in Lakhimpur, Assam – 31 Aug – 9 Sep 2008 – Saved 750 people",
            "Flood in Puri, Cuttack, Kendrapara & Jagatsinghpur, Odisha – Sept 2008 – Saved over 1000 people",
            "Flood in Kamrup, Assam – 28 Sep 2008 – Saved 350 people",
            "Flood in Tiruvarur, Tamil Nadu – 26–30 Nov 2008 – Saved 773 people",
            "Flood in Chennai, Tamil Nadu – 26 Nov – 2 Dec 2008 – Rescued 1550 people"};

    private String str3[] = {"Cyclone Aila (24 Pargana North & South, West Bengal) – 25 May – 10 June 2009 – Rescued 2000 people; distribution of medicine to 30,000 victims & food packets to 16,000 homeless victims",
    "Flood in Barpeta, Assam – 27 May 2009 – Saved 300 people",
    "Flood in Junagarh and Porbandar, Gujarat – 16–29 July 2009 – Saved 2225 people",
    "Flood in Kasarkode, Kannur and Ernakulam, Kerala – 17–24 July 2009 – Saved 180 people",
    "Flood in Sitamarhi, Bihar (Bagmati breach) – 2–9 Aug 2009 – Rescued 1034 people; distributed medicines to 831 victims",
    "Flood in Howrah & Hooghly, West Bengal – 8–14 Sep 2009 – Rescue 675 people",
    "Andhra Pradesh & Karnataka Floods – Oct 2009 – Saved 10,659 people"};

    private String str4[] = {"Building collapse at Bellary, Karnataka – 27 Jan 2010 – Saved 20 human lives and recovered 27 dead bodies",
    "Flood in Guwahati, Assam – 20–25 April 2010 – Saved 300 human lives",
    "Cyclone Laila in Andhra Pradesh & Karnataka – 18 May 2010"};

    private String str5[] = {"Cyclone Phailin in the states of Andhra Pradesh, Odisha etc. - The battalions of the army and navy were used to evacuate people."};

    private String str6[] = {"NDRF rushed teams to parts of India and Nepal affected by a late April earthquake.",
            "Flood in Chennai, Tamil Nadu – 10 Nov"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndrf_dis_res);

        recyclerView1 = (RecyclerView)findViewById(R.id.ndrf_dis_res_recycler1);
        listItems1 = new ArrayList<>();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        for(String a:str1){
            listItems1.add(new NdrfDisResRecyclerItems(a));
        }
        adapter1 = new NdrfDisResAdapter(listItems1,this);
        recyclerView1.setAdapter(adapter1);

        recyclerView2 = (RecyclerView)findViewById(R.id.ndrf_dis_res_recycler2);
        listItems2 = new ArrayList<>();
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        for(String a:str2){
            listItems2.add(new NdrfDisResRecyclerItems(a));
        }
        adapter2 = new NdrfDisResAdapter(listItems2,this);
        recyclerView2.setAdapter(adapter2);

        recyclerView3 = (RecyclerView)findViewById(R.id.ndrf_dis_res_recycler3);
        listItems3 = new ArrayList<>();
        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
        for(String a:str3){
            listItems3.add(new NdrfDisResRecyclerItems(a));
        }
        adapter3 = new NdrfDisResAdapter(listItems3,this);
        recyclerView3.setAdapter(adapter3);

        recyclerView4 = (RecyclerView)findViewById(R.id.ndrf_dis_res_recycler4);
        listItems4 = new ArrayList<>();
        recyclerView4.setLayoutManager(new LinearLayoutManager(this));
        for(String a:str4){
            listItems4.add(new NdrfDisResRecyclerItems(a));
        }
        adapter4 = new NdrfDisResAdapter(listItems4,this);
        recyclerView4.setAdapter(adapter4);

        recyclerView5 = (RecyclerView)findViewById(R.id.ndrf_dis_res_recycler5);
        listItems5 = new ArrayList<>();
        recyclerView5.setLayoutManager(new LinearLayoutManager(this));
        for(String a:str5){
            listItems5.add(new NdrfDisResRecyclerItems(a));
        }
        adapter5 = new NdrfDisResAdapter(listItems5,this);
        recyclerView5.setAdapter(adapter5);

        recyclerView6 = (RecyclerView)findViewById(R.id.ndrf_dis_res_recycler6);
        listItems6 = new ArrayList<>();
        recyclerView6.setLayoutManager(new LinearLayoutManager(this));
        for(String a:str6){
            listItems6.add(new NdrfDisResRecyclerItems(a));
        }
        adapter6 = new NdrfDisResAdapter(listItems6,this);
        recyclerView6.setAdapter(adapter6);
    }
}
