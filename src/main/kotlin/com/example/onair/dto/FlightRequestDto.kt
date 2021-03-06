package com.example.onair.dto

import javax.persistence.Column

data class FlightRequestDto ( // data class -> equals, copy, toString, componentN
        var FlightNum: Int,
        var DepartmentAirport: String,
        var ArriveAirport: String,
        var DepartmentDate: String,
        var EconomyCharge: Int,
        var BusinessCharge: Int,
        var FirstCharge: Int
)

data class FlightInfoApiResponseDto (
        val airlineNm: String,
        val arrAirportNm: String,
        val arrPlandTime: String,
        val depAirportNm: String,
        val depPlandTime: String,
        val economyCharge: String,
        val prestigeCharge: String,
        val vihicleId: String
)

data class FlightInfoApiRequestDto (
        val numOfRows: String,
        val pageNo: String,
        val depAirportId: String,
        val arrAirportId: String,
        val depPlandTime: String,
        val airlineId: String,
)


data class AirPortApiResponseDto (
        val airportId: String,
        val airportNm: String,
)

data class AirLineApiResponseDto (
        val airlineId: String,
        val airlineNm: String,
)