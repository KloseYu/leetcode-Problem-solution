class Solution {
    fun dayOfTheWeek(day: Int, month: Int, year: Int): String {
       val weeks = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
       val monthdays = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30)
       var days =365 * (year - 1971) + (year - 1969) / 4
       for (i in 0 until month-1){
           days += monthdays[i]
       }

        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
            days += 1
        }
        /* 输入月份中的天数 */
        days += day
        return weeks[(days +4) % 7]

    }
    //采用calendar方法
    /* fun dayOfTheWeek(day: Int, month: Int, year: Int): String {
          val weeks = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
          val calendar = Calendar.getInstance()

        calendar.set(Calendar.YEAR, year)
        calendar.set(Calendar.MONTH, month - 1)
        calendar.set(Calendar.DAY_OF_MONTH, day)
        
       return weeks[(calendar.get(Calendar.DAY_OF_WEEK) -1)]

    }*/
}
