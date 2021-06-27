package com.example.tourdefrance

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

object DateToStage {

    @RequiresApi(Build.VERSION_CODES.O)
    val dateToStage = mapOf<LocalDate, Int>(
        LocalDate.of(2021, 6, 26) to 1,
        LocalDate.of(2021, 6, 27) to 2,
        LocalDate.of(2021, 6, 28) to 3,
        LocalDate.of(2021, 6, 29) to 4,
        LocalDate.of(2021, 6, 30) to 5,
        LocalDate.of(2021, 7, 1) to 6,
        LocalDate.of(2021, 7, 2) to 7,
        LocalDate.of(2021, 7, 3) to 8,
        LocalDate.of(2021, 7, 4) to 9,
        LocalDate.of(2021, 7, 6) to 10,
        LocalDate.of(2021, 7, 7) to 11,
        LocalDate.of(2021, 7, 8) to 12,
        LocalDate.of(2021, 7, 9) to 13,
        LocalDate.of(2021, 7, 10) to 14,
        LocalDate.of(2021, 7, 11) to 15,
        LocalDate.of(2021, 7, 13) to 16,
        LocalDate.of(2021, 7, 14) to 17,
        LocalDate.of(2021, 7, 15) to 18,
        LocalDate.of(2021, 7, 16) to 19,
        LocalDate.of(2021, 7, 17) to 20,
        LocalDate.of(2021, 7, 18) to 21
    )

}