package com.example.expensetrackerapp

import android.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedViewActivity : AppCompatActivity() {
    var days = arrayOf(
        "2024-10-07",
        "2024-10-08",
        "2024-10-09",
        "2024-10-10",
        "2024-10-11",
        "2024-10-12",
        "2024-10-13"
    )
    var morningSpending = intArrayOf(60, 12, 0, 0, 0, 0, 0)
    var afternoonSpending = intArrayOf(100, 200, 0, 0, 0, 0, 0)
    var notes = arrayOf(
        "Purchased lunch and snacks",
        "Bought coffee and study supplies",
        "No record",
        "No record",
        "No record",
        "No record",
        "Forgot wallet at home"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)
        val detailsTextView = findViewById<TextView>(R.id.detailsTextView)
        val details = StringBuilder()
        var totalSpending = 0
        var highestSpendingIndex = 0
        for (i in days.indices) {
            val dailyTotal = morningSpending[i] + afternoonSpending[i]
            totalSpending += dailyTotal
            details.append("Day: ").append(days[i]).append("\n")
            details.append("Morning: R").append(morningSpending[i]).append("\n")
            details.append("Afternoon: R").append(afternoonSpending[i]).append("\n")
            details.append("Notes: ").append(notes[i]).append("\n")
            details.append("Total: R").append(dailyTotal).append("\n\n")
            if (dailyTotal > morningSpending[highestSpendingIndex] + afternoonSpending[highestSpendingIndex]) {
                highestSpendingIndex = i
            }
        }
        val averageSpending = totalSpending / days.size.toDouble()
        details.append("Highest Spending Day: ").append(days[highestSpendingIndex]).append("\n")
        details.append("Average Daily Spending: R").append(String.format("%.2f", averageSpending))
        detailsTextView.text = details.toString()
    }
}
