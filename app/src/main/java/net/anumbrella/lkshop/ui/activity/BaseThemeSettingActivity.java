package net.anumbrella.lkshop.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jude.utils.JUtils;

import net.anumbrella.lkshop.R;

/**
 * author：anumbrella
 * Date:16/9/5 上午10:00
 */
public class BaseThemeSettingActivity extends AppCompatActivity {
    public static final String TAG ="BaseThemeSettingActivity";



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCustomTheme();
    }



    private void setCustomTheme() {
        int theme = JUtils.getSharedPreference().getInt("THEME", 0);
        switch (theme) {
            case 1:
                Log.e(TAG, "setCustomTheme: "+"001");
                setTheme(R.style.AppTheme1);
                break;
            case 2:
                Log.e(TAG, "setCustomTheme: "+"002");
                setTheme(R.style.AppTheme2);
                break;
            case 3:
                Log.e(TAG, "setCustomTheme: "+"003");
                setTheme(R.style.AppTheme3);
                break;
            case 4:
                Log.e(TAG, "setCustomTheme: "+"004");
                setTheme(R.style.AppTheme4);
                break;
            case 5:
                Log.e(TAG, "setCustomTheme: "+"005");
                setTheme(R.style.AppTheme5);
                break;
            default:
                Log.e(TAG, "setCustomTheme: "+"006");
                setTheme(R.style.AppThemeDefault);
                break;
        }
    }
}
