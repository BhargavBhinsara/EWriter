package com.example.e_writer;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.example.e_writer.R;
import java.util.ArrayList;
import petrov.kristiyan.colorpicker.ColorPicker;


/**
 * A simple {@link Fragment} subclass.
 */
public class PostFragment extends Fragment {

    public PostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post, container, false);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // do your variables initialisations here except Views!!!
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        // initialise your views

        EditText editText=(EditText) view.findViewById(R.id.newpost);
        ImageView imageView= (ImageView) view.findViewById(R.id.colorpicker);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorPicker();
            }

        });
    }
    private void ColorPicker() {

        final ColorPicker Colorpicker = new ColorPicker(PostFragment.this);
        ArrayList<String> colors =new ArrayList<>();
        colors.add("#9eeb34");
        colors.add("#ffa078");
        colors.add("#9be8eb");
        colors.add("#53b8e0");
        colors.add("#3383de");
        colors.add("#f26bee");

        Colorpicker.setColors(colors)
                .setColumns(3)
                .setRoundColorButton(true)
                .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {

                      //editText.setBackgroundColor(color);
                    }

                    @Override
                    public void onCancel() {

                    }
                }) .show();
    }
}
