package dicj.info.ageecj;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by utilisateur on 2017-01-31.
 */
public class CustomListView extends Activity{

    ListView list;
    CustomAdapter adapter;
    public CustomListView CustomListView = null;
    public ArrayList<ListModel> CustomListViewValuesArr = new ArrayList<ListModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        CustomListView = this;

        /******** Take some data in Arraylist ( CustomListViewValuesArr ) ***********/
        setListData();

        Resources res = getResources();
        list = (ListView)findViewById(R.id.list);

        /**************** Create Custom Adapter *********/
        adapter=new CustomAdapter(CustomListView, CustomListViewValuesArr, res);
        list.setAdapter(adapter);
    }


    //ICITE QU'ON REMPLIT CE QUI A DANS LE CUSTOM LIST VIEW
    /****** Function to set data in ArrayList *************/
    public void setListData(){
        for(int i=0; i<11; i++){
            final ListModel sched = new ListModel();
            /******* Firstly take data in model object ******/

            sched.setAbrevEven("AbrevEven "+i);
            sched.setDateEven("DateEven "+i);

            /******** Take Model Object in ArrayList **********/
            CustomListViewValuesArr.add( sched );
        }
    }

    /*****************  This function used by adapter ****************/
    public void onItemClick(int mPosition)
    {
        ListModel tempValues = ( ListModel ) CustomListViewValuesArr.get(mPosition);

        // SHOW ALERT
        Toast.makeText(CustomListView, ""+tempValues.getAbrevEven() + tempValues.getDateEven() , Toast.LENGTH_LONG).show();
    }

}
