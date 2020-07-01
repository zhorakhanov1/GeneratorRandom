package alish.zhorakhanov.randomgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generate.setOnClickListener {
            try {
                var output = ""
                val min = (minnumber.text.toString()).toInt()
                val max = (maxnumber.text.toString()).toInt()
                val total = (total.text.toString()).toInt()
                val randomValues = List(total) { Random.nextInt(min, max) }
                randomValues.forEach {
                    output += "$it, "
                }
                result.text = output
            }catch (e : NumberFormatException){
                return@setOnClickListener
            }
        }
    }
}
