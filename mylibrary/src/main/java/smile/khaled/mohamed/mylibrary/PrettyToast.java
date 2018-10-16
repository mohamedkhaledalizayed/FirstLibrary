package smile.khaled.mohamed.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class PrettyToast {

    public void showSuccessToast(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
