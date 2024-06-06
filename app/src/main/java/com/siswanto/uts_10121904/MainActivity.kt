package com.siswanto.uts_10121904

import android.R
import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form_isi)

        val tanggalTerkonfirmasi = findViewById<EditText>(R.id.tanggal_terkonfirmasi)
        val tanggalLahir = findViewById<EditText>(R.id.tanggal_lahir)

        tanggalTerkonfirmasi.setOnClickListener { showDatePickerDialog(tanggalTerkonfirmasi) }
        tanggalLahir.setOnClickListener { showDatePickerDialog(tanggalLahir) }
    }

    // Ensure this function is defined
    private fun showDatePickerDialog(editText: EditText) {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDay ->
                val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                editText.setText(selectedDate)
            },
            year, month, day
        )
        datePickerDialog.show()
    }
}



//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Ganti FloatingActionButton dengan View yang sesuai
//        val fab = findViewById<FloatingActionButton>(R.id.fab)
//        fab.setOnClickListener {
//            val bottomSheetFragment = BottomSheetFragment()
//            bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
//        }
//    }
}
