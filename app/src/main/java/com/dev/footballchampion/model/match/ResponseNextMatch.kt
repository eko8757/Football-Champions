package com.dev.footballchampion.model.match

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ResponseNextMatch {

    @SerializedName("events")
    @Expose
    var events: List<Event>? = null

    inner class Event {
        @SerializedName("idEvent")
        @Expose
        var idEvent: String? = null
        @SerializedName("idSoccerXML")
        @Expose
        private val idSoccerXML: Any? = null
        @SerializedName("strEvent")
        @Expose
        private val strEvent: String? = null
        @SerializedName("strEventAlternate")
        @Expose
        private val strEventAlternate: String? = null
        @SerializedName("strFilename")
        @Expose
        private val strFilename: String? = null
        @SerializedName("strSport")
        @Expose
        private val strSport: String? = null
        @SerializedName("idLeague")
        @Expose
        private val idLeague: String? = null
        @SerializedName("strLeague")
        @Expose
        private val strLeague: String? = null
        @SerializedName("strSeason")
        @Expose
        private val strSeason: String? = null
        @SerializedName("strDescriptionEN")
        @Expose
        private val strDescriptionEN: Any? = null
        @SerializedName("strHomeTeam")
        @Expose
        private val strHomeTeam: String? = null
        @SerializedName("strAwayTeam")
        @Expose
        private val strAwayTeam: String? = null
        @SerializedName("intHomeScore")
        @Expose
        private val intHomeScore: Any? = null
        @SerializedName("intRound")
        @Expose
        private val intRound: String? = null
        @SerializedName("intAwayScore")
        @Expose
        private val intAwayScore: Any? = null
        @SerializedName("intSpectators")
        @Expose
        private val intSpectators: Any? = null
        @SerializedName("strHomeGoalDetails")
        @Expose
        private val strHomeGoalDetails: Any? = null
        @SerializedName("strHomeRedCards")
        @Expose
        private val strHomeRedCards: Any? = null
        @SerializedName("strHomeYellowCards")
        @Expose
        private val strHomeYellowCards: Any? = null
        @SerializedName("strHomeLineupGoalkeeper")
        @Expose
        private val strHomeLineupGoalkeeper: Any? = null
        @SerializedName("strHomeLineupDefense")
        @Expose
        private val strHomeLineupDefense: Any? = null
        @SerializedName("strHomeLineupMidfield")
        @Expose
        private val strHomeLineupMidfield: Any? = null
        @SerializedName("strHomeLineupForward")
        @Expose
        private val strHomeLineupForward: Any? = null
        @SerializedName("strHomeLineupSubstitutes")
        @Expose
        private val strHomeLineupSubstitutes: Any? = null
        @SerializedName("strHomeFormation")
        @Expose
        private val strHomeFormation: Any? = null
        @SerializedName("strAwayRedCards")
        @Expose
        private val strAwayRedCards: Any? = null
        @SerializedName("strAwayYellowCards")
        @Expose
        private val strAwayYellowCards: Any? = null
        @SerializedName("strAwayGoalDetails")
        @Expose
        private val strAwayGoalDetails: Any? = null
        @SerializedName("strAwayLineupGoalkeeper")
        @Expose
        private val strAwayLineupGoalkeeper: Any? = null
        @SerializedName("strAwayLineupDefense")
        @Expose
        private val strAwayLineupDefense: Any? = null
        @SerializedName("strAwayLineupMidfield")
        @Expose
        private val strAwayLineupMidfield: Any? = null
        @SerializedName("strAwayLineupForward")
        @Expose
        private val strAwayLineupForward: Any? = null
        @SerializedName("strAwayLineupSubstitutes")
        @Expose
        private val strAwayLineupSubstitutes: Any? = null
        @SerializedName("strAwayFormation")
        @Expose
        private val strAwayFormation: Any? = null
        @SerializedName("intHomeShots")
        @Expose
        private val intHomeShots: Any? = null
        @SerializedName("intAwayShots")
        @Expose
        private val intAwayShots: Any? = null
        @SerializedName("dateEvent")
        @Expose
        private val dateEvent: String? = null
        @SerializedName("dateEventLocal")
        @Expose
        private val dateEventLocal: String? = null
        @SerializedName("strDate")
        @Expose
        private val strDate: Any? = null
        @SerializedName("strTime")
        @Expose
        private val strTime: String? = null
        @SerializedName("strTimeLocal")
        @Expose
        private val strTimeLocal: String? = null
        @SerializedName("strTVStation")
        @Expose
        private val strTVStation: Any? = null
        @SerializedName("idHomeTeam")
        @Expose
        private val idHomeTeam: String? = null
        @SerializedName("idAwayTeam")
        @Expose
        private val idAwayTeam: String? = null
        @SerializedName("strResult")
        @Expose
        private val strResult: Any? = null
        @SerializedName("strCircuit")
        @Expose
        private val strCircuit: Any? = null
        @SerializedName("strCountry")
        @Expose
        private val strCountry: Any? = null
        @SerializedName("strCity")
        @Expose
        private val strCity: Any? = null
        @SerializedName("strPoster")
        @Expose
        private val strPoster: Any? = null
        @SerializedName("strFanart")
        @Expose
        private val strFanart: Any? = null
        @SerializedName("strThumb")
        @Expose
        private val strThumb: Any? = null
        @SerializedName("strBanner")
        @Expose
        private val strBanner: Any? = null
        @SerializedName("strMap")
        @Expose
        private val strMap: Any? = null
        @SerializedName("strTweet1")
        @Expose
        private val strTweet1: Any? = null
        @SerializedName("strTweet2")
        @Expose
        private val strTweet2: Any? = null
        @SerializedName("strTweet3")
        @Expose
        private val strTweet3: Any? = null
        @SerializedName("strVideo")
        @Expose
        private val strVideo: Any? = null
        @SerializedName("strLocked")
        @Expose
        private val strLocked: String? = null

    }
}