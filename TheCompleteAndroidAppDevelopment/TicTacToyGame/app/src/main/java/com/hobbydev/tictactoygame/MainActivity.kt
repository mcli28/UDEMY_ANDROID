package com.hobbydev.tictactoygame

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Random


class MainActivity : AppCompatActivity() {

    private lateinit var bu1:Button
    private lateinit var bu2:Button
    private lateinit var bu3:Button
    private lateinit var bu4:Button
    private lateinit var bu5:Button
    private lateinit var bu6:Button
    private lateinit var bu7:Button
    private lateinit var bu8:Button
    private lateinit var bu9:Button

    var cellID = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListeners()
    }

    private fun initComponents(){
        bu1 = findViewById(R.id.bu1)
        bu2 = findViewById(R.id.bu2)
        bu3 = findViewById(R.id.bu3)
        bu4 = findViewById(R.id.bu4)
        bu5 = findViewById(R.id.bu5)
        bu6 = findViewById(R.id.bu6)
        bu7 = findViewById(R.id.bu7)
        bu8 = findViewById(R.id.bu8)
        bu9 = findViewById(R.id.bu9)
    }

    private fun initListeners(){

        bu1.setOnClickListener{
            cellID = 1;
            tictactoyfun(bu1, cellID)
        }
        bu2.setOnClickListener{
            cellID = 2;
            tictactoyfun(bu2, cellID)
        }
        bu3.setOnClickListener{
            cellID = 3;
            tictactoyfun(bu3, cellID)
        }
        bu4.setOnClickListener{
            cellID = 4;
            tictactoyfun(bu4, cellID)
        }
        bu5.setOnClickListener{
            cellID = 5;
            tictactoyfun(bu5, cellID)
        }
        bu6.setOnClickListener{
            cellID = 6;
            tictactoyfun(bu6, cellID)
        }
        bu7.setOnClickListener{
            cellID = 7;
            tictactoyfun(bu7, cellID)
        }
        bu8.setOnClickListener{
            cellID = 8;
            tictactoyfun(bu8, cellID)
        }
        bu9.setOnClickListener { // Call a function and pass the button object
            cellID = 9;
            tictactoyfun(bu9, cellID)
        }
    }
    var ActivePlayer = 1 //
    val Player1: ArrayList<Int> = ArrayList()
    val Player2: ArrayList<Int> = ArrayList()

    private fun tictactoyfun(button: Button, cellID: Int) {
        Log.d("player", cellID.toString())


        if (ActivePlayer == 1){
            button.setText("X")
            button.setBackgroundColor(Color.GREEN)
            Player1.add(cellID)
            ActivePlayer=2
            AutoPlay()
        } else if(ActivePlayer == 2) {
            button.setText("O")
            button.setBackgroundColor(Color.BLUE)
            Player2.add(cellID)
            ActivePlayer=1
        }
        button.isEnabled = false
        //button.setEnabled(false)
        CheckWinner()
    }

    private fun CheckWinner(){
        var winner=-1
        //row 1
        if (Player1.contains(1) && Player1.contains(2) && Player1.contains(3)){
            winner=1
        }
        if (Player2.contains(1) && Player2.contains(2) && Player2.contains(3)){
            winner=2
        }

        //row 2
        if (Player1.contains(4) && Player1.contains(5) && Player1.contains(6)){
            winner=1
        }
        if (Player2.contains(4) && Player2.contains(5) && Player2.contains(6)){
            winner=2
        }

        //row 3
        if (Player1.contains(7) && Player1.contains(8) && Player1.contains(9)){
            winner=1
        }
        if (Player2.contains(7) && Player2.contains(8) && Player2.contains(9)){
            winner=2
        }

        //col 1
        if (Player1.contains(1) && Player1.contains(4) && Player1.contains(7)){
            winner=1
        }
        if (Player2.contains(1) && Player2.contains(4) && Player2.contains(7)){
            winner=2
        }

        //col 2
        if (Player1.contains(2) && Player1.contains(5) && Player1.contains(8)){
            winner=1
        }
        if (Player2.contains(2) && Player2.contains(5) && Player2.contains(8)){
            winner=2
        }

        //col 3
        if (Player1.contains(3) && Player1.contains(6) && Player1.contains(9)){
            winner=1
        }
        if (Player2.contains(3) && Player2.contains(6) && Player2.contains(9)){
            winner=2
        }

        if(winner != -1){
            //We have winner
            if(winner == 1){
                Toast.makeText(this, "Player1 is winner", Toast.LENGTH_LONG).show()
            }
            if(winner == 2){
                Toast.makeText(this, "Player2 is winner", Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun AutoPlay(){
        val EmptyCells: ArrayList<Int> = ArrayList()
        // Find empty cells

        for(cellID in 1..10){
            if(!(Player1.contains(cellID)) || (Player2.contains(cellID) )){
                EmptyCells.add(cellID)
            }
        }

        val r = Random()
        var RandIndex = r.nextInt(EmptyCells.size-0)+0 // if size=3, select(0,1,2)
        var cellID = EmptyCells.get(RandIndex)

        bu1.setOnClickListener{
            cellID = 1;
            tictactoyfun(bu1, cellID)
        }
        bu2.setOnClickListener{
            cellID = 2;
            tictactoyfun(bu2, cellID)
        }
        bu3.setOnClickListener{
            cellID = 3;
            tictactoyfun(bu3, cellID)
        }
        bu4.setOnClickListener{
            cellID = 4;
            tictactoyfun(bu4, cellID)
        }
        bu5.setOnClickListener{
            cellID = 5;
            tictactoyfun(bu5, cellID)
        }
        bu6.setOnClickListener{
            cellID = 6;
            tictactoyfun(bu6, cellID)
        }
        bu7.setOnClickListener{
            cellID = 7;
            tictactoyfun(bu7, cellID)
        }
        bu8.setOnClickListener{
            cellID = 8;
            tictactoyfun(bu8, cellID)
        }
        bu9.setOnClickListener { // Call a function and pass the button object
            cellID = 9;
            tictactoyfun(bu9, cellID)
        }

    }
}

