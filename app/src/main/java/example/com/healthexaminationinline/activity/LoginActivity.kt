package example.com.healthexaminationinline.activity

import android.annotation.TargetApi
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import example.com.healthexaminationinline.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_set_group.customer_id


class LoginActivity : AppCompatActivity() {
    @TargetApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val spinner: Spinner = role_spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.role_array,
            R.layout.spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        //設置系統給的ID
        customer_id.setText(generateID(10))
        customer_id.setTextColor(Color.parseColor("#808080"))
        customer_id.setTextSize(14f)
        //登入系統
        val intent = Intent(this, MainActivity::class.java)
        intent
        btn_customer_login.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                //登入後到主選單頁面
                intent.putExtra("customer_id", customer_id.text)
                intent.putExtra("customer_role", role_spinner.getSelectedItem().toString())
                startActivity(intent)
            }
        })
    }
    fun generateID(size: Int): String {
        val source = "A1BCDEF4G0H8IJKLM7NOPQ3RST9UVWX52YZab1cd60ef2ghij3klmn49opq5rst6uvw7xyz8"
        return (source).map { it }.shuffled().subList(0, size).joinToString("")
    }
}
