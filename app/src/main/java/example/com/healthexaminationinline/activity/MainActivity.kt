package example.com.healthexaminationinline.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridLayout
import androidx.cardview.widget.CardView
import example.com.healthexaminationinline.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSingleEvent(mainGrid)
    }
    private fun setSingleEvent(mainGrid: GridLayout) {
        for (i in 0 until mainGrid.childCount) {
            val cardView = mainGrid.getChildAt(i) as CardView
            cardView.setOnClickListener(View.OnClickListener {
                val intent = Intent(this@MainActivity, SetGroupActivity::class.java)
                intent.putExtra("info", "This is activity from card item index  $i")
                startActivity(intent)
            })
        }
    }
}
