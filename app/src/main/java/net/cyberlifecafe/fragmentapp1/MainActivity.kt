package net.cyberlifecafe.fragmentapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragMain = MainFragment()
        val fragSub = SubFragment()
        val fragMan = supportFragmentManager
        val fragTran = fragMan.beginTransaction()
        fragTran.add(R.id.frameLayoutMainFragment, fragMain)
        fragTran.add(R.id.frameLayoutSubFragment, fragSub).commit()
    }
}
