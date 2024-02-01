package br.com.swperfi.bmc_reachability

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import br.com.swperfi.bmc_reachability.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var checkBoxA: CheckBox
    private lateinit var checkBoxB: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        editText = findViewById(R.id.edittext)
        button = findViewById(R.id.button)
        checkBoxA = findViewById(R.id.checkbox_A)
        checkBoxB = findViewById(R.id.checkbox_B)

        // Button is Clicked!
        button.setOnClickListener {
            // Get the text input
            val value = editText.text.toString().toInt()
            val isAChecked = checkBoxA.isChecked
            val isBChecked = checkBoxB.isChecked
            if (value == 42) {
                // If Checkbox A and B are set
                if (isAChecked && isBChecked) {
                   assert(false)
                }
                // If CheckBox A is set
                else if (isAChecked) {
                    assert(true)
                } else {
                    assert(true)
                }
            }
        }
    }
}