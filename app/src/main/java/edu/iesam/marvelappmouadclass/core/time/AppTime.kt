package edu.iesam.marvelappmouadclass.core.time

interface AppTime {
    fun currentTimeToLong(): Long
}

class LocalAppTime : AppTime {
    override fun currentTimeToLong(): Long {
        return System.currentTimeMillis()
    }

}