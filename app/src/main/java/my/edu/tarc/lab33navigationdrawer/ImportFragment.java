package my.edu.tarc.lab33navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImportFragment extends Fragment {
private TextView textViewMessage;

    public ImportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Linking UI to program
        View v = inflater.inflate(R.layout.fragment_import, container, false); //reference as find view by id
        textViewMessage = (TextView)v.findViewById(R.id.textViewMessage); // different btw activity and fragment
        Button buttonShowMessage =(Button)v.findViewById(R.id.buttonShowMessage);
        buttonShowMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewMessage.setText("Cheese");
            }
        });
        // Inflate the layout for this fragment
        return v;
    }

}
