package kodando.runtime

/**
 * Created by danfma on 22/04/17.
 */

/**
 * The Javascript Date.
 */

@JsName("Date")
external class JsDate {

    constructor()

    constructor(milliseconds: Long)

    constructor(dateString: String)

    constructor(year: Int,
                month: Int = definedExternally,
                day: Int = definedExternally,
                hours: Int = definedExternally,
                minutes: Int = definedExternally,
                seconds: Int = definedExternally,
                milliseconds: Int = definedExternally)


    /**
     * Returns the day of the month (from 1-31)
     */
    fun getDate(): Int

    /**
     * Sets the day of the month of a date object
     */
    fun setDate(value: Int)

    /**
     * Returns the day of the week (from 0-6)
     */
    fun getDay(): Int

    /**
     * Returns the year
     */
    fun getFullYear(): Int

    /**
     * Sets the year of a date object
     */
    fun setFullYear(value: Int)

    /**
     * Returns the hour (from 0-23)
     */
    fun getHours(): Int

    /**
     * Sets the hour of a date object
     */
    fun setHours(value: Int)

    /**
     * Returns the milliseconds (from 0-999)
     */
    fun getMilliseconds(): Int

    /**
     * Sets the milliseconds of a date object
     */
    fun setMilliseconds(value: Int)

    /**
     * Returns the minutes (from 0-59)
     */
    fun getMinutes(): Int

    /**
     * 	Set the minutes of a date object
     */
    fun setMinutes(value: Int)

    /**
     * Returns the month (from 0-11)
     */
    fun getMonth(): Int

    /**
     * Sets the month of a date object
     */
    fun setMonth(value: Int)

    /**
     * Returns the seconds (from 0-59)
     */
    fun getSeconds(): Int

    /**
     * Sets the seconds of a date object
     */
    fun setSeconds(value: Int)

    /**
     * Returns the number of milliseconds since midnight Jan 1 1970, and a specified date
     */
    fun getTime(): Int

    /**
     * Sets a date to a specified number of milliseconds after/before January 1, 1970
     */
    fun setTime(value: Int)

    /**
     * Returns the time difference between UTC time and local time, in minutes
     */
    fun getTimezoneOffset(): Int

    /**
     * Returns the day of the month, according to universal time (from 1-31)
     */
    fun getUTCDate(): Int

    /**
     * Sets the day of the month of a date object, according to universal time
     */
    fun setUTCDate(value: Int)

    /**
     * 	Returns the day of the week, according to universal time (from 0-6)
     */
    fun getUTCDay(): Int

    /**
     * Returns the year, according to universal time
     */
    fun getUTCFullYear(): Int

    /**
     * Sets the year of a date object, according to universal time
     */
    fun setUTCFullYear(value: Int)

    /**
     * Returns the hour, according to universal time (from 0-23)
     */
    fun getUTCHours(): Int

    /**
     * Sets the hour of a date object, according to universal time
     */
    fun setUTCHours(value: Int)

    /**
     * Returns the minutes, according to universal time (from 0-59)
     */
    fun getUTCMinutes(): Int

    /**
     * Set the minutes of a date object, according to universal time
     */
    fun setUTCMinutes(value: Int)

    /**
     * Returns the milliseconds, according to universal time (from 0-999)
     */
    fun getUTCMilliseconds(): Int

    /**
     * Sets the milliseconds of a date object, according to universal time
     */
    fun setUTCMilliseconds(value: Int)

    /**
     * Returns the month, according to universal time (from 0-11)
     */
    fun getUTCMonth(): Int

    /**
     * Sets the month of a date object, according to universal time
     */
    fun setUTCMonth(value: Int)

    /**
     * Returns the seconds, according to universal time (from 0-59)
     */
    fun getUTCSeconds(): Int

    /**
     * Set the seconds of a date object, according to universal time
     */
    fun setUTCSeconds(value: Int)

    /**
     * Converts the date portion of a Date object into a readable string
     */
    fun toDateString(): String

    /**
     * Returns the date as a string, using the ISO standard
     */
    fun toISOString(): String

    /**
     * Returns the date as a string, formatted as a JSON date
     */
    fun toJSON(): String

    /**
     * Returns the date portion of a Date object as a string, using locale conventions
     */
    fun toLocaleDateString(): String

    /**
     * Returns the time portion of a Date object as a string, using locale conventions
     */
    fun toLocaleTimeString(): String

    /**
     * Converts a Date object to a string, using locale conventions
     */
    fun toLocaleString(): String

    /**
     * Converts a Date object to a string
     */
    override fun toString(): String

    /**
     * Converts the time portion of a Date object to a string
     */
    fun toTimeString(): String

    /**
     * Converts a Date object to a string, according to universal time
     */
    fun toUTCString(): String

    /**
     * Return the primitive value of a Date object
     */
    fun valueOf(): Long


    companion object {

        /**
         * Returns the number of milliseconds since midnight Jan 1, 1970
         */
        fun now(): Long

        /**
         * Parses a date string and returns the number of milliseconds since January 1, 1970
         */
        fun parse(dateString: String): Int

        /**
         * Return the number of milliseconds between a specified date and midnight January 1 1970
         */
        fun UTC(year: Int, month: Int, date: Int): JsDate

    }

}