package com.dzone.module4.NSG;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dzone.module4.R;

import java.util.ArrayList;
import java.util.List;

public class NsgOperationActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NsgOperationAdapter adapter;
    private List<NsgOperationRecyclerItems> listItems;
    private String dates[] = {"29–30 April 1986","January 1988","12 May 1988","5 September – 15 January 1988","4 August 1989","10 November 1990","25–26 January 1991","1 July-20 September 1991","25 November – 16 December 1992","27 March 1993","24–25 April 1993","October 1998","15 July 1999","21 August 1999","December 1999","February 2000","September 2002","October 2002","December 2002","26 November 2008 Mumbai attacks","2013 Hyderabad blasts","2013 Bangalore Bomb Blast","2013 Patna bombings","2016 Pathankot attack"};

    private String history[] = {" About 300 NSG commandos and 700 Border Security Force troops stormed the Golden Temple in Operation Black Thunder I. The Temple was cleared and handed over to Punjab Police on 1 May 1986. 300 Sikh militants were captured, and there were no deaths or injuries for either side.",
            "The NSG conducted Op Black Hawk, a heliborne operation in the Mand area of Punjab. In this operation two terrorists were killed and one 7.62mm was recovered. It was a massive operation, says former NSG Director General Ved Marwah, though it did not get many spectacular results like in Black Thunder.",
            "1,000 NSG commandos (all ranks) surrounded the Golden Temple for yet another assault, in Operation Black Thunder II. Sniper teams armed with Heckler & Koch PSG-1 rifles with night scope took up positions, including atop a 300-foot water tower. While commandos from the 51 SAG divided into assault squadrons, the SRG were used to seal off the area around the temple and for tactical support. In the three-day operation between 15–18 May 1988, the NSG cleared the temple. 40 terrorists were killed, and 200 surrendered. In the mid-1990s, a NSG battalion was again deployed in Punjab to confront the Sikh rioters. There they began training the Punjab Police in counter-terrorism.",
            "Guarding of high-risk terrorist code-named 'Jack'.",
            "Operation Mouse Trap in the Tarn Taran district of Punjab, in conjunction with Punjab Police and other security forces. NSG was able to demonstrate that it was possible to achieve area dominance at night, if the strategy and tactics were right. Ved Marwah calls this Operation Night Dominance.",
            "NSG task force flown to Kolkata to rescue hostages of a Thai airbus by Burmese students.",
            "The NSG was involved in Operation Ani Ben, on CI tasks in Baroda, (Gujarat) where Punjab terrorists were holed up inside a house. Two terrorists were killed and two AK-47s were recovered.",
            "NSG employed along with SIT in search and strike missions after the assassination of Rajiv Gandhi.",
            "150 commandos were deployed at Ayodhya during the Ram Janambhoomi and Babri Masjid crisis.",
            "52 SAG mobilised and moved to Adampur for rescue of hostages of Indian Airlines Flight IC 486.",
            "NSG Commandos storm a hijacked Indian Airlines Boeing 737 with 141 passengers on board at Amritsar airport during Operation Ashwamedh. Two hijackers, including their leader, Mohammed Yousuf Shah, are killed and one is disarmed before. No hostages are harmed.",
            "As part of the implementation of the Union Home Ministry's decision to conduct pro-active strikes against militants, commando teams supported by IAF Mi-25/35 helicopter gun-ships began striking at terrorist groups deep inside the mountains and forests of Kashmir. After helicopter reconnaissance were conducted to pinpoint the militants, the commandos – comprising NSG and Rashtriya Rifles personnel – were para-dropped, along with supplies, into the area to hunt the militants. They had to rely on these supplies and their ability to live off the land until replenishment every fortnight or so. These missions are possibly ongoing.",
            "NSG commandos end a 30-hour standoff by killing 2 terrorists and rescuing all 12 hostages unharmed in J&K. The terrorists had attacked a BSF campus near Srinagar, killed 3 officers and the wife of another. The 12 hostages were kept locked in a room.",
            "After interrogating three captured terrorists, the Delhi Police Crime branch confirmed that two more terrorists were hiding in a one-storied house in Rudrapur, Uttar Pradesh. Since the terrorists were considered armed and dangerous (their colleagues were arrested with 100+ pounds of RDX), the Delhi Police sought assistance from the NSG. A 16-man team arrived at the house at 4:45 am They began their assault at 5:30 am, before first light. The first militant managed to fire at the commandos with a pistol he kept by his bedside, but was killed an instant later. The second terrorist was shot before he had a chance to fire and died 40 minutes later. No NSG personnel were injured.",
            "Terrorists hijacked Indian Airlines flight IC814 from Nepal, and landed in Amritsar, Punjab. Within minutes of landing, the Crisis Management Group (CMG), which authorised the use of the NSG, was informed. But the CMG wasted precious hours and by the time the go-ahead was issued, it is too late. On the other hand, the NSG team on alert was elsewhere and no other team was raised during the delay. The hijacked plane took off before the NSG reached Amritsar Airport. The plane landed in Kandahar, Afghanistan where one hostage was killed. Finally, the Indian Government agrees to the terrorists' demands to release three jailed terrorists. The hostages are released and the terrorists escaped to Pakistan.",
            "Following the Flight IC 814 fiasco, the Indian Government decided to implement an Air Marshal programme. At least two NSG operators will be present on flights over select routes. These operators will be armed with weapons firing lethal, but low-velocity, fragmentation rounds to minimise danger to the passengers and prevent penetration of the aircraft. Another decision taken was to deploy NSG teams permanently at eight sensitive airports around the country, especially those bordering Pakistan and the North East. This decision will cut short reaction times for the NSG and eliminate hassles involved in flying the teams to the hijack site. It is not known if this plan has been put into action.",
            "SAG commandos fly to the Karnataka state in India, in an effort to catch sandalwood smuggler and forest brigand Veerappan, in the wake of kidnapping of a former minister of the state cabinet, Nagappa. They pull out after suggesting that intelligence for the operation was inadequate. A small team is left behind to help, the hostage is eventually killed in December 2002.",
            "Two terrorists attack Akshardham temple complex in Gujarat. NSG flies in, delayed by traffic in Delhi. They carry out assaults in which one commando was martyred and another one is seriously injured and was in a coma, passed away after 18 months. But by morning the two terrorists are killed and the operation successfully completed.",
            "Terrorists attack the Raghunath temple in Jammu. NSG ready to be flown out but called back at the last minute.",
            "Operation Black Tornado and Operation Cyclone to flush out terrorists & rescue hostages after multiple attacks across Mumbai, India. Major Sandeep Unnikrishnan and Havaldar Gajender Singh Bisht of the Special Action Group lost their lives during the operations.Over 900 rooms were scanned, 9 Terrorists killed and over 600 hostages rescued during the Operation.",
            "Deployed in Hyderabad after the bomb blasts.",
            "NSG was deployed in Bangalore after the bomb blast took place in the city.",
            "A team of the NSG, which was sent to Patna for post-blasts analysis, said at least three more Improvised Explosive Devices (IEDs) were defused.",
            "An NSG team took part in the operation to neutralize terrorists where Lt. Col. Niranjan lost his life defusing a grenade or IED booby trapped on the body of a dead terrorist, and 12 other members of the unit were injured. Six terrorists were neutralised in the operation by the NSG, Defence Security Corps and the Garud Commando Force"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsg_operation);

        recyclerView = (RecyclerView)findViewById(R.id.nsg_history_recycler);

        listItems = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for(int i=0;i<history.length;i++){
            String a = dates[i];
            String b = history[i];
            listItems.add(new NsgOperationRecyclerItems(a,b));
        }
        adapter = new NsgOperationAdapter(listItems,this);
        recyclerView.setAdapter(adapter);
    }
}
