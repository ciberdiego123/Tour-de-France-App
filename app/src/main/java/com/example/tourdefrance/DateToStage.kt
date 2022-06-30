package com.example.tourdefrance

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

object DateToStage {

    @RequiresApi(Build.VERSION_CODES.O)
    val dateToStage = mapOf<LocalDate, Int>(
        LocalDate.of(2022, 7, 1) to 1,
        LocalDate.of(2022, 7, 2) to 2,
        LocalDate.of(2022, 7, 3) to 3,
        LocalDate.of(2022, 7, 5) to 4,
        LocalDate.of(2022, 7, 6) to 5,
        LocalDate.of(2022, 7, 7) to 6,
        LocalDate.of(2022, 7, 8) to 7,
        LocalDate.of(2022, 7, 9) to 8,
        LocalDate.of(2022, 7, 10) to 9,
        LocalDate.of(2022, 7, 12) to 10,
        LocalDate.of(2022, 7, 13) to 11,
        LocalDate.of(2022, 7, 14) to 12,
        LocalDate.of(2022, 7, 15) to 13,
        LocalDate.of(2022, 7, 16) to 14,
        LocalDate.of(2022, 7, 17) to 15,
        LocalDate.of(2022, 7, 19) to 16,
        LocalDate.of(2022, 7, 20) to 17,
        LocalDate.of(2022, 7, 21) to 18,
        LocalDate.of(2022, 7, 22) to 19,
        LocalDate.of(2022, 7, 23) to 20,
        LocalDate.of(2022, 7, 24) to 21
    )

}
