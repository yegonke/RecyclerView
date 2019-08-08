package triad.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    List<ListModel> listModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       for (int i=0;i<20;i++){
           ListModel listModel = new ListModel(
                   "Triad Simulant\t" + (i+1),
                   "Cozy Mosy 123 testing"
           );
           listModels.add(listModel);
       }
       adapter = new ListAdapter(listModels,this);
       recyclerView.setAdapter(adapter);
    }
}
