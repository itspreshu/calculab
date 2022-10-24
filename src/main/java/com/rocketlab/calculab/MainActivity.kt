package com.rocketlab.calculab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultView: TextView;
    private lateinit var aNumberInput: EditText;
    private lateinit var bNumberInput: EditText;
    private lateinit var addButton: Button;
    private lateinit var substractButton: Button;
    private lateinit var multiplyButton: Button;

    data class MathArgument(
        val a: Int,
        val b: Int
    );


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultView = findViewById(R.id.resultView);
        aNumberInput = findViewById(R.id.aNumberInput);
        bNumberInput = findViewById(R.id.bNumberInput);
        addButton = findViewById(R.id.addButton);
        substractButton = findViewById(R.id.substractButton);
        multiplyButton = findViewById(R.id.multiplyButton);


    }

    override fun onStart() {
        super.onStart()

        addButton.setOnClickListener {
            val mathArgs = MathArgument(
                this.aNumberInput.text.toString().toInt(),
                this.bNumberInput.text.toString().toInt()
            )
            resultView.text = add(mathArgs).toString();

        }

        substractButton.setOnClickListener {
            val mathArgs = MathArgument(
                this.aNumberInput.text.toString().toInt(),
                this.bNumberInput.text.toString().toInt()
            )
            resultView.text = substract(mathArgs).toString();

        }

        multiplyButton.setOnClickListener {
            val mathArgs = MathArgument(
                this.aNumberInput.text.toString().toInt(),
                this.bNumberInput.text.toString().toInt()
            )
            resultView.text = multiply(mathArgs).toString();

        }
    }


    private fun add(arg: MathArgument): Int{
        return arg.a + arg.b;
    }

    private fun substract(arg: MathArgument): Int{
        return arg.a - arg.b;
    }

    private fun multiply(arg: MathArgument): Int{
        return arg.a * arg.b;
    }
}