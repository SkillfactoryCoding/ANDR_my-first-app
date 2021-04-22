package ru.devivanov.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import ru.devivanov.myfirstapp.databinding.ActivityMainBinding
import kotlin.math.hypot
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonEnterName.setOnClickListener {
//            >>>Пишем код здесь<<<
        }
    }

    private fun reveal() {
        val x: Int = binding.textView.x.roundToInt() + binding.textView.width / 2
        val y: Int = binding.textView.y.roundToInt() + binding.textView.height / 2

        val startRadius = 0
        val endRadius = hypot(binding.revealLayout.width.toDouble(), binding.revealLayout.height.toDouble())
        val anim = ViewAnimationUtils.createCircularReveal(binding.revealLayout, x, y, startRadius.toFloat(), endRadius.toFloat())
        anim.duration = 1000

        binding.revealLayout.visibility = View.VISIBLE
        anim.start()
    }

}