package com.binar.rpschallengechapter4

import android.os.Build
import android.util.Log
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.binar.rpschallengechapter4.databinding.ActivityMainBinding

class Controller(val callback: Callback) : AppCompatActivity(), InterfaceController {


    @RequiresApi(Build.VERSION_CODES.M)
    override fun cekSuit(pemain: CharSequence, com: CharSequence) {
        if (pemain == com) {
            Log.d("Hasil", "Draw")
            callback.hasil( R.string.draw, R.color.blue_draw, R.color.white )

        } else if (pemain == "batu" && com == "gunting" || pemain == "gunting" && com == "kertas" || pemain == "kertas" && com == "batu") {
            Log.d("Hasil", "pemain 1 win")
            callback.hasil( R.string.pemain_1_win, R.color.green_winlose, R.color.white )

        } else {
            Log.d("Hasil", "pemain 2/com win")
            callback.hasil( R.string.pemain_2_win, R.color.green_winlose, R.color.white )
        }
        Log.d("Hasil", "$pemain VS $com")
    }

}

//override fun cekSuit(pemain: CharSequence, com: CharSequence) {
//    if (pemain == com) {
//        Log.d("Hasil", "Draw")
//        callback.hasil(binding.textHasil.setBackgroundColor(getColor(R.color.blue_draw)))
//        callback.hasil(binding.textHasil.setTextColor(getColor(R.color.white)))
//        callback.hasil(binding.textHasil.setText(R.string.draw))
//    } else if (pemain == "batu" && com == "gunting" || pemain == "gunting" && com == "kertas" || pemain == "kertas" && com == "batu") {
//        Log.d("Hasil", "pemain 1 win")
//        callback.hasil(binding.textHasil.setBackgroundColor(getColor(R.color.green_winlose)))
//        callback.hasil(binding.textHasil.setTextColor(getColor(R.color.white)))
//        callback.hasil(binding.textHasil.setText(R.string.pemain_1_win))
//    } else {
//        Log.d("Hasil", "pemain 2/com win")
//        callback.hasil(binding.textHasil.setBackgroundColor(getColor(R.color.green_winlose)))
//        callback.hasil(binding.textHasil.setTextColor(getColor(R.color.white)))
//        callback.hasil(binding.textHasil.setText(R.string.pemain_2_win))
//    }
//    Log.d("Hasil", "$pemain VS $com")
//}
//
//}