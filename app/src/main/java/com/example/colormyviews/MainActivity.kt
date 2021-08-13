package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.colormyviews.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setListerners()

    }
    private fun setListerners() {

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        binding.boxOneText.text= binding.boxOneText.text
        binding.boxTwoText.text = binding.boxTwoText.text
        binding.boxThreeText.text=binding.boxThreeText.text
        binding.boxFourText.text=binding.boxFourText.text
        binding.boxFiveText.text=binding.boxFiveText.text
        val clickableView: List<View> =
            listOf(binding.boxOneText,binding.boxTwoText, binding.boxThreeText, binding.boxFourText, binding.boxFiveText,rootConstraintLayout,binding.redButton,binding.greenButton,binding.yellowButton)

        for (item in clickableView){
            item.setOnClickListener{
                makeColored(it)
            }
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.github)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }




}