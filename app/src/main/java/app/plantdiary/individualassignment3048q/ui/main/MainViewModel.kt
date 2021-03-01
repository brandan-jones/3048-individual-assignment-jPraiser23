package app.plantdiary.individualassignment3048q.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment3048q.dto.Country
import service.CountryService

class MainViewModel : ViewModel() {
    var countries: MutableLiveData<ArrayList<Country>> = MutableLiveData<ArrayList<Country>>()
    var countryNames: ArrayList<String> = ArrayList<String>()
    var countryService: CountryService = CountryService()
    init{
        fetchCountries(countryName = "e")
    }

    fun fetchCountries(countryName: String){
        countries = countryService.fetchCountries(countryName)
        updateCountryNames(countries)
    }
    fun updateCountryNames(countries: MutableLiveData<ArrayList<Country>>){

    }
}
