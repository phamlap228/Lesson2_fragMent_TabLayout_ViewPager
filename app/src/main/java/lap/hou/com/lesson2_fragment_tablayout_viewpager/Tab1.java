package lap.hou.com.lesson2_fragment_tablayout_viewpager;

//import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.fragment.*;


/**
 * Created by Lap on 11/10/2017.
 */

public class Tab1 extends Fragment {
    public Tab1() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab1,container,false);
    }
}
