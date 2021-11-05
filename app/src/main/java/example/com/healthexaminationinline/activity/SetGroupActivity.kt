package example.com.healthexaminationinline.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import example.com.healthexaminationinline.R
import kotlinx.android.synthetic.main.activity_set_group.*

class SetGroupActivity : AppCompatActivity() {
    val groupButtonArray = arrayOf(
        R.id.btn_number_A,
        R.id.btn_number_B,
        R.id.btn_number_C,
        R.id.btn_number_D,
        R.id.btn_number_E,
        R.id.btn_number_F
    )
    val codeNumButtonArray = arrayOf(
        R.id.btn_number_1,
        R.id.btn_number_2,
        R.id.btn_number_3,
        R.id.btn_number_4,
        R.id.btn_number_5,
        R.id.btn_number_6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_group)
        val spinner: Spinner = gender_spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.gender_array,
            R.layout.spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        val actionbar = supportActionBar
        actionbar!!.title = "分組設定"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        //分組設定
        groupButtonArray.forEach {
            val button = findViewById<Button>(it)
            button.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {
                    when (v?.id) {
                        R.id.btn_number_A -> {
                            v.setSelected(true)
                            btn_number_B.setSelected(false)
                            btn_number_C.setSelected(false)
                            btn_number_D.setSelected(false)
                            btn_number_E.setSelected(false)
                            btn_number_F.setSelected(false)
                        }
                        R.id.btn_number_B -> {
                            v.setSelected(true)
                            btn_number_A.setSelected(false)
                            btn_number_C.setSelected(false)
                            btn_number_D.setSelected(false)
                            btn_number_E.setSelected(false)
                            btn_number_F.setSelected(false)
                        }
                        R.id.btn_number_C -> {
                            v.setSelected(true)
                            btn_number_A.setSelected(false)
                            btn_number_B.setSelected(false)
                            btn_number_D.setSelected(false)
                            btn_number_E.setSelected(false)
                            btn_number_F.setSelected(false)
                        }
                        R.id.btn_number_D -> {
                            btn_number_A.setSelected(false)
                            btn_number_B.setSelected(false)
                            btn_number_C.setSelected(false)
                            v.setSelected(true)
                            btn_number_E.setSelected(false)
                            btn_number_F.setSelected(false)
                        }
                        R.id.btn_number_E -> {
                            btn_number_A.setSelected(false)
                            btn_number_B.setSelected(false)
                            btn_number_C.setSelected(false)
                            btn_number_D.setSelected(false)
                            v.setSelected(true)
                            btn_number_F.setSelected(false)
                        }
                        R.id.btn_number_F -> {
                            btn_number_A.setSelected(false)
                            btn_number_A.setSelected(false)
                            btn_number_B.setSelected(false)
                            btn_number_C.setSelected(false)
                            btn_number_D.setSelected(false)
                            btn_number_E.setSelected(false)
                            v.setSelected(true)
                        }
                        else -> {
                        }
                    }
                }
            })
        }
        //編號設定
        codeNumButtonArray.forEach {
            val button = findViewById<Button>(it)
            button.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {
                    when (v?.id) {
                        R.id.btn_number_1 -> {
                            v.setSelected(true)
                            btn_number_2.setSelected(false)
                            btn_number_3.setSelected(false)
                            btn_number_4.setSelected(false)
                            btn_number_5.setSelected(false)
                            btn_number_6.setSelected(false)
                        }
                        R.id.btn_number_2 -> {
                            v.setSelected(true)
                            btn_number_1.setSelected(false)
                            btn_number_3.setSelected(false)
                            btn_number_4.setSelected(false)
                            btn_number_5.setSelected(false)
                            btn_number_6.setSelected(false)
                        }
                        R.id.btn_number_3 -> {
                            v.setSelected(true)
                            btn_number_2.setSelected(false)
                            btn_number_1.setSelected(false)
                            btn_number_4.setSelected(false)
                            btn_number_5.setSelected(false)
                            btn_number_6.setSelected(false)
                        }
                        R.id.btn_number_4 -> {
                            v.setSelected(true)
                            btn_number_2.setSelected(false)
                            btn_number_1.setSelected(false)
                            btn_number_3.setSelected(false)
                            btn_number_5.setSelected(false)
                            btn_number_6.setSelected(false)
                        }
                        R.id.btn_number_5 -> {
                            v.setSelected(true)
                            btn_number_2.setSelected(false)
                            btn_number_1.setSelected(false)
                            btn_number_4.setSelected(false)
                            btn_number_3.setSelected(false)
                            btn_number_6.setSelected(false)
                        }
                        R.id.btn_number_6 -> {
                            v.setSelected(true)
                            btn_number_2.setSelected(false)
                            btn_number_1.setSelected(false)
                            btn_number_4.setSelected(false)
                            btn_number_5.setSelected(false)
                            btn_number_3.setSelected(false)
                        }
                        else -> {
                        }
                    }
                }
            })
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
