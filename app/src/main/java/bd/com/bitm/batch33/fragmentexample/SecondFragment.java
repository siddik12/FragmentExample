package bd.com.bitm.batch33.fragmentexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private static SecondFragment secondFragment;
    View view;

    public SecondFragment() {
        // Required empty public constructor
    }

    public static SecondFragment getInstance(){
        if(secondFragment == null){
            secondFragment = new SecondFragment();
        }
        return secondFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_second, container, false);

        Bundle bundle = getArguments();

        if(bundle != null){
            String msg = bundle.getString("msg");
            Toast.makeText(getActivity(),msg,Toast.LENGTH_LONG).show();
        }




        Button buttonSecondFragment = view.findViewById(R.id.buttonSecondFragment);
        buttonSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Second Fragment",Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }

}
